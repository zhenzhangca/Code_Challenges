package ca.jrvs.challenge;

import org.junit.Assert;
import org.junit.Test;

public class TwoSumTest {

    @Test
    public void twoSum() {
        int[] arr = new int[]{2, 7, 11, 15};
        int target = 9;
        int[] result = TwoSum.twoSum(arr, target);
        Assert.assertArrayEquals(new int[]{0, 1}, result);
    }
}