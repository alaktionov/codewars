package leetcode;

/**
 * Java program to sort characters in a given String
 * Example: sortString("engineer") will produce "eeeginnr"
 */
public class SortCharactersInString {

    public static String sortString(String code) {
        char[] codeArray = code.toCharArray();
        for (int i = 0; i < codeArray.length; i++) {
            for (int j = i + 1; j < codeArray.length; j++) {
                if (codeArray[j] < codeArray[i]) {
                    char temp = codeArray[i];
                    codeArray[i] = codeArray[j];
                    codeArray[j] = temp;
                }
            }
        }
        String sortedString = new String(codeArray);
        System.out.println(sortedString);
        return sortedString;
    }
}