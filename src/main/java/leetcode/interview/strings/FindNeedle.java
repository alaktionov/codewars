package leetcode.interview.strings;

/**
 * Implement strStr().
 * Return the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.
 * <p>
 * Clarification:
 * What should we return when needle is an empty string? This is a great question to ask during an interview.
 * For the purpose of this problem, we will return 0 when needle is an empty string. This is consistent to C's strstr() and Java's indexOf().
 * <p>
 * Example 1:
 * Input: haystack = "hello", needle = "ll"
 * Output: 2
 */
public class FindNeedle {

    public int strStr(String haystack, String needle) {
        return haystack.contains(needle) ? haystack.indexOf(needle) : -1;
    }
}