package ca.jrvs.challenge;

/**
 * Check if a number is even or odd, two solutions --modulo and bit
 */
public class CheckEvenOrOdd {
    public static String checkEvenOrOddModulo(int number) {
        if (number % 2 == 0) {
            return "even";
        } else {
            return "odd";
        }
    }

    public static String checkEvenOrOddBit(int number) {
        if ((number & 1) == 0) {
            return "even";
        } else {
            return "odd";
        }
    }

}
