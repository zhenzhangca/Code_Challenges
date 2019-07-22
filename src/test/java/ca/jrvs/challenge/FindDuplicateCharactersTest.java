package ca.jrvs.challenge;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class FindDuplicateCharactersTest {

    @Test
    public void findDuplicateCharacters() {
        Character[] result1 = FindDuplicateCharacters.findDuplicateCharacters("Programming");
        Character[] result2 = FindDuplicateCharacters.findDuplicateCharacters("Java");
        assertEquals("[r, g, m]", Arrays.toString(result1));
        assertEquals("[a]", Arrays.toString(result2));

    }
}