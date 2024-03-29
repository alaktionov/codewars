package codewars.level2;

public class NumberWithMostDigits {

  public static int findLongest(int[] numbers) {
        int longestNumber = 0;
        int longestLength = 0;
        for (int number : numbers) {
            int length = String.valueOf(Math.abs(number)).length();
            if (length > longestLength) {
                longestNumber = number;
                longestLength = length;
            }
        }
        return longestNumber;
    }
}