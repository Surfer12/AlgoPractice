/**
 * The ReverseNumberGeneric class contains a method to reverse an integer.
 *
 * @param <T> the type of number to be reversed, must be a subclass of Number
 */
package AlgoAttempts;

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
public class ReverseNumberGeneric {
    public static <T extends Number> T reverse(T number) {
        long reversedNumber = 0;
        long inputNumber = number.longValue(); // Convert to long to handle all types uniformly

        while (inputNumber != 0) {
            long lastDigit = inputNumber % 10;
            reversedNumber = reversedNumber * 10 + lastDigit;
            inputNumber /= 10;
        }

        if (number instanceof Integer) {
            return (T) Integer.valueOf((int) reversedNumber);
        } else if (number instanceof Long) {
            return (T) Long.valueOf(reversedNumber);
        } else if (number instanceof Byte) {
            return (T) Byte.valueOf((byte) reversedNumber);
        } else if (number instanceof Short) {
            return (T) Short.valueOf((short) reversedNumber);
        } else if (number instanceof Float) {
            return (T) Float.valueOf(reversedNumber);
        } else if (number instanceof Double) {
            return (T) Double.valueOf(reversedNumber);
        }

        throw new IllegalArgumentException("Unsupported number type.");
    }
}

/* To write the `reverse` method in a generic type-safe way in Java, you would need to consider that Java generics do not support primitive types directly (like `int`, `float`, etc.). However, you can use wrapper classes (`Integer`, `Long`, etc.) to achieve a similar effect. Here's how you could implement a generic method to reverse numbers using Java's wrapper classes and generics:


### Explanation:
1. **Generic Type `<T extends Number>`**: This method uses a bounded type parameter to ensure that it only accepts types that are subclasses of `Number`. This includes `Integer`, `Long`, `Float`, `Double`, `Byte`, `Short`, etc.

2. **Handling Different Number Types**: Since Java generics do not support autoboxing directly with generics, the method manually checks the instance of each wrapper class and converts the reversed number accordingly.

3. **Type Casting**: The method casts the reversed number to `T` after converting the `long` value to the appropriate number type. This is necessary because generics in Java are invariant.

4. **Exception Handling**: If a number type that is not supported is passed, the method throws an `IllegalArgumentException`.

This approach allows the `reverse` method to be used with any numeric type supported by Java's `Number` class, making it versatile and type-safe. */