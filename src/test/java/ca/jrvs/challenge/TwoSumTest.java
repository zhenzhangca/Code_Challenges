package ca.jrvs.challenge;

import org.junit.Test;

import static org.junit.Assert.*;

public class TwoSumTest {

    @Test
    public void twoSum() {
        int[] result = TwoSum.twoSum(new int[]{2, 7, 11, 15}, 9);
        int[] expectArray = new int[]{0, 1};
        assertEquals(expectArray.length, result.length);
        for (int i = 0; i < expectArray.length; i++) {
            assertEquals(expectArray[i], result[i]);
        }
    }
}