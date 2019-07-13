package ca.jrvs.challenge;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ValidPalindromeTest {

    @Test
    public void isPalindrome() {
        boolean result1 = ValidPalindrome.isPalindromeNormal("A man, a plan, a canal: Panama");
        boolean result2 = ValidPalindrome.isPalindromeNormal("race a car");
        Assert.assertTrue(result1);
        Assert.assertFalse(result2);
    }
}