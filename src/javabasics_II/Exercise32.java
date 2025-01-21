package javabasics_II;

import java.util.Arrays;

public class Exercise32 {
    /*
    Exercise 32:
    Write a Java program to add one to a positive number represented as an array of digits.

    Sample array: [9, 9, 9, 9] which represents 9999
    Output: [1, 0, 0, 0, 0].

    Expected Output:

    Original array: [9, 9, 9, 9]
    Array of digits: [1, 0, 0, 0, 0]

     */
    public static void main(String[] args) {

// Define an array representing the number 9999
        int[] digits = {9, 9, 9, 9};

        // Display the original array
        System.out.println("Original array: " + Arrays.toString(digits));

        // Get the result after adding one
        int[] updatedDigits = addOneToArray(digits);

        // Display the new array of digits
        System.out.println("Array of digits: " + Arrays.toString(updatedDigits));
    }

    public static int[] addOneToArray(int[] digitsArr) {
        // Traverse from the last index towards the front
        for (int idx = digitsArr.length - 1; idx >= 0; idx--) {

            // If the digit is less than 9, just increment and reset the following digits to 0
            if (digitsArr[idx] != 9) {
                digitsArr[idx] += 1;
                for (int j = idx + 1; j < digitsArr.length; j++) {
                    digitsArr[j] = 0;
                }
                return digitsArr;
            }
        }

        // If we've reached this point, all digits were 9, so we need a bigger array
        int[] newArray = new int[digitsArr.length + 1];
        newArray[0] = 1;
        return newArray;
    }
}