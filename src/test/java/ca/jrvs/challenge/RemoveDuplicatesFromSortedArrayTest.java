package ca.jrvs.challenge;

import org.junit.Test;

import static org.junit.Assert.*;

public class RemoveDuplicatesFromSortedArrayTest {

    @Test
    public void removeDuplicates() {
        int[] input1 = {1,1,2};
        int result1 = RemoveDuplicatesFromSortedArray.removeDuplicates(input1);
        assertEquals(2, result1);
        int[] input2 = {0,0,1,1,1,2,2,3,3,4};
        int result2 = RemoveDuplicatesFromSortedArray.removeDuplicates(input2);
        assertEquals(5,result2);
    }
}