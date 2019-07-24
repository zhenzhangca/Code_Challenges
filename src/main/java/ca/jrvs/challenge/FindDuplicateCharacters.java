package ca.jrvs.challenge;

import java.util.*;

/**
 * Find duplicate characters from a given string
 *
 * @return Character[]
 */
public class FindDuplicateCharacters {
    public static Character[] findDuplicateCharacters(String str) {
        List<Character> result = new ArrayList<>();
        char[] chars = str.toCharArray();
        // Build HashMap with character and number of times they appear in String
        Map<Character, Integer> charMap = new HashMap<Character, Integer>();
        for (Character ch : chars) {
            if (charMap.containsKey(ch)) {
                charMap.put(ch, charMap.get(ch) + 1);
            } else {
                charMap.put(ch, 1);
            }
        }
        // Iterate through HashMap to save all duplicate characters of String into an array
        Set<Map.Entry<Character, Integer>> entrySet = charMap.entrySet();
        for (Map.Entry<Character, Integer> entry : entrySet) {
            if (entry.getValue() > 1) {
                result.add(entry.getKey());
            }
        }
        return result.toArray(new Character[result.size()]);
    }
}