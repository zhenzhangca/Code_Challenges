package ca.jrvs.challenge;

import java.util.Arrays;

/**
 * 268. Missing Number
 *
 * Given an array containing n distinct numbers taken from 0, 1, 2, ..., n, find the one that is missing from the array.
 *
 * Example 1:
 * Input: [3,0,1]
 * Output: 2
 *
 * Example 2:
 * Input: [9,6,4,2,3,5,7,0,1]
 * Output: 8
 */
public class MissingNumber {
    public static int missingNumber1(int[] nums) {
        Arrays.sort(nums);
        int i;
        for(i = 0; i < nums.length + 1; i++){
            if(i < nums.length && nums[i] == i) {
                continue;
            }else {
                break;
            }
        }
        return i;
    }
    public static int missingNumber2(int[] nums) {
        int sum=0;
        for (int i=0; i<nums.length; i++){
            sum+=nums[i];
        }
        int actualsum=0;
        for (int i=1; i<=nums.length; i++){
            actualsum+=i;
        }
        return actualsum-sum;
    }

}
