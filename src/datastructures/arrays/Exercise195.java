package datastructures.arrays;

/*
Exercise 195:
Write a Java program to reverse an array of integer values.

Sample Output:
Original array : [1789, 2035, 1899, 1456, 2013, 1458, 2458, 1254, 1472, 2365, 1456, 2165, 1457, 2456]
Reverse array  : [2456, 1457, 2165, 1456, 2365, 1472, 1254, 2458, 1458, 2013, 1456, 1899, 2035, 1789]
*/

import java.util.Arrays;

public class Exercise195 {

    // Method to reverse an array in place
    public static void reverseArray(int[] array) {
        int left = 0;
        int right = array.length - 1;

        while (left < right) {
            int temp = array[left];
            array[left] = array[right];
            array[right] = temp;

            left++;
            right--;
        }
    }

    // Main method
    public static void main(String[] args) {
        int[] myArray = {
                1789, 2035, 1899, 1456, 2013,
                1458, 2458, 1254, 1472, 2365,
                1456, 2165, 1457, 2456
        };

        System.out.println("Original array : " + Arrays.toString(myArray));

        reverseArray(myArray);

        System.out.println("Reverse array  : " + Arrays.toString(myArray));
    }
}

