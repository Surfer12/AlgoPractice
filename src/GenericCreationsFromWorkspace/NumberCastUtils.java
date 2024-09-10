package GenericCreationsFromWorkspace;

/**
 * Utility class for number operations.
 * Generic method castNumber that can be reused to cast a long number to any
 * subclass of Number.
 */
@SuppressWarnings("unchecked")
public class NumberCastUtils {

    /**
     * Reverses the digits of the given number.
     *
     * @param <T>    the type of number
     * @param number the number to reverse
     * @return the reversed number
     * @throws IllegalArgumentException if the number type is not supported
     */
    public static <T extends Number> T reverseNumber(T number) {
        long reversedNumber = 0;
        long inputNumber = number.longValue(); // Convert to long to handle all types uniformly

        while (inputNumber != 0) {
            long lastDigit = inputNumber % 10;
            reversedNumber = reversedNumber * 10 + lastDigit;
            inputNumber /= 10;
        }
        return castNumber(reversedNumber, (Class<T>) number.getClass());
    }

    /**
     * Casts a long number to a specified type.
     *
     * @param <T>    the type of number to cast to
     * @param number the number to cast
     * @param clazz  the class of the type to cast to
     * @return the number cast to the specified type
     * @throws IllegalArgumentException if the type is not supported
     */

    private static <T extends Number> T castNumber(long number, Class<? extends T> clazz) {
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
