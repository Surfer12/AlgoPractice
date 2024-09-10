/**
 * The ReverseNumber class contains a method to reverse an integer.
 */
public class ReverseNumber {
    /**
     * The main method that executes the integer reversal process.
     * 
     * @param args Command line arguments (not used).
     */
    public static void main(String[] args) {
        int originalNumber = 1234; // The number to be reversed
        int reversedNumber = 0; // Initialize the reversed number to 0

        System.out.println("Original Number: " + originalNumber);
        System.out.println("Reversed Number initialized to: " + reversedNumber);

        // Loop until the original number is reduced to 0
        while (originalNumber != 0) {
            int lastDigit = originalNumber % 10; // Extract the last digit
            System.out.println("Extracted Last Digit: " + lastDigit);

            reversedNumber = reversedNumber * 10 + lastDigit; // Add it to the reversed number. Notice that reversed
                                                              // number on the first iteration is 0, then is multiplied
                                                              // by 10 and the last digit is added to it.

            System.out.println("Updated Reversed Number: " + reversedNumber);

            originalNumber /= 10; // Remove the last digit from the original number. This is done by dividing the
                                  // original number by 10. Notice this leverages integer division and truncates
                                  // the decimal regardlesss of the rounding necessary.
            System.out.println("Original Number after removing last digit: " + originalNumber);
        }

        System.out.println("Final Reversed Number: " + reversedNumber);
    }
}