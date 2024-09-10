/**
 * The ReverseNumberGeneric class contains a method to reverse an integer.
 *
 * @param <T> the type of number to be reversed, must be a subclass of Number
 */
package AlgoAttempts;

import GenericCreationsFromWorkspace.ReverseNumberGeneric;

/**
 * The ReverseNumber class contains a method to reverse an integer.
 */
/**
 * A generic class that provides a method to reverse a given number.
 *
 * @param <T> the type of the number to be reversed, must extend Number
 * @return the reversed number of the same type as the input number
 * @throws IllegalArgumentException if the input number type is not supported
 */
public class ReverseNumber {

    // Method to reverse an Integer using the ReverseNumberGeneric class
    public static Integer reverseInteger(Integer number) {
        return ReverseNumberGeneric.reverse(number);
    }

    // Example usage
    public static void main(String[] args) {
        Integer original = 123456;
        Integer reversed = reverseInteger(original);
        System.out.println("Original: " + original + " Reversed: " + reversed);
    }
}