package ca.jrvs.challenge;

/**
 * 509. Fibonacci number
 * The Fibonacci numbers, commonly denoted F(n) form a sequence, called the Fibonacci sequence, such that each number is the sum of the two preceding ones, starting from 0 and 1. That is,
 * <p>
 * F(0) = 0,   F(1) = 1
 * F(N) = F(N - 1) + F(N - 2), for N > 1.
 * Given N, calculate F(N).
 * <p>
 * Example 1:
 * Input: 2
 * Output: 1
 * Explanation: F(2) = F(1) + F(0) = 1 + 0 = 1.
 * <p>
 * Example 2:
 * Input: 3
 * Output: 2
 * Explanation: F(3) = F(2) + F(1) = 1 + 1 = 2.
 * <p>
 * Example 3:
 * Input: 4
 * Output: 3
 * Explanation: F(4) = F(3) + F(2) = 2 + 1 = 3.
 * <p>
 * Note:
 * 0 <= N <= 30.
 */
public class FibonacciNumber {
    public int fibRecursion(int N) {
        if (N <= 0) {
            return 0;
        }
        if (N == 1) {
            return 1;
        }
        return fibRecursion(N - 1) + fibRecursion(N - 2);
    }

    public int fibDP(int N) {
        if (N <= 0) {
            return 0;
        }
        int[] arr = new int[N + 1];
        arr[1] = 1;
        for (int i = 2; i <= N; i++) {
            arr[i] = arr[i - 2] + arr[i - 1];
        }
        return arr[N];
    }
}
