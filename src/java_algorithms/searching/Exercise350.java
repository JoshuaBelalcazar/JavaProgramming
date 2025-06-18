package java_algorithms.searching;

/*
  Exercise 350:
  Write a Java program to find a specified element in a given sorted array of elements using Exponential Search.

  Sample Output:
  120 is found at index 12
 */

import java.util.Arrays;

public class Exercise350 {

    public static void main(String[] args) {
        int[] sortedArray = {1, 2, 3, 4, 5, 6, 7, 8, 21, 34, 45, 91, 120, 130, 456, 564};
        int target = 120;

        int resultIndex = exponentialSearch(sortedArray, target);

        if (resultIndex >= 0) {
            System.out.println(target + " is found at index " + resultIndex);
        } else {
            System.out.println(target + " is not in the array.");
        }
    }

    // Exponential Search algorithm for sorted arrays
    private static int exponentialSearch(int[] array, int target) {
        if (array.length == 0) return -1;

        if (array[0] == target) return 0;

        int bound = 1;
        while (bound < array.length && array[bound] <= target) {
            bound *= 2;
        }

        // Perform binary search within the found range
        return Arrays.binarySearch(array, bound / 2, Math.min(bound, array.length), target);
    }
}
