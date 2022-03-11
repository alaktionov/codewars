package leetcode.interview.strings;

/**
 * Implement the myAtoi(string s) function, which converts a string to a 32-bit signed integer (similar to C/C++'s atoi function).
 * <p>
 * The algorithm for myAtoi(string s) is as follows:
 * <p>
 * 1. Read in and ignore any leading whitespace.
 * 2. Check if the next character (if not already at the end of the string) is '-' or '+'. Read this character in if it is either. This determines if the final result is negative or positive respectively. Assume the result is positive if neither is present.
 * 3. Read in next the characters until the next non-digit character or the end of the input is reached. The rest of the string is ignored.
 * 4. Convert these digits into an integer (i.e. "123" -> 123, "0032" -> 32). If no digits were read, then the integer is 0. Change the sign as necessary (from step 2).
 * 5. If the integer is out of the 32-bit signed integer range [-231, 231 - 1], then clamp the integer so that it remains in the range. Specifically, integers less than -231 should be clamped to -231, and integers greater than 231 - 1 should be clamped to 231 - 1.
 * 6. Return the integer as the final result.
 * <p>
 * Input: s = "4193 with words"
 * Output: 4193
 */

public class StringToInteger {

    public static int myAtoi(String str) {
        str = str.trim();
        if (str.isEmpty()) {
            return 0;
        }

        int sign = 1;
        int i = 0;
        if (str.charAt(0) == '-' || str.charAt(0) == '+') {
            sign = (str.charAt(0) == '-') ? -1 : 1;
            if (str.length() < 2 || !Character.isDigit(str.charAt(1))) {
                return 0;
            }
            i++;
        }

        int n = 0;
        while (i < str.length()) {
            if (Character.isDigit(str.charAt(i))) {
                int d = str.charAt(i) - '0';
                if (n > (Integer.MAX_VALUE - d) / 10) { //Detect the integer overflow.
                    n = (sign == -1) ? Integer.MIN_VALUE : Integer.MAX_VALUE;
                    return n;
                }
                n = n * 10 + d;
            } else {
                break;
            }
            i++;
        }
        return sign * n;
    }
}