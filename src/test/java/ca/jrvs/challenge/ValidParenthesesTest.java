package ca.jrvs.challenge;

import org.junit.Assert;
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
        Assert.assertTrue(result1);
        Assert.assertTrue(result2);
        Assert.assertFalse(result3);
        Assert.assertFalse(result4);
        Assert.assertTrue(result5);
    }
}