package datastructures.arrays;

/*
Exercise 205:
Write a Java program to cyclically rotate a given array clockwise by one.
*/

import java.util.Arrays;

public class Exercise205 {

    // Method to cyclically rotate an array clockwise by one position
    public static void rotateClockwiseByOne(int[] arr) {
        if (arr == null || arr.length <= 1) return;

        int lastElement = arr[arr.length - 1];

        // Shift elements to the right
        for (int i = arr.length - 1; i > 0; i--) {
            arr[i] = arr[i - 1];
        }

        // Place the last element at the beginning
        arr[0] = lastElement;
    }

    public static void main(String[] args) {
        int[] array = {10, 20, 30, 40, 50, 60};

        System.out.println("Original array:");
        System.out.println(Arrays.toString(array));

        rotateClockwiseByOne(array);

        System.out.println("Rotated array:");
        System.out.println(Arrays.toString(array));
    }
}
