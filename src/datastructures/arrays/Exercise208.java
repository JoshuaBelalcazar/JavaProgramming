package datastructures.arrays;

/*
Exercise 208:
Write a Java program to sort a binary array in linear time.
*/

import java.util.Arrays;

public class Exercise208 {

    // Method to sort a binary array using linear time
    public static void sortBinaryArray(int[] b_nums) {
        int zeroIndex = 0;

        // First pass: Place all 0s at the beginning
        for (int i = 0; i < b_nums.length; i++) {
            if (b_nums[i] == 0) {
                b_nums[zeroIndex++] = 0;
            }
        }

        // Fill the remaining elements with 1s
        for (int i = zeroIndex; i < b_nums.length; i++) {
            b_nums[i] = 1;
        }
    }

    public static void main(String[] args) {
        int[] b_nums = {0, 1, 1, 0, 1, 1, 0, 1, 0, 0};

        System.out.println("Original array: " + Arrays.toString(b_nums));

        sortBinaryArray(b_nums);

        System.out.println("After sorting: " + Arrays.toString(b_nums));
    }
}
