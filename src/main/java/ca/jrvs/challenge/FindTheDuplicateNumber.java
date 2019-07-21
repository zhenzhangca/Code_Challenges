package ca.jrvs.challenge;

/**
 * 287. Find the Duplicate Number
 *
 * Given an array nums containing n + 1 integers where each integer is between 1 and n (inclusive), prove that at least one duplicate number must exist. Assume that there is only one duplicate number, find the duplicate one.
 *
 * Example 1:
 * Input: [1,3,4,2,2]
 * Output: 2
 *
 * Example 2:
 * Input: [3,1,3,4,2]
 * Output: 3
 */
public class FindTheDuplicateNumber {
    public static int findDuplicate(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int i = 0;
        while (i < nums.length) {
            if (nums[i] - 1 != i && nums[nums[i] - 1] == nums[i]) {
                return nums[i];
            } else if (nums[i] - 1 == i) {
                i++;
            } else {
                swap(nums, i, nums[i] - 1);
            }
        }
        return -1;
    }
    private static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
