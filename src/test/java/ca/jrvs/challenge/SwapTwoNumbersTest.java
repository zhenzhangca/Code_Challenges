package ca.jrvs.challenge;

import org.junit.Test;

import static org.junit.Assert.*;

public class SwapTwoNumbersTest {

    @Test
    public void swapTwoNumbers() {
        int x = 10;
        int y = 1;
        int[] results = SwapTwoNumbers.swapTwoNumbers(x, y);
        assertEquals(1, results[0]);
        assertEquals(10, results[1]);
    }
}