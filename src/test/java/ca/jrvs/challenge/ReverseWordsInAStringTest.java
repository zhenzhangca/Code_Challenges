package ca.jrvs.challenge;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ReverseWordsInAStringTest {

    @Test
    public void reverseWords() {
        String result1 = ReverseWordsInAString.reverseWords("the sky is blue");
        String result2 = ReverseWordsInAString.reverseWords("  hello world!  ");
        String result3 = ReverseWordsInAString.reverseWords("a good   example");
        Assert.assertEquals("blue is sky the", result1);
        Assert.assertEquals("world! hello", result2);
        Assert.assertEquals("example good a", result3);
    }
}