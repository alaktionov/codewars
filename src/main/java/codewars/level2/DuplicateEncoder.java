package codewars.level2;

import org.apache.commons.lang3.StringUtils;

public class DuplicateEncoder {

    public static String encode(String word) {
        StringBuilder encodedWord = new StringBuilder();
        String wordLowerCase = word.toLowerCase();
        for (int i = 0; i < word.length(); i++) {
            if (StringUtils.countMatches(wordLowerCase.toLowerCase(), wordLowerCase.charAt(i)) > 1) {
                encodedWord.append(")");
            } else {
                encodedWord.append("(");
            }
        }
        return encodedWord.toString();
    }
}