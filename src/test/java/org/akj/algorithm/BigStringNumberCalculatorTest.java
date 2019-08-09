package org.akj.algorithm;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.math.BigInteger;
import java.security.InvalidParameterException;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class BigStringNumberCalculatorTest {

    private BigStringNumberCalculator calculator = null;

    @BeforeEach
    public void setup() {
        calculator = new BigStringNumberCalculator();
    }

    @Test
    void add() {
        String arg1 = "234456577687512312312321756";
        String arg2 = "12324242";
        String result = calculator.add(arg1, arg2);
        BigInteger expected = new BigInteger(arg1).add(new BigInteger(arg2));

        assertEquals(expected, new BigInteger(result));
        //System.out.println("expected: " + expected + ", actual: " + result);

    }

    @Test
    void subtract() {
        String arg1 = "787987979879873498739875";
        String arg2 = "8112009808909709890009";
        String result = calculator.subtract(arg1, arg2);

        BigInteger expected = new BigInteger(arg1).subtract(new BigInteger(arg2));
        //System.out.println("expected: " + expected + ", actual: " + result);
        assertEquals(expected, new BigInteger(result));

    }

    @Test
    public void testExceptionalCase(){
        assertThrows(InvalidParameterException.class,()->{
            calculator.add(null,null);
        });

        assertThrows(InvalidParameterException.class,()->{
            calculator.add("123456",null);
        });

        assertThrows(InvalidParameterException.class,()->{
            calculator.add("123456","werwerwewer");
        });

        assertThrows(InvalidParameterException.class,()->{
            calculator.subtract("xxxx","123456");
        });

        assertThrows(InvalidParameterException.class,()->{
            calculator.subtract("-123","123456");
        });
    }

    @Test
    public void testSubtractReturnZero(){
        String arg1 = "789899092342343423423";
        String arg2 = "789899092342343423423";
        String result = calculator.subtract(arg1, arg2);

        BigInteger expected = new BigInteger("0");
        //System.out.println("expected: " + expected + ", actual: " + result);
        assertEquals(expected, new BigInteger(result));
    }
}