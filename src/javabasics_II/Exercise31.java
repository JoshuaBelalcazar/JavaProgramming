package javabasics_II;

import java.util.Arrays;

public class Exercise31 {
    /*
    Exercise 31:
    Write a Java program to find the longest increasing continuous subsequence in a given array of integers.

    Expected Output:

    Original array: [10, 11, 12, 13, 14, 7, 8, 9, 1, 2, 3]
    Size of longest increasing continuous subsequence: 5

    */
    public static void main(String[] args) {

        // Initialize an array of integers
        int[] data = {10, 11, 12, 13, 14, 7, 8, 9, 1, 2, 3};

        // Print the original array
        System.out.println("Original array: " + Arrays.toString(data));

        // Display the size of the longest increasing continuous subsequence
        System.out.println("Size of longest increasing continuous subsequence: " + findLongestSequence(data));
    }

    // Method to find the size of the longest increasing or decreasing continuous subsequence
    public static int findLongestSequence(int[] array) {
        // If array has only one element, the longest sequence is 1
        if (array.length == 1) {
            return 1;
        }

        int maxLength = 0;

        // Iterate through the array to find the longest continuous sequence
        for (int i = 0; i < array.length - 1; i++) {

            // Start each sequence count at 1
            int seqCount = 1;
            int j = i;

            // Check if we are in an increasing run
            if (array[i + 1] > array[i]) {
                while (j < array.length - 1 && array[j + 1] > array[j]) {
                    seqCount++;
                    j++;
                }
            }
            // Check if we are in a decreasing run
            else if (array[i + 1] < array[i]) {
                while (j < array.length - 1 && array[j + 1] < array[j]) {
                    seqCount++;
                    j++;
                }
            }

            // Update maxLength if current sequence is longer
            if (seqCount > maxLength) {
                maxLength = seqCount;
            }

            // Move i forward to skip over the sequence we just processed
            i += seqCount - 2;
        }

        return maxLength;
    }
}