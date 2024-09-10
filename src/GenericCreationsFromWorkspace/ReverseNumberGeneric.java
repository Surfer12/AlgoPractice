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
    

    @SuppressWarnings("unchecked")
    private static <T extends Number> T castNumber(long number, Class<T> clazz) {
        if (clazz == Integer.class) {
            return (T) Integer.valueOf((int) number);
        } else if (clazz == Long.class) {
            return (T) Long.valueOf(number);
        } else if (clazz == Byte.class) {
            return (T) Byte.valueOf((byte) number);
        } else if (clazz == Short.class) {
            return (T) Short.valueOf((short) number);
        } else if (clazz == Float.class) {
            return (T) Float.valueOf(number);
        } else if (clazz == Double.class) {
            return (T) Double.valueOf(number);
        }
        throw new IllegalArgumentException("Unsupported number type.");
    }
}

