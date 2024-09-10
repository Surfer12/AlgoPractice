public class ReversedNumber {
    public int reverseInteger(int x) {
        int reversed = 0; // Initialize reversed to 0
        while (x != 0) {
            int digit = x % 10; // Get the last digit of x  
            reversed = reversed * 10 + digit; // Add the digit to the reversed number
            x /= 10; // Remove the last digit from x    
        }
        return reversed;
    }
}