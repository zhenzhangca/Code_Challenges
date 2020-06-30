package ca.jrvs.challenge.binarysearch;
/**
 * First occurrence
 * sorted array
 * int[] array = {0,1,3,4,4,4,4,5,5,5,6}
 * int target = 4, return 3
 * int target = 5, return 7
 */
public class FirstOccurrence {
    public static int firstOccurrence(int[] array, int target){
        if(array == null || array.length == 0){
            return -1;
        }
        int left = 0;
        int right = array.length - 1;
        while(left < right - 1){
            int mid = left + (right - left) / 2;
            if(array[mid] == target){
                right = mid;
            }else if(array[mid] > target){
                right = mid - 1;
            }else{
                left = mid + 1;
            }
        }
        if(array[left] == target){
            return left;
        }
        if(array[right] == target){
            return right;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] array = {0,1,3,4,4,4,4,5,5,5,6};
        int target1 = 4;
        int target2 = 5;
        int target3 = 2;
        System.out.println(firstOccurrence(array, target1)); //3
        System.out.println(firstOccurrence(array, target2)); //7
        System.out.println(firstOccurrence(array, target3)); //-1
    }

}
