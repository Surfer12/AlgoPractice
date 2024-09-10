package GenericCreationsFromWorkspace;

/**
 * The ReverseNumber class contains a method to reverse an integer.
 */
@SuppressWarnings("unchecked")
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
            return (T) (Number) Long.valueOf(reversedNumber);
        } else if (number instanceof Byte) {
            return (T) (Number) Byte.valueOf((byte) reversedNumber);
        } else if (number instanceof Short) {
            return (T) (Number) Short.valueOf((short) reversedNumber);
        } else if (number instanceof Float) {
            return (T) (Number) Float.valueOf(reversedNumber);
        } else if (number instanceof Double) {
            return (T) (Number) Double.valueOf(reversedNumber);
        }
        throw new IllegalArgumentException("Unsupported number type.");
    }
}
