package ca.jrvs.challenge;

/**
 * Find largest and smallest number from an unsorted integer array in Java.
 */
public class MaximumMinimumOfArray {
    public static int[] largestAndSmallest(int[] numbers) {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for (int number : numbers) {
            if (number > largest) {
                largest = number;
            } else if (number < smallest) {
                smallest = number;
            }
        }
        return new int[]{smallest, largest};
    }
}