package ca.jrvs.challenge;

import org.junit.Test;

import static org.junit.Assert.*;

public class MissingNumberTest {

    @Test
    public void missingNumber1() {
        int result1 = MissingNumber.missingNumber1(new int[]{3, 0, 1});
        int result2 = MissingNumber.missingNumber1(new int[]{9, 6, 4, 2, 3, 5, 7, 0, 1});
        assertEquals(2, result1);
        assertEquals(8, result2);
    }

    @Test
    public void missingNumber2() {
        int result1 = MissingNumber.missingNumber2(new int[]{3, 0, 1});
        int result2 = MissingNumber.missingNumber2(new int[]{9, 6, 4, 2, 3, 5, 7, 0, 1});
        assertEquals(2, result1);
        assertEquals(8, result2);
    }
}