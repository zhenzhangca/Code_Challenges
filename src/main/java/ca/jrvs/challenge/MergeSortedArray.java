package ca.jrvs.challenge;

/**
 * 88. Merge Sorted Array
 * <p>
 * Given two sorted integer arrays nums1 and nums2, merge nums2 into nums1 as one sorted array.
 * <p>
 * Note:
 * <p>
 * The number of elements initialized in nums1 and nums2 are m and n respectively.
 * You may assume that nums1 has enough space (size that is greater or equal to m + n) to hold additional elements from nums2.
 * <p>
 * Example:
 * Input:
 * nums1 = [1,2,3,0,0,0], m = 3
 * nums2 = [2,5,6],       n = 3
 * <p>
 * Output: [1,2,2,3,5,6]
 */
public class MergeSortedArray {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        if (n < 1 && m < 1) {
            return;
        }
        int[] nums3 = nums1.clone();
        // Since the question wants to directly change nums1, we let nums3 be a clone of nums1 from where we will get our numbers from without fearing our values getting change from nums1 being change
        int i = 0, j = 0; // let i be index point for nums1 and j be index pointer for nums2
        while (i + j < nums1.length) {
            // If we have used up all numbers from nums2
            // or we still have number from nums3 such that that nums3[i] < nums2[j]
            if (j >= n || (i < m && nums3[i] < nums2[j])) {
                nums1[i + j] = nums3[i++]; // increment i after assigning its current nums3[i] to nums1[i+j]
            } else {
                nums1[i + j] = nums2[j++]; // increment j after assigning its current nums2[j] to nums1[i+j]
            }
        }
    }
}
