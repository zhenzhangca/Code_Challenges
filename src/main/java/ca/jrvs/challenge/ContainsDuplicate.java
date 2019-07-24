package ca.jrvs.challenge;

import java.util.Arrays;

/**
 * 217. Contains Duplicate
 * <p>
 * Given an array of integers, find if the array contains any duplicates.
 * <p>
 * Your function should return true if any value appears at least twice in the array, and it should return false if every element is distinct.
 * <p>
 * Example 1:
 * Input: [1,2,3,1]
 * Output: true
 * <p>
 * Example 2:
 * Input: [1,2,3,4]
 * Output: false
 * <p>
 * Example 3:
 * Input: [1,1,1,3,3,4,3,2,4,2]
 * Output: true
 */
public class ContainsDuplicate {
    public static boolean containsDuplicate(int[] nums) {
        // Sort nums
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 1; i++) {
            // Check if the element next to the current element is equal or not
            // If it is equal, then the array contains duplicate
            if (nums[i] == nums[i + 1]) {
                return true;
            }
        }
        return false;
    }
}
