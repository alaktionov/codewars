package codewars.level2;

public class SortGiftCode {

    public static String sortGiftCode(String code) {
        char[] codeArray = code.toCharArray();
        for (int i = 0; i < codeArray.length; i++) {
            for (int j = i + 1; j < codeArray.length; j++) {
                if (codeArray[j] < codeArray[i]) {
                    char tempo = codeArray[i];
                    codeArray[i] = codeArray[j];
                    codeArray[j] = tempo;
                }
            }
        }
        String sortedString = new String(codeArray);
        System.out.println(sortedString);
        return sortedString;
    }
}