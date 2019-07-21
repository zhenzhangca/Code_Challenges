package ca.jrvs.challenge;

/**
 * 231. Power of Two
 * <p>
 * Given an integer, write a function to determine if it is a power of two.
 * <p>
 * Example 1:
 * Input: 1
 * Output: true
 * Explanation: 20 = 1
 * <p>
 * Example 2:
 * Input: 16
 * Output: true
 * Explanation: 24 = 16
 * <p>
 * Example 3:
 * Input: 218
 * Output: false
 */
public class PowerOfTwo {
    public static boolean isPowerOfTwo(int n) {
        if (n <= 0) return false;
        while (n % 2 == 0) n /= 2;
        return n == 1;
    }

    public static boolean isPowerOfTwoRecursion(int n) {
        if (n == 1 || n == 2)
            return true;
        else if (n == 0 || n % 2 == 1)
            return false;
        else {
            return isPowerOfTwoRecursion(n / 2);
        }
    }
}
