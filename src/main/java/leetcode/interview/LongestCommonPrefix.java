package leetcode.interview;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Write a function to find the longest common prefix string amongst an array of strings.
 *
 * If there is no common prefix, return an empty string "".
 */
public class LongestCommonPrefix {

    public static String longestCommonPrefix(String[] strs) {
        int numberOfStringsInArray = strs.length;
        String firstStringInArray = strs[0];
        int numberOfCharsInFirstString = firstStringInArray.length();
        StringBuilder commonPrefix = new StringBuilder();
        char currentChar;

        for (int i = 0; i < numberOfCharsInFirstString; i++) {
            currentChar = firstStringInArray.charAt(i);
            int count = 1;
            for (int j = 1; j < numberOfStringsInArray; j++) {
                if (strs[j].charAt(i) == currentChar) {
                    count++;
                }
            }
            if (count == numberOfStringsInArray) {
                commonPrefix.append(currentChar);
            } else {
                break;
            }
        }
        return commonPrefix.toString();
    }

    @Test
    public void validTest() {
        assertEquals(longestCommonPrefix(new String[]{"flower", "flow", "flight"}), "fl");
    }

    @Test
    public void validEmptyTest() {
        assertEquals(longestCommonPrefix(new String[]{"dog","racecar","car"}), "");
    }
}