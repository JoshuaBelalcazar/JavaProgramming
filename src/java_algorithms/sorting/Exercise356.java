package java_algorithms.sorting;

import java.util.Arrays;
/*
  Exercise 356:
  Write a Java program to sort an array of given integers using the Merge Sort Algorithm.

  Sample Output:
  Original Array:
  [7, -5, 3, 2, 1, 0, 45]
  Sorted Array:
  [-5, 0, 1, 2, 3, 7, 45]
 */


public class Exercise356 {

    // Main sorting function (recursive)
    public void sort(int[] array, int left, int right) {
        if (left < right) {
            int middle = (left + right) / 2;

            // Sort left half
            sort(array, left, middle);
            // Sort right half
            sort(array, middle + 1, right);
            // Merge both sorted halves
            merge(array, left, middle, right);
        }
    }

    // Merge two subarrays of array[]
    private void merge(int[] array, int left, int middle, int right) {
        int leftSize = middle - left + 1;
        int rightSize = right - middle;

        int[] leftArray = new int[leftSize];
        int[] rightArray = new int[rightSize];

        // Copy data to temp arrays
        for (int i = 0; i < leftSize; i++)
            leftArray[i] = array[left + i];
        for (int j = 0; j < rightSize; j++)
            rightArray[j] = array[middle + 1 + j];

        int i = 0, j = 0;
        int k = left;

        // Merge the temp arrays
        while (i < leftSize && j < rightSize) {
            if (leftArray[i] <= rightArray[j]) {
                array[k++] = leftArray[i++];
            } else {
                array[k++] = rightArray[j++];
            }
        }

        // Copy remaining elements of leftArray
        while (i < leftSize) {
            array[k++] = leftArray[i++];
        }

        // Copy remaining elements of rightArray
        while (j < rightSize) {
            array[k++] = rightArray[j++];
        }
    }

    // Main method for testing
    public static void main(String[] args) {
        Exercise356 sorter = new Exercise356();
        int[] numbers = {7, -5, 3, 2, 1, 0, 45};

        System.out.println("Original Array:");
        System.out.println(Arrays.toString(numbers));

        sorter.sort(numbers, 0, numbers.length - 1);

        System.out.println("Sorted Array:");
        System.out.println(Arrays.toString(numbers));
    }
}

