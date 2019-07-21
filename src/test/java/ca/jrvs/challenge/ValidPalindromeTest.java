package ca.jrvs.challenge;

import org.junit.Test;

import static org.junit.Assert.*;

public class ValidPalindromeTest {

    @Test
    public void isPalindrome() {
        boolean result1 = ValidPalindrome.isPalindrome("A man, a plan, a canal: Panama");
        boolean result2 = ValidPalindrome.isPalindrome("race a car");
        assertTrue(result1);
        assertFalse(result2);
    }
}