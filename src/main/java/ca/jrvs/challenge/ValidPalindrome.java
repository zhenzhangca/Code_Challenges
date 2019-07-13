package ca.jrvs.challenge;

/**
 * 125. Valid Palindrome
 * Given a string, determine if it is a palindrome, considering only alphanumeric characters and ignoring cases.
 * <p>
 * Note: For the purpose of this problem, we define empty string as valid palindrome.
 * <p>
 * Input: "A man, a plan, a canal: Panama"
 * <p>
 * Output: true
 * <p>
 * Input: "race a car"
 * <p>
 * Output: false
 */
public class ValidPalindrome {
    /**
     * Normal method
     */
    public static boolean isPalindromeNormal(String s) {
        int start = 0;
        int end = s.length() - 1;
        while (start <= end) {
            while (start <= end && !Character.isLetterOrDigit(s.charAt(start))) {
                start++;
            }
            while (start <= end && !Character.isLetterOrDigit(s.charAt(end))) {
                end--;
            }
            if (start <= end && Character.toLowerCase(s.charAt(start)) != Character.toLowerCase(s.charAt(end))) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    /**
     * Recursive method
     */
    public boolean isPalindromeRecursive(String s) {
        return true;
    }

}
