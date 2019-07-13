package ca.jrvs.challenge;

import org.junit.Assert;
import org.junit.Test;

public class ValidAnagramTest {

    @Test
    public void isAnagram() {
        boolean result1 = ValidAnagram.isAnagram("anagram", "nagaram");
        boolean result2 = ValidAnagram.isAnagram("rat", "car");
        Assert.assertTrue(result1);
        Assert.assertFalse(result2);
    }
}