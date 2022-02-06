package leetcode.interview;

import java.util.Arrays;

/**
 * Given two strings s and t, return true if t is an anagram of s, and false otherwise.
 * <p>
 * An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.
 */
public class ValidAnagram {

    public static boolean isAnagramSorting(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        char[] arrT = t.toCharArray();
        char[] arrS = s.toCharArray();

        Arrays.sort(arrT);
        Arrays.sort(arrS);

        return Arrays.equals(arrT, arrS);
    }

    public static boolean isAnagramCounting(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        char[] arrT = t.toCharArray();
        for (char c : arrT) {
            if (s.indexOf(c) == -1) {
                return false;
            }
        }
        return true;
    }
}