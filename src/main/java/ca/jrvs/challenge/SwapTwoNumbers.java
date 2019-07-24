package ca.jrvs.challenge;

/**
 * Swap two numbers without using the third variable
 */
public class SwapTwoNumbers {
    public static int[] swapTwoNumbers(int x, int y) {
        int[] arr = new int[2];
        x = x + y;
        y = x - y;
        x = x - y;
        arr[0] = x;
        arr[1] = y;
        return arr;
    }
}
