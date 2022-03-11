package leetcode.interview.strings;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Write a function to find the longest common prefix string amongst an array of strings.
 * <p>
 * If there is no common prefix, return an empty string "".
 * <p>
 * Example 1:
 * Input: strs = ["flower","flow","flight"]
 * Output: "fl"
 */
public class LongestCommonPrefix {

    public static String longestCommonPrefix2(String[] strs) {
        if (strs == null || strs.length == 0) return "";

        String pre = strs[0];
        int i = 1;
        while (i < strs.length) {
            while (strs[i].indexOf(pre) != 0)
                pre = pre.substring(0, pre.length() - 1);
            i++;
        }
        return pre;
    }

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
        assertEquals(longestCommonPrefix(new String[]{"dog", "racecar", "car"}), "");
    }
}