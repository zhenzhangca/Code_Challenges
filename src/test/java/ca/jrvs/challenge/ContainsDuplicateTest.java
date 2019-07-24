package ca.jrvs.challenge;

import org.junit.Test;

import static org.junit.Assert.*;

public class ContainsDuplicateTest {

    @Test
    public void containsDuplicate() {
        boolean result1 = ContainsDuplicate.containsDuplicate(new int[]{1, 2, 3, 1});
        boolean result2 = ContainsDuplicate.containsDuplicate(new int[]{1, 2, 3, 4});
        boolean result3 = ContainsDuplicate.containsDuplicate(new int[]{1, 1, 1, 3, 3, 4, 3, 2, 4, 2});
        assertTrue(result1);
        assertFalse(result2);
        assertTrue(result3);
    }
}