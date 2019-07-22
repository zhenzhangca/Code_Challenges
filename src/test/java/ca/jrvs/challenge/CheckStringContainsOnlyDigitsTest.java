package ca.jrvs.challenge;

import org.junit.Test;

import static org.junit.Assert.*;

public class CheckStringContainsOnlyDigitsTest {

    @Test
    public void containsOnlyDigits() {
        boolean result1 = CheckStringContainsOnlyDigits.containsOnlyDigits("123456");
        boolean result2 = CheckStringContainsOnlyDigits.containsOnlyDigits("1et2334");
        assertTrue(result1);
        assertFalse(result2);
    }

    @Test
    public void containsOnlyDigitsRegex() {
        boolean result1 = CheckStringContainsOnlyDigits.containsOnlyDigitsRegex("123456");
        boolean result2 = CheckStringContainsOnlyDigits.containsOnlyDigitsRegex("1et2334");
        assertTrue(result1);
        assertFalse(result2);
    }
}