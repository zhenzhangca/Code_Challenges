package ca.jrvs.challenge;

/**
 * Check if a String contains only digits
 */
public class CheckStringContainsOnlyDigits {
    public static boolean containsOnlyDigits(String str){
        for (int i = 0; i < str.length(); i++) {
            if (!Character.isDigit(str.charAt(i)))
                return false;
        }
        return true;
    }
    public static boolean containsOnlyDigitsRegex(String str){
        String regex = "^[0-9]+$";
        if (!str.matches(regex)) {
            return false;
        }
        return true;
    }
}
