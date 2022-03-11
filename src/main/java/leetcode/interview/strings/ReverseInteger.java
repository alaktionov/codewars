package leetcode.interview.strings;

import java.util.ArrayList;

/**
 * Given a signed 32-bit integer x, return x with its digits reversed
 * If reversing x causes the value to go outside the signed 32-bit integer range [-231, 231 - 1], then return 0.
 * Example:
 * Input: 123
 * Output: 321
 */
public class ReverseInteger {

    public static int reverseInteger1(int x) {
        if (x < Math.pow(-2, 31) || x > Math.pow(2, 31) - 1) {
            return 0;
        }
        ArrayList<Integer> numbers = new ArrayList<>();
        do {
            numbers.add(x % 10);
            x /= 10;
        } while (x != 0);

        int total = 0;
        for (Integer i : numbers) {
            total = 10 * total + i;
        }
        return total;
    }


    public static int reverseInteger2(int x) {
        String number = Integer.toString(x);
        int[] numbers = new int[number.length()];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = Character.getNumericValue(number.charAt(i));
        }

        int j = numbers.length - 1;
        for (int i = 0; i < j; i++) {
            int temp = numbers[i];
            numbers[i] = numbers[j];
            numbers[j] = temp;
            j--;
        }

        StringBuilder reversedString = new StringBuilder();
        for (int digit : numbers) {
            reversedString.append(digit);
        }

        return Integer.parseInt(reversedString.toString());
    }
}