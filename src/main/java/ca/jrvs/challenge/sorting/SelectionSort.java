package ca.jrvs.challenge.sorting;

/**
 * int[] array = {7,13,1,0,-55}
 * output: {-55,0, 1, 7,13 }
 */
public class SelectionSort {
    public static int[] selectionSort(int[] array){
        if(array == null || array.length == 0){
            return array;
        }
        for(int i = 0; i < array.length - 1; i++){ //no need to compare when only one ele is left
            int globalMin = i;
            for(int j = i; j < array.length; j++){
                if(array[j] < array[globalMin]){
                    globalMin = j;
                }
            }
            swap(array, i, globalMin);
        }
        return array;
    }
    private static void swap(int[] array, int i, int j){
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    public static void main(String[] args) {
        int[] array = {7,13,1,0,-55};
        int[] newArray = selectionSort(array);
        for(int i: newArray){
            System.out.print(i + "-");
        }
    }
}
