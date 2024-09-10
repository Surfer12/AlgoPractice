package AlgoAttempts;

/**
 * Converts Roman numerals to integer values.
 */
public class RomanToInteger {

    /**
     * Converts a Roman numeral string to an integer.
     * 
     * @param s the Roman numeral string
     * @return the integer value of the Roman numeral
     */
    public int romanToInt(String s) {
        int result = 0;
        for (int i = 0; i < s.length(); i++) {
            int currentVal = romanValue(s.charAt(i));
            if (i + 1 < s.length()) {
                int nextVal = romanValue(s.charAt(i + 1));
                if (handleSubtractiveNotation(s.charAt(i), s.charAt(i + 1))) {
                    result += nextVal - currentVal; 
                    i++; // Skip the next character
                } else {
                    result += currentVal;
                }
            } else {
                result += currentVal;
            }
        }   
        return result;
    }

    /**
     * Returns the integer value of a single Roman numeral character.
     * 
     * @param c the Roman numeral character
     * @return the integer value corresponding to the Roman numeral character
     */
    private int romanValue(char c) {
        switch (c) {
            case 'I': return 1;
            case 'V': return 5;
            case 'X': return 10;
            case 'L': return 50;
            case 'C': return 100;
            case 'D': return 500;
            case 'M': return 1000;
            default: return 0; // Invalid character
        }
    }

    /**
     * Determines if a subtractive notation is used between two Roman numerals.
     * 
     * @param current the current Roman numeral character
     * @param next the next Roman numeral character
     * @return true if the subtractive notation is applicable, false otherwise
     */
    private boolean handleSubtractiveNotation(char current, char next) {
        // Implementation to check and handle subtractive cases
        if (current == 'I' && (next == 'V' || next == 'X')) {
            return true;
        } else if (current == 'X' && (next == 'L' || next == 'C')) {
            return true;
        } else if (current == 'C' && (next == 'D' || next == 'M')) {
            return true;
        } else {
            return false;
        }
    }
}