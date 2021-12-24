package codewars.level2;

public class DisemvowelTrolls {

    //SOLUTION 1
    public static String disemvowel1(String str) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            String currentCharacter = Character.toString(str.charAt(i));
            if (!currentCharacter.equalsIgnoreCase("a") && !currentCharacter.equalsIgnoreCase("e") && !currentCharacter.equalsIgnoreCase("i") && !currentCharacter.equalsIgnoreCase("o") && !currentCharacter.equalsIgnoreCase("u")) {
                result.append(currentCharacter);
            }
        }
        return result.toString();
    }

    //SOLUTION 2
    public static String disemvowel2(String str) {
        return str.replaceAll("[aAeEiIoOuU]", "");
    }

}