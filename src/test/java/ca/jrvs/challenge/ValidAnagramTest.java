package ca.jrvs.challenge;

import org.junit.Test;

import static org.junit.Assert.*;

public class ValidAnagramTest {

    @Test
    public void isAnagram() {
        boolean result1 = ValidAnagram.isAnagram("anagram", "nagaram");
        boolean result2 = ValidAnagram.isAnagram("rat", "car");
        assertTrue(result1);
        assertFalse(result2);
    }
}