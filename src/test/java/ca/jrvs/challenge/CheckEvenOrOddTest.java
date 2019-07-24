package ca.jrvs.challenge;

import org.junit.Test;

import static org.junit.Assert.*;

public class CheckEvenOrOddTest {

    @Test
    public void checkEvenOrOddModulo() {
        String result1 = CheckEvenOrOdd.checkEvenOrOddModulo(15);
        String result2 = CheckEvenOrOdd.checkEvenOrOddModulo(16);
        assertEquals("odd", result1);
        assertEquals("even", result2);
    }

    @Test
    public void checkEvenOrOddBit() {
        String result1 = CheckEvenOrOdd.checkEvenOrOddBit(15);
        String result2 = CheckEvenOrOdd.checkEvenOrOddBit(16);
        assertEquals("odd", result1);
        assertEquals("even", result2);
    }
}