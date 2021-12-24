package codewars.level1;

public class IsSquare {

    public static boolean isSquare(int n) {
        double squareDouble = Math.sqrt(n);
        int squareInteger = (int) squareDouble;
        return Math.pow(squareDouble, 2) == Math.pow(squareInteger, 2);
    }
}