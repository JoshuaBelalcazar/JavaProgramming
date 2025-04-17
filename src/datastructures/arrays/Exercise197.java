package datastructures.arrays;

/*
Exercise 197:
Write a Java program to find the second largest element in an array.

Sample Output:
Original numeric array : [10789, 2035, 1899, 1456, 2013, 1458, 2458, 1254, 1472, 2365, 1456, 2165, 1457, 2456]
Second largest value: 2458
*/

import java.util.Arrays;

public class Exercise197 {
    public static void main(String[] args) {
        // Declare and initialize the integer array
        int[] numbers = {
                10789, 2035, 1899, 1456, 2013,
                1458, 2458, 1254, 1472, 2365,
                1456, 2165, 1457, 2456
        };

        // Display the original array
        System.out.println("Original numeric array : " + Arrays.toString(numbers));

        // Sort the array in ascending order
        Arrays.sort(numbers);

        // Start from the end to find the second largest distinct element
        int max = numbers[numbers.length - 1];
        int index = numbers.length - 2;

        // Move backwards until a value smaller than the maximum is found
        while (index >= 0 && numbers[index] == max) {
            index--;
        }

        // Display result based on whether a second largest exists
        if (index >= 0) {
            System.out.println("Second largest value: " + numbers[index]);
        } else {
            System.out.println("No second largest value found (all elements are equal).");
        }
    }
}
