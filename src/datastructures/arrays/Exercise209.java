package datastructures.arrays;

/*
Exercise 209:
Write a Java program to find a contiguous subarray within a given array of integers with the largest sum.
*/

public class Exercise209 {

    // Method to compute the maximum sum of a contiguous subarray using Kadane's algorithm
    public static int maxContiguousSubarraySum(int[] arr) {
        int maxSoFar = arr[0];  // Stores the overall max
        int currentMax = arr[0]; // Stores the max ending here

        for (int i = 1; i < arr.length; i++) {
            // Either start a new subarray at current element or extend previous subarray
            currentMax = Math.max(arr[i], currentMax + arr[i]);
            maxSoFar = Math.max(maxSoFar, currentMax);
        }

        return maxSoFar;
    }

    public static void main(String[] args) {
        int[] A = {1, 2, -3, -4, 0, 6, 7, 8, 9};

        System.out.println("Input array: ");
        for (int n : A) {
            System.out.print(n + " ");
        }

        int maxSum = maxContiguousSubarraySum(A);
        System.out.println("\nThe largest sum of contiguous sub-array: " + maxSum);
    }
}
