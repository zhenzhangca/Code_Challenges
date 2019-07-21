package ca.jrvs.challenge;

import java.util.Stack;

/**
 * 20. Valid Parentheses
 * <p>
 * Given a string containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
 * <p>
 * An input string is valid if:
 * <p>
 * Open brackets must be closed by the same type of brackets.
 * Open brackets must be closed in the correct order.
 * Note that an empty string is also considered valid.
 * <p>
 * Example 1:
 * Input: "()"
 * Output: true
 * <p>
 * Example 2:
 * Input: "()[]{}"
 * Output: true
 * <p>
 * Example 3:
 * Input: "(]"
 * Output: false
 * <p>
 * Example 4:
 * Input: "([)]"
 * Output: false
 * <p>
 * Example 5:
 * Input: "{[]}"
 * Output: true
 */
public class ValidParentheses {
    public static boolean isValid(String s) {
        char[] arr = s.toCharArray();
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < arr.length; i++) {
            switch (arr[i]) {
                case ')':
                    if (stack.empty() || stack.pop() != '(')
                        return false;
                    break;
                case '}':
                    if (stack.empty() || stack.pop() != '{')
                        return false;
                    break;
                case ']':
                    if (stack.empty() || stack.pop() != '[')
                        return false;
                    break;
                default:
                    stack.push(arr[i]);
            }
        }
        return stack.isEmpty();
    }
}
