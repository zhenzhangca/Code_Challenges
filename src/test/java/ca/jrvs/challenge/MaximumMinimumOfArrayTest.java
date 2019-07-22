package ca.jrvs.challenge;

import org.junit.Test;

import static org.junit.Assert.*;

public class MaximumMinimumOfArrayTest {

    @Test
    public void largestAndSmallest() {
        int[] results1 = MaximumMinimumOfArray.largestAndSmallest(new int[]{-20, 34, 21, -87, 92});
        assertEquals(-87, results1[0]);
        assertEquals(92, results1[1]);
        int[] results2 = MaximumMinimumOfArray.largestAndSmallest(new int[]{10, Integer.MIN_VALUE, -2});
        assertEquals(-2147483648,results2[0]);
        assertEquals(10, results2[1]);
    }
}