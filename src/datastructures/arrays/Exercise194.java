package datastructures.arrays;

/*
Exercise 194:
Write a Java program to find the maximum and minimum value of an array.

Sample Output:
Original Array: [25, 14, 56, 15, 36, 56, 77, 18, 29, 49]
Maximum value for the above array = 77
Minimum value for the above array = 14
*/

import java.util.Arrays;

public class Exercise194 {

    // Method to calculate max and min values from the array
    public static int[] getMaxMin(int[] arr) {
        int max = arr[0];
        int min = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max)
                max = arr[i];
            if (arr[i] < min)
                min = arr[i];
        }

        return new int[]{max, min};
    }

    // Main method
    public static void main(String[] args) {
        int[] myArray = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};

        int[] result = getMaxMin(myArray);

        System.out.println("Original Array: " + Arrays.toString(myArray));
        System.out.println("Maximum value for the above array = " + result[0]);
        System.out.println("Minimum value for the above array = " + result[1]);
    }
}

