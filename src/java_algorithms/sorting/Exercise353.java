package java_algorithms.sorting;

import java.util.Arrays;
/*
  Exercise 353:
  Write a Java program to sort an array of given integers using the Quick Sort algorithm.

  Sample Output:
  Original Array:
  [7, -5, 3, 2, 1, 0, 45]
  Sorted Array:
  [-5, 0, 1, 2, 3, 7, 45]
 */


public class Exercise353 {

    private int[] array;

    public void sort(int[] input) {
        if (input == null || input.length == 0) return;
        this.array = input;
        quickSort(0, input.length - 1);
    }

    // Recursive Quick Sort
    private void quickSort(int low, int high) {
        int left = low;
        int right = high;
        int pivot = array[low + (high - low) / 2];

        while (left <= right) {
            while (array[left] < pivot) {
                left++;
            }
            while (array[right] > pivot) {
                right--;
            }

            if (left <= right) {
                swap(left, right);
                left++;
                right--;
            }
        }

        if (low < right) quickSort(low, right);
        if (left < high) quickSort(left, high);
    }

    // Swap elements at given indices
    private void swap(int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    public static void main(String[] args) {
        Exercise353 sorter = new Exercise353();
        int[] numbers = {7, -5, 3, 2, 1, 0, 45};

        System.out.println("Original Array:");
        System.out.println(Arrays.toString(numbers));

        sorter.sort(numbers);

        System.out.println("Sorted Array:");
        System.out.println(Arrays.toString(numbers));
    }
}

