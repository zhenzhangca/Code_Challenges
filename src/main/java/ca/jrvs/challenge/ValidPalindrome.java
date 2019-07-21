package ca.jrvs.challenge;

/**
 * 125. Valid Palindrome
 *
 * Given a string, determine if it is a palindrome, considering only alphanumeric characters and ignoring cases.
 *
 * Note: For the purpose of this problem, we define empty string as valid palindrome.
 *
 * Example 1:
 * Input: "A man, a plan, a canal: Panama"
 * Output: true
 *
 * Example 2:
 * Input: "race a car"
 * Output: false
 */
public class ValidPalindrome {
    public static boolean isPalindrome(String s) {
        int start=0;
        int end=s.length()-1;
        while(start<=end){
            while(start<=end&&!Character.isLetterOrDigit(s.charAt(start))){
                start++;
            }
            while(start<=end&&!Character.isLetterOrDigit(s.charAt(end))){
                end--;
            }
            if(start<=end&&Character.toLowerCase(s.charAt(start))!=Character.toLowerCase(s.charAt(end))){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}
