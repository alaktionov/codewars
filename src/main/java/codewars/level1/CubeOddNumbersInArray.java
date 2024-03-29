package codewars.level1;

public class CubeOddNumbersInArray {

    public static int cubeOdd(int[] arr) {
        int sum = 0;
        for (int number : arr) {
            if (number % 2 != 0) {
                sum += number * number * number;
            }
        }
        return sum;
    }
}