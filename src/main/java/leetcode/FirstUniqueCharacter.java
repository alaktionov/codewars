package leetcode;

import org.apache.commons.lang3.StringUtils;

/**
 * Given a string s, find the first non-repeating character in it and return its index. If it does not exist, return -1.
 */
public class FirstUniqueCharacter {

    public static int firstUniqueCharJavaStream(String s) {
        char[] array = s.toCharArray();
        for (int i = 0; i < array.length; i++) {
            char currentChar = array[i];
            long count = s.chars().filter(ch -> ch == currentChar).count();
            if (count == 1) {
                return i;
            }
        }
        return -1;
    }

    public static int firstUniqueCharJavaCore(String s) {
        char[] array = s.toCharArray();
        for (int i = 0; i < array.length; i++) {
            char currentChar = array[i];
            int count = 0;
            for (int j = 0; j < array.length; j++) {
                if (s.charAt(j) == currentChar) {
                    count++;
                }
            }

            if (count == 1) {
                return i;
            }
        }
        return -1;
    }

    public static int firstUniqueCharStringUtils(String s) {
        char[] array = s.toCharArray();
        for (int i = 0; i < array.length; i++) {
            char currentChar = array[i];
            if (StringUtils.countMatches(s, currentChar) == 1) {
                return i;
            }
        }
        return -1;
    }
}