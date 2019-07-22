package ca.jrvs.challenge;

/**
 * 204. Count Primes
 *
 * Count the number of prime numbers less than a non-negative number, n.
 *
 * Example:
 * Input: 10
 * Output: 4
 * Explanation: There are 4 prime numbers less than 10, they are 2, 3, 5, 7.
 */
public class CountPrimes {
    public static int countPrimes(int n) {
        if (n <= 2){
            return 0;
        }
        boolean[] notPrime = new boolean[n];
        int count = 1;

        for (int i = 3; i < n; i+=2){
            if (!notPrime[i]) {
                count++;
                for (int j = 3; i*j < n; j+=2){
                    notPrime[i*j] = true;
                }
            }
        }
        return count;
    }

}
