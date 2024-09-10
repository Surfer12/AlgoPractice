package StackTasks;
public class PalindromeCheck {
    /**
     * Checks if the input string is a palindrome.
     * <p>
     * A palindrome is a word, phrase, number, or other sequence of characters that
     * reads the same forward and backward.
     * <p>
     * Time Complexity: O(n)
     * - The method iterates through each character in the input string `input`
     * exactly once.
     * - The comparison of characters at the start and end of the string takes O(1)
     * time.
     * - Therefore, the overall time complexity is O(n), where n is the length of
     * the string.
     *
     * @param input The input string to check for palindrome.
     * @return true if the input is a palindrome, false otherwise.
     */
    public static boolean isPalindrome(String input) {
        // Remove all non-alphanumeric characters and convert the input to lowercase
        String cleanInput = input.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        // Use two pointers to compare characters from the start and end of the string
        int start = 0;
        int end = cleanInput.length() - 1;

        while (start < end) {
            if (cleanInput.charAt(start) != cleanInput.charAt(end)) {
                return false; // Characters do not match, not a palindrome
            }
            start++;
            end--;
        }

        return true; // All characters match, input is a palindrome
    }
}
