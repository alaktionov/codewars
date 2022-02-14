package leetcode.studyplan.algorithmI.easy;

/**
 * Write a function that reverses a string. The input string is given as an array of characters s.
 * <p>
 * You must do this by modifying the input array in-place with O(1) extra memory.
 */
public class ReverseString {

    public static void reverseStringOne(char[] s) {
        int size = s.length / 2;
        int index = s.length - 1;
        for (int i = 0; i < size; i++) {
            char current = s[i];
            s[i] = s[index];
            s[index] = current;
            index--;
        }
    }

    public static void reverseStringTwo(char[] s) {
        int j = s.length - 1;
        for (int i = 0; i < j; i++) {
            char temp = s[i];
            s[i] = s[j];
            s[j] = temp;
            j--;
        }
    }
}