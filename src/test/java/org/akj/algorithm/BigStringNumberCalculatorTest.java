package org.akj.algorithm;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.math.BigInteger;

import static org.junit.jupiter.api.Assertions.assertEquals;

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
}