package javabasics_II;

import java.util.Arrays;

public class Exercise30 {

    /*
    Exercise 30:
    Write a Java program to find the length of the longest consecutive sequence in a given array of integers.

    Original array: [1, 1, 2, 3, 3, 4, 5, 2, 4, 5, 6, 7, 8, 9, 6, -1, -2]
    7
     */


    // Method to find the length of the longest consecutive (strictly increasing) sequence in an array
    public static int findLongestSequence(int[] numbers) {

        // Check if the input array is null
        if (numbers == null) {
            throw new IllegalArgumentException("Array cannot be null!");
        }

        // If the array has no elements
        if (numbers.length == 0) {
            return 0;
        }

        boolean foundSequence = false;  // Tracks whether we've found any increasing sequence
        int longestLength = 0;          // Holds the length of the longest sequence found
        int seqStart = 0, seqEnd = 0;   // Indicate the start and end indexes of the current sequence

        // Iterate through the array, comparing each element with its predecessor
        for (int i = 1; i < numbers.length; i++) {

            // If current element is strictly greater than the previous element
            if (numbers[i - 1] < numbers[i]) {
                seqEnd = i;  // Extend the current sequence
            } else {
                seqStart = i; // Reset the start if not strictly increasing
            }

            // Update the longest sequence length if the current one is longer
            if (seqEnd - seqStart > longestLength) {
                foundSequence = true;
                longestLength = seqEnd - seqStart;
            }
        }

        // If a sequence was identified, return its length plus one to account for indices
        if (foundSequence) {
            return longestLength + 1;
        } else {
            return longestLength;
        }
    }

    public static void main(String[] args) {

        // Sample array
        int[] nums = {1, 1, 2, 3, 3, 4, 5, 2, 4, 5, 6, 7, 8, 9, 6, -1, -2};

        // Display the original array
        System.out.println("\nOriginal array: " + Arrays.toString(nums));

        // Find and display the length of the longest strictly increasing sequence in the array
        System.out.println(findLongestSequence(nums));
    }
}