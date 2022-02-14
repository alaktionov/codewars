package leetcode.studyplan.algorithmI.easy;

import java.util.Arrays;

/**
 * Given a string s, reverse the order of characters in each word within a sentence
 * while still preserving whitespace and initial word order.
 * <p>
 * Input: s = "Let's take LeetCode contest"
 * Output: "s'teL ekat edoCteeL tsetnoc"
 */
public class ReverseWordsInString {

    public static String reverseWordsStringBuilder(String s) {
        String[] arrayOfWords = s.split("\\s+");
        StringBuilder result = new StringBuilder();
        for (String word : arrayOfWords) {
            result.append(new StringBuilder(word).reverse()).append(" ");
        }
        return result.toString().trim();
    }

    public static String reverseWords(String s) {
        String[] arrayOfWords = s.split("\\s+");
        StringBuilder result = new StringBuilder();
        for (String arrayOfWord : arrayOfWords) {
            char[] arrayOfCharsInCurrentWord = arrayOfWord.toCharArray();
            int index = arrayOfCharsInCurrentWord.length - 1;
            for (int j = 0; j < index; j++) {
                char temp = arrayOfCharsInCurrentWord[j];
                arrayOfCharsInCurrentWord[j] = arrayOfCharsInCurrentWord[index];
                arrayOfCharsInCurrentWord[index] = temp;
                index--;
            }
            result.append(Arrays.toString(arrayOfCharsInCurrentWord)).append(" ");
        }
        return result.toString().trim();
    }
}