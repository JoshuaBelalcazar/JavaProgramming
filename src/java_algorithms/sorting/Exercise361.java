package java_algorithms.sorting;

import java.util.Arrays;

public class Exercise361 {

    // Perform comb sort on the array
    public void sort(int[] array) {
        int length = array.length;
        float shrinkFactor = 1.3f;
        int gap = length;
        boolean swapped = true;

        while (gap > 1 || swapped) {
            if (gap > 1) {
                gap = (int) (gap / shrinkFactor);
            }

            swapped = false;

            for (int i = 0; i + gap < length; i++) {
                if (array[i] > array[i + gap]) {
                    swap(array, i, i + gap);
                    swapped = true;
                }
            }
        }
    }

    // Swap elements at positions i and j
    private void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    // Main method to test Comb Sort
    public static void main(String[] args) {
        Exercise361 sorter = new Exercise361();
        int[] numbers = {7, -5, 3, 2, 1, 0, 45};

        System.out.println("Original Array:");
        System.out.println(Arrays.toString(numbers));

        sorter.sort(numbers);

        System.out.println("Sorted Array:");
        System.out.println(Arrays.toString(numbers));
    }
}

