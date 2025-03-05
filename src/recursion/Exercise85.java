package recursion;

/*
Exercise 85:
Write a Java recursive method to check if a given array is sorted in ascending order.

Test Data:
Array1: [1, 2, 3, 4, 5]
Array2: [4, 5, 3, 2, 1]

Expected Output:
Original Array: [1, 2, 3, 4, 5]
Is array1 sorted in ascending order? true
Original Array: [4, 5, 3, 2, 1]
Is array2 sorted in ascending order? false
*/

import java.util.Arrays;

public class Exercise85 {
    // Public method to check if an array is sorted in ascending order
    public static boolean isSorted(int[] arr) {
        return isSorted(arr, 0);
    }

    // Private recursive helper method that checks sorted order starting from index
    private static boolean isSorted(int[] arr, int index) {
        // Base case: if we reach the last element, the array is sorted
        if (index == arr.length - 1) {
            return true;
        }
        // If current element is greater than the next element, array is not sorted
        if (arr[index] > arr[index + 1]) {
            return false;
        }
        // Recursive case: check the rest of the array
        return isSorted(arr, index + 1);
    }

    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4, 5};
        System.out.println("Original Array: " + Arrays.toString(array1));
        boolean sorted1 = isSorted(array1);
        System.out.println("Is array1 sorted in ascending order? " + sorted1);

        int[] array2 = {4, 5, 3, 2, 1};
        System.out.println("Original Array: " + Arrays.toString(array2));
        boolean sorted2 = isSorted(array2);
        System.out.println("Is array2 sorted in ascending order? " + sorted2);
    }
}
