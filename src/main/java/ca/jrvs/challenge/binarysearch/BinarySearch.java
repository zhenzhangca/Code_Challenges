package ca.jrvs.challenge.binarysearch;

/**
 * Classic BS
 * sorted array, find the index of target
 * int[] array = {1,3, 5, 8, 11}
 * int target = 3
 * return 2
 * int target = 9
 * return -1
 * T = O(log N)
 * S = O(1)
 */
public class BinarySearch {
    public static int bs(int[] array, int target){
        if(array == null || array.length == 0){
            return -1;
        }
        int left = 0;
        int right = array.length - 1;
        while(left <= right){
            int mid = left + (right - left) / 2;
            if(array[mid] == target){
                return mid;
            }else if(array[mid] > target){
                right = mid - 1;
            }else{
                left = mid + 1;
            }
        }
        return -1;
    }
    public static void main(String[] args){
        int[] array = {1,3, 5, 8, 11};
        int target = 9;
        System.out.println(bs(array, target));
    }

}
