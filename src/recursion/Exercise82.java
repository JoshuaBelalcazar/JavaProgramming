package recursion;

/*
Exercise 82:
Write a Java recursive method to find the maximum element in an array.

Test Data:
Original Array: [34, 45, 34, 23, 56, 62, 27, 55]

Expected Output:
The maximum element in the array is: 62
*/

import java.util.Arrays;

public class Exercise82 {

    // Public method to initiate recursive maximum element search
    public static int findMaxElement(int[] arr) {
        return findMaxElement(arr, 0, arr.length - 1);
    }

    // Recursive helper method that finds the maximum element in the subarray arr[left...right]
    private static int findMaxElement(int[] arr, int left, int right) {
        // Base case: if there is only one element, return it
        if (left == right) {
            return arr[left];
        }

        // Divide the array segment into two halves
        int mid = (left + right) / 2;
        int maxLeft = findMaxElement(arr, left, mid);
        int maxRight = findMaxElement(arr, mid + 1, right);

        // Return the greater of the two halves
        return Math.max(maxLeft, maxRight);
    }

    public static void main(String[] args) {
        int[] array = {34, 45, 34, 23, 56, 62, 27, 55};
        System.out.println("Original Array: " + Arrays.toString(array));
        int maxElement = findMaxElement(array);
        System.out.println("The maximum element in the array is: " + maxElement);
    }
}
