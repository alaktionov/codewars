package leetcode.studyplan.algorithmI.medium;

import java.util.Arrays;

/**
 * Given two strings s1 and s2, return true if s2 contains a permutation of s1, or false otherwise.
 * <p>
 * In other words, return true if one of s1's permutations is the substring of s2.
 * <p>
 * Input: s1 = "ab", s2 = "eidbaooo"
 * Output: true
 * Explanation: s2 contains one permutation of s1 ("ba").
 */

public class PermutationInString {

    public static boolean checkInclusion(String s1, String s2) {
        return s2.contains(s1) || s2.contains(new StringBuilder(s1).reverse());
    }

    public static boolean checkInclusionSort(String s1, String s2) {
        char[] arr1 = s1.toCharArray();
        char[] arr2 = s2.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        char[] temp = Arrays.copyOf(arr2, arr1.length);

        return Arrays.equals(arr1, temp);
    }
}