package codewars.level2;

public class CapitalizeFirstLetter {

    public static String[] capitalizeFirstLetter(String[] strings) {
        for (int i = 0; i < strings.length; i++) {
            String lower = strings[i].toLowerCase();
            String capitalized = Character.toUpperCase(lower.charAt(0)) + lower.substring(1);
            strings[i] = capitalized;
        }
        return strings;
    }
}