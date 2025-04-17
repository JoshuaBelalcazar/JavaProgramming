package datastructures.arrays;

/*
Exercise 201:
Write a Java program to move all 0's to the end of an array.
Maintain the relative order of the other (non-zero) array elements.
*/

import java.util.Arrays;

public class Exercise201 {
    public static void main(String[] args) {
        int[] array_nums = {0, 0, 1, 0, 3, 0, 5, 0, 6};

        System.out.println("Original array:");
        System.out.println(Arrays.toString(array_nums));

        moveZerosToEnd(array_nums);

        System.out.println("\nAfter moving 0's to the end of the array:");
        System.out.println(Arrays.toString(array_nums));
    }

    // Method to move all zeros to the end while maintaining order of non-zero elements
    public static void moveZerosToEnd(int[] arr) {
        int insertPos = 0;

        // Shift non-zero values forward
        for (int num : arr) {
            if (num != 0) {
                arr[insertPos++] = num;
            }
        }

        // Fill the rest of the array with zeros
        while (insertPos < arr.length) {
            arr[insertPos++] = 0;
        }
    }
}

