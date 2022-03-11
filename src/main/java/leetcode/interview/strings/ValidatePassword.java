package leetcode.interview.strings;

/**
 * Implement a method that check if a given password is complex and secured (at least 6 characters length, 1 upper case, 1 lower case, 1 number)
 * Example:
 * Dababa3 - true
 * dababa3 - false
 */
public class ValidatePassword {

    public static boolean isPasswordComplex(String password) {
        return password.length() >= 6 &&
                password.matches(". *\\d. *") &&
                password.matches(". *[a - z].*") &&
                password.matches(". *[A - Z].*");
    }
}