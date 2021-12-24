package codewars.level2;

public class GetMiddleCharacter {

    public static String getMiddle(String word) {
        String middle = "";
        int count = word.length() / 2;
        if (count >= 0) {
            if (word.length() % 2 == 0) {
                middle = word.substring(count - 1, count + 1);
            } else {
                middle = word.substring(count, count + 1);
            }
        } else {
            middle = word;
        }
        return middle;
    }
}