package ca.jrvs.challenge;

import org.junit.Assert;
import org.junit.Test;

public class RemoveDuplicatesfromSortedArrayTest {

    @Test
    public void removeDuplicates() {
        int result1 = RemoveDuplicatesfromSortedArray.removeDuplicates(new int[]{1, 1, 2});
        int result2 = RemoveDuplicatesfromSortedArray.removeDuplicates(new int[]{0, 0, 1, 1, 1, 2, 2, 3, 3, 4});
        Assert.assertEquals(2, result1);
        Assert.assertEquals(5, result2);
    }
}