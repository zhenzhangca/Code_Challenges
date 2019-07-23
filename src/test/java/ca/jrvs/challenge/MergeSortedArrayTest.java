package ca.jrvs.challenge;

import org.junit.Test;

import java.lang.reflect.Array;
import java.util.Arrays;

import static org.junit.Assert.*;

public class MergeSortedArrayTest {

    @Test
    public void merge() {
        int[] num1 = new int[]{1,2,3,0,0,0};
        int[] num2 = new int[]{2,5,6};
        MergeSortedArray.merge(num1,3,num2,3);
        int[] expect = new int[]{1,2,2,3,5,6};
        assertEquals(Arrays.toString(expect), Arrays.toString(num1));
    }
}