package codewars.level2;

public class Mumbling {

    public static String accum(String s) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            for (int j = 0; j <= i; j++) {
                if (j == 0) {
                    result.append(Character.toUpperCase(s.charAt(i)));
                } else {
                    result.append(Character.toLowerCase(s.charAt(i)));
                }
            }
            result.append("-");
        }
        return result.substring(0, result.length() - 1);
    }
}