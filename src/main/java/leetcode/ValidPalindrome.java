package leetcode;

/**
 * A phrase is a palindrome if, after converting all uppercase letters into lowercase letters and removing all non-alphanumeric characters, it reads the same forward and backward. Alphanumeric characters include letters and numbers.
 *
 * Given a string s, return true if it is a palindrome, or false otherwise.
 */
public class ValidPalindrome {

    public static boolean isPalindrome(String s) {
        StringBuilder forward = new StringBuilder(s.replaceAll("[^A-Za-z0-9]", "").toLowerCase());
        StringBuilder backward = new StringBuilder(forward);
        backward.reverse();
        return forward.toString().equals(backward.toString());
    }
}