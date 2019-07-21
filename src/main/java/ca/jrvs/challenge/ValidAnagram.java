package ca.jrvs.challenge;

import java.util.Arrays;

/**
 * 242. Valid Anagram
 *
 * Given two strings s and t , write a function to determine if t is an anagram of s.
 *
 * Example 1:
 * Input: s = "anagram", t = "nagaram"
 * Output: true
 *
 * Example 2:
 * Input: s = "rat", t = "car"
 * Output: false
 */
public class ValidAnagram {
    public static boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
        if(s.length()==0&&t.length()==0){
            return true;
        }
        char[] arrs = s.toCharArray();
        char[] arrt = t.toCharArray();
        Arrays.sort(arrs);
        Arrays.sort(arrt);
        for(int i =0;i<arrs.length;i++){
            if(arrs[i]!=arrt[i]){
                return false;
            }
        }
        return true;
    }
}
