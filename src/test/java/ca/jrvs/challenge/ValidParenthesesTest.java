package ca.jrvs.challenge;

import org.junit.Test;

import static org.junit.Assert.*;

public class ValidParenthesesTest {

    @Test
    public void isValid() {
        boolean result1 = ValidParentheses.isValid("()");
        boolean result2 = ValidParentheses.isValid("()[]{}");
        boolean result3 = ValidParentheses.isValid("(]");
        boolean result4 = ValidParentheses.isValid("([)]");
        boolean result5 = ValidParentheses.isValid("{[]}");
        assertTrue(result1);
        assertTrue(result2);
        assertFalse(result3);
        assertFalse(result4);
        assertTrue(result5);
    }
}