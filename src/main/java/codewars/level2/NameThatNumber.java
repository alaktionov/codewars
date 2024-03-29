package codewars.level2;

public class NameThatNumber {

    public static String nameThatNumber(int x) {
        String returnedValue = "";
        String[] tens = {"", "", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"};
        String[] units = {"", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"};

        if (x == 0) {
            returnedValue = "zero";
        }
        if (x < 20 && x > 0) {
            returnedValue = units[x];
        }
        if (x >= 20) {
            returnedValue = tens[x / 10] + ((x % 10 != 0) ? " " : "") + units[x % 10];
        }
        return returnedValue;
    }
}