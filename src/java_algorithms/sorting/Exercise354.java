package java_algorithms.sorting;

import java.util.Arrays;
/*
  Exercise 354:
  Write a Java program to sort an array of given integers using the Bubble Sorting Algorithm.

  Sample Output:
  Original Array:
  [7, -5, 3, 2, 1, 0, 45]
  Sorted Array:
  [-5, 0, 1, 2, 3, 7, 45]
 */


public class Exercise354 {

    // Performs bubble sort on the given array
    public void bubbleSort(int[] array) {
        int n = array.length;

        for (int pass = 0; pass < n - 1; pass++) {
            for (int i = 0; i < n - pass - 1; i++) {
                if (array[i] > array[i + 1]) {
                    // Swap adjacent elements if out of order
                    int temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        Exercise354 sorter = new Exercise354();
        int[] numbers = {7, -5, 3, 2, 1, 0, 45};

        System.out.println("Original Array:");
        System.out.println(Arrays.toString(numbers));

        sorter.bubbleSort(numbers);

        System.out.println("Sorted Array:");
        System.out.println(Arrays.toString(numbers));
    }
}
