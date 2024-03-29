package codewars.level3;

public class CountDigit {

    public static int nbDig(int n, int d) {
        int count = 0;
        int k;
        int[] squareOfKs = new int[n + 1];
        for (int i = 0; i <= n; i++) {
            k = i * i;
            squareOfKs[i] = k;
        }
        for (int i = 0; i < squareOfKs.length; i++) {
            String s = String.valueOf(squareOfKs[i]);
            for (int j = 0; j < s.length(); j++) {
                if (Character.getNumericValue(s.charAt(j)) == d) {
                    count++;
                }
            }
        }
        return count;
    }
}