package datastructures.arrays;

/*
Exercise 206:
Write a Java program to find the rotation count in a given rotated sorted array of integers.
*/

import java.util.Arrays;

public class Exercise207 {
/*
Exercise 207:
Write a Java program to replace every element with the next greatest element (from the right side)
in a given array of integers. Replace the last element with -1.
*/


    public class Exercise207 {

        public static void main(String[] args) {
            int[] nums = {45, 20, 100, 23, -5, 2, -6};

            System.out.println("Original Array:");
            System.out.println(Arrays.toString(nums));

            int[] modifiedArray = replaceWithNextGreatest(nums);

            System.out.println("Modified Array:");
            System.out.println(Arrays.toString(modifiedArray));
        }

        // Method to replace each element with the next greatest element on its right
        public static int[] replaceWithNextGreatest(int[] arr) {
            int n = arr.length;
            int maxFromRight = arr[n - 1];
            arr[n - 1] = -1;  // Last element becomes -1

            for (int i = n - 2; i >= 0; i--) {
                int temp = arr[i];
                arr[i] = maxFromRight;
                if (temp > maxFromRight) {
                    maxFromRight = temp;
                }
            }

            return arr;
        }
    }
