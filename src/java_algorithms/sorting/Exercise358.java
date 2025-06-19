package java_algorithms.sorting;

import java.util.Arrays;

public class Exercise358 {

    // Perform selection sort
    public static void sort(int[] array) {
        int n = array.length;

        for (int current = 0; current < n - 1; current++) {
            int minIndex = current;

            for (int i = current + 1; i < n; i++) {
                if (array[i] < array[minIndex]) {
                    minIndex = i;
                }
            }

            // Swap current element with the minimum found
            int temp = array[current];
            array[current] = array[minIndex];
            array[minIndex] = temp;
        }
    }

    // Test the selection sort
    public static void main(String[] args) {
        int[] numbers = {7, -5, 3, 2, 1, 0, 45};

        System.out.println("Original Array:");
        System.out.println(Arrays.toString(numbers));

        sort(numbers);

        System.out.println("Sorted Array:");
        System.out.println(Arrays.toString(numbers));
    }
}

