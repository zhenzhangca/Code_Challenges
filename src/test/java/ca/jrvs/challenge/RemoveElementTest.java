package ca.jrvs.challenge;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class RemoveElementTest {

    @Test
    public void removeElement() {
        int result1 = RemoveElement.removeElement(new int[]{3, 2, 2, 3}, 3);
        int result2 = RemoveElement.removeElement(new int[]{0, 1, 2, 2, 3, 0, 4, 2}, 2);
        Assert.assertEquals(2, result1);
        Assert.assertEquals(5, result2);
    }
}