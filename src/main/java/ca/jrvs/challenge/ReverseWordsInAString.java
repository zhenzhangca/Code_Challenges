package ca.jrvs.challenge;

/**
 * 151. Reverse Words in a String
 * <p>
 * Given an input string, reverse the string word by word.
 * <p>
 * Example 1:
 * Input: "the sky is blue"
 * Output: "blue is sky the"
 * <p>
 * Example 2:
 * Input: "  hello world!  "
 * Output: "world! hello"
 * Explanation: Your reversed string should not contain leading or trailing spaces.
 * <p>
 * Example 3:
 * Input: "a good   example"
 * Output: "example good a"
 * Explanation: You need to reduce multiple spaces between two words to a single space in the reversed string.
 */
public class ReverseWordsInAString {
    public static String reverseWords(String s) {
        StringBuffer sb = new StringBuffer();
        String[] arr = s.trim().split("\\s+");
        for (int i = arr.length - 1; i >= 0; i--) {
            sb.append(arr[i]).append(" ");
        }
        return sb.toString().trim();
    }
}
