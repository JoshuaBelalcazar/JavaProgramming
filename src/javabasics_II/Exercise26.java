package javabasics_II;

import java.util.Arrays;
import java.util.Collections;

public class Exercise26 {
    /*
    Exercise 26:
    Write a Java program to find the k largest elements in a given array. Elements in the array can be in any order.

    Expected Output:
    Original Array:
    [1, 4, 17, 7, 25, 3, 100]
    3 largest elements of the said array are:
    100 25 17
     */
    public static void main(String[] args) {

            // Define an array of integers
            Integer[] numbers = {1, 4, 17, 7, 25, 3, 100};

            // Specify the number of largest elements to find
            int k = 3;

            // Display the original array
            System.out.println("Original Array: ");
            System.out.println(Arrays.toString(numbers));

            // Sort the array in descending order
            Arrays.sort(numbers, Collections.reverseOrder());

            // Print the k largest elements
            System.out.println(k + " largest elements of the said array are:");
            for (int i = 0; i < k; i++) {
                System.out.print(numbers[i] + " ");
            }
        }
    }