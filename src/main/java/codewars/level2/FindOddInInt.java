package codewars.level2;

public class FindOddInInt {

    public static int findIt(int[] a) {
        int number = 0;
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                if (a[j] == a[i]) {
                    count++;
                }
            }
            if (count % 2 != 0) {
                number = a[i];
                break;
            }
        }
        return number;
    }
}