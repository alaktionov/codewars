package leetcode.interview;

import java.util.Arrays;

/**
 * Write a function that reverses a string. The input string is given as an array of characters s.
 * You must do this by modifying the input array in-place without extra memory.
 * Example:
 * Input: s = ["h","e","l","l","o"]
 * Output: ["o","l","l","e","h"]
 */
public class ReverseString {

    public static String reverseString(char[] s) {
        int j = s.length - 1;
        for (int i = 0; i < j; i++) {
            char temp = s[i];
            s[i] = s[j];
            s[j] = temp;
            j--;
        }
        return Arrays.toString(s);
    }
}