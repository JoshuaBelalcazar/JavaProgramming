package datatypes;

/*
Exercise 54:
Write a Java program to extract the primitive type value from a given BigInteger value.
A primitive type is predefined by the language and is named by a reserved keyword. Primitive values do not share state with other primitive values.
The eight primitive data types supported by the Java programming language are byte, short, int, long, float, double, boolean and char.
BigInteger() translates the sign-magnitude representation of a BigInteger into a BigInteger. The sign is represented as an integer signum value: -1 for negative, 0 for zero, or 1 for positive. The magnitude is a byte array in big-endian byte-order: the most significant byte is in the zeroth element.
A zero-length magnitude array is permissible, and will result in a BigInteger value of 0, whether signum is -1, 0 or 1.
*/

import java.math.BigInteger;

public class Exercise54 {
    public static void main(String[] args) {
        // Create a BigInteger instance using Long.MAX_VALUE
        BigInteger bigValue = BigInteger.valueOf(Long.MAX_VALUE);
        System.out.println("\nBigInteger value: " + bigValue);

        // Extract and display the primitive type values from the BigInteger
        long longVal = bigValue.longValue();
        System.out.println("\nConvert the said BigInteger to a long value: " + longVal);

        int intVal = bigValue.intValue();
        System.out.println("\nConvert the said BigInteger to an int value: " + intVal);

        short shortVal = bigValue.shortValue();
        System.out.println("\nConvert the said BigInteger to a short value: " + shortVal);

        byte byteVal = bigValue.byteValue();
        System.out.println("\nConvert the said BigInteger to a byte value: " + byteVal);

        // Extract the exact long value from the BigInteger
        long exactLong = bigValue.longValueExact();
        System.out.println("\nConvert the said BigInteger to exact long: " + exactLong);
    }
}

