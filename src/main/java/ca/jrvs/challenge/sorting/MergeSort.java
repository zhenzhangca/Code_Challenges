package ca.jrvs.challenge.sorting;

public class MergeSort {
    public static int[] mergeSort(int[] array){
        if(array == null || array.length == 0){
            return array;
        }
        int[] helper = new int[array.length];
        mergeSort(array, 0, array.length - 1, helper);
        return array;
    }
    private static void mergeSort(int[] array, int left, int right, int[] helper){
        //base case
        if(left >= right){
            return;
        }
        int mid = left + (right - left) / 2;//avoid overflow
        //recursion rules
        mergeSort(array, left, mid, helper);
        mergeSort(array, mid + 1, right, helper);
        for(int i = left; i <= right;i++){
            helper[i] = array[i];
        }
        int i = left;
        int j = mid + 1;
        int k = left;
        while(i <= mid && j <= right){
            if(helper[i] < helper[j]){
                array[k] = helper[i];
                i++;
            }else{
                array[k] = helper[j];
                j++;
            }
            k++;
        }
        while(i <= mid){
            array[k] = helper[i];
            i++;
            k++;
        }

    }

    public static void main(String[] args) {
        int[] array = {9,4,2,34,0,-19};
        for(int i : array){
            System.out.print(i +"--");
        }
        System.out.println();
        int[] sortedArray = mergeSort(array);
        for(int i : array){
            System.out.print(i+"--");
        }
    }
}
