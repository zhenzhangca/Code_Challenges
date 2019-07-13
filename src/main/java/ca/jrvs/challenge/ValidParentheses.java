package ca.jrvs.challenge;

import java.util.Stack;

/**
 * 20. Valid Rarentheses
 * Given a string containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
 * <p>
 * An input string is valid if:
 * <p>
 * 1. Open brackets must be closed by the same type of brackets.
 * <p>
 * 2. Open brackets must be closed in the correct order.
 * <p>
 * Note that an empty string is also considered valid.
 * <p>
 * e.g. Input: "()", Output: true
 * <p>
 * e.g. Input: "()[]{}", Output: true
 * <p>
 * e.g. Input: "(]", Output: false
 * <p>
 * e.g. Input: "([)]", Output: false
 * <p>
 * e.g. Input: "{[]}", Output: true
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
