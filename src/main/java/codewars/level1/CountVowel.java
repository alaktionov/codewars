package codewars.level1;

public class CountVowel {

    public static int getCountOfVowelCharacters(String str) {
        int vowelsCount = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u') {
                vowelsCount++;
            }
        }
        return vowelsCount;
    }
}