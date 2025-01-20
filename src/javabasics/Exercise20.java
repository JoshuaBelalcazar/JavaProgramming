package javabasics;

import java.util.Arrays;

public class Exercise20 {
    public static void main(String[] args) {
        /*
        Exercise 20:
        Write a Java program to count the number of even and odd elements in a given array of integers.
         */

        // Initialize an array of integers
        int[] numbers = {5, 7, 2, 4, 9};

        // Initialize counters for evens and odds
        int evenCount = 0, oddCount = 0;

        // Display the original array
        System.out.println("Original Array: " + Arrays.toString(numbers));

        // Count how many numbers are even and how many are odd
        for (int index = 0; index < numbers.length; index++) {
            if (numbers[index] % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }

        // Print the results
        System.out.println("\nNumber of even elements in the array: " + evenCount);
        System.out.println("Number of odd elements in the array: " + oddCount);
    }
}