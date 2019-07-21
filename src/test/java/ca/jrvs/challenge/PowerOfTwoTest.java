package ca.jrvs.challenge;

import org.junit.Test;

import static org.junit.Assert.*;

public class PowerOfTwoTest {

    @Test
    public void isPowerOfTwo() {
        boolean result1 = PowerOfTwo.isPowerOfTwo(1);
        boolean result2 = PowerOfTwo.isPowerOfTwo(16);
        boolean result3 = PowerOfTwo.isPowerOfTwo(218);
        assertTrue(result1);
        assertTrue(result2);
        assertFalse(result3);
    }

    @Test
    public void isPowerOfTwoRecursion() {
        boolean result1 = PowerOfTwo.isPowerOfTwoRecursion(1);
        boolean result2 = PowerOfTwo.isPowerOfTwoRecursion(16);
        boolean result3 = PowerOfTwo.isPowerOfTwoRecursion(218);
        assertTrue(result1);
        assertTrue(result2);
        assertFalse(result3);
    }
}