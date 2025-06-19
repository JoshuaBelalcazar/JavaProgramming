package java_algorithms.sorting;

import java.util.Arrays;
/*
  Exercise 355:
  Write a Java program to sort an array of given integers using the Radix Sort algorithm.

  Sample Output:
  Original Array:
  [7, -5, 3, 2, 1, 0, 45]
  Sorted Array:
  [-5, 0, 1, 2, 3, 7, 45]
 */


public class Exercise355 {

    public static void sort(int[] array) {
        sort(array, 10); // Default radix/base 10
    }

    public static void sort(int[] array, int radix) {
        if (array.length == 0) return;

        // Find min and max values in the array
        int min = array[0];
        int max = array[0];

        for (int value : array) {
            if (value < min) min = value;
            else if (value > max) max = value;
        }

        // Sort by each digit/exponent starting from least significant
        int exponent = 1;
        while ((max - min) / exponent >= 1) {
            countingSortByDigit(array, radix, exponent, min);
            exponent *= radix;
        }
    }

    // Internal helper for counting sort by digit
    private static void countingSortByDigit(int[] array, int radix, int exponent, int minValue) {
        int[] buckets = new int[radix];
        int[] output = new int[array.length];

        // Count digit frequencies
        for (int value : array) {
            int bucketIndex = ((value - minValue) / exponent) % radix;
            buckets[bucketIndex]++;
        }

        // Accumulate positions
        for (int i = 1; i < radix; i++) {
            buckets[i] += buckets[i - 1];
        }

        // Build the output array in reverse for stability
        for (int i = array.length - 1; i >= 0; i--) {
            int bucketIndex = ((array[i] - minValue) / exponent) % radix;
            output[--buckets[bucketIndex]] = array[i];
        }

        // Copy back to original array
        System.arraycopy(output, 0, array, 0, array.length);
    }

    public static void main(String[] args) {
        int[] numbers = {7, -5, 3, 2, 1, 0, 45};
        System.out.println("Original Array:");
        System.out.println(Arrays.toString(numbers));

        sort(numbers);

        System.out.println("Sorted Array:");
        System.out.println(Arrays.toString(numbers));
    }
}

