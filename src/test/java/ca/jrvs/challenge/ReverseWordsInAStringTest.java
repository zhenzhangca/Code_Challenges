package ca.jrvs.challenge;

import org.junit.Test;

import static org.junit.Assert.*;

public class ReverseWordsInAStringTest {

    @Test
    public void reverseWords() {
        String result1 = ReverseWordsInAString.reverseWords("the sky is blue");
        String result2 = ReverseWordsInAString.reverseWords("  hello world!  ");
        String result3 = ReverseWordsInAString.reverseWords("a good   example");
        assertEquals("blue is sky the", result1);
        assertEquals("world! hello", result2);
        assertEquals("example good a", result3);
    }
}