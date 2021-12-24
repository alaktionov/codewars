package codewars.level2;

public class CountSubstring {

    public static int substringCount(String fullString, String subString) {
        int lastIndex = 0;
        int count = 0;

        while (lastIndex != -1) {
            lastIndex = fullString.indexOf(subString, lastIndex);
            if (lastIndex != -1) {
                count++;
                lastIndex += subString.length();
            }
        }
        return count;
    }
}