package codewars.level2;

public class IsLuckNumber {

    public static boolean isLucky(int number) {
        boolean[] array = new boolean[10];

        while (number > 0) {
            int digit = number % 10;
            if (array[digit]) {
                return false;
            }
            array[digit] = true;
            number = number / 10;
        }
        return true;
    }
}