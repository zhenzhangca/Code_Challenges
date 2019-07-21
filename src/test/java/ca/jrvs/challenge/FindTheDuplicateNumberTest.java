package ca.jrvs.challenge;

import org.junit.Test;

import static org.junit.Assert.*;

public class FindTheDuplicateNumberTest {

    @Test
    public void findDuplicate() {
        int result1 = FindTheDuplicateNumber.findDuplicate(new int[]{1, 3, 4, 2, 2});
        int result2 = FindTheDuplicateNumber.findDuplicate(new int[]{3,1,3,4,2});
        assertEquals(2,result1);
        assertEquals(3,result2);

    }
}