package java_algorithms.sorting;
import java.util.Arrays;
/*
  Exercise 359:
  Write a Java program to sort an array of given integers using the Insertion Sort algorithm.

  Sample Output:
  Original Array:
  [7, -5, 3, 2, 1, 0, 45]
  Sorted Array:
  [-5, 0, 1, 2, 3, 7, 45]
 */



public class Exercise359 {

    // Perform insertion sort
    public void sort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int currentValue = array[i];
            int j = i - 1;

            // Shift elements that are greater than currentValue to the right
            while (j >= 0 && array[j] > currentValue) {
                array[j + 1] = array[j];
                j--;
            }

            // Insert currentValue into its correct position
            array[j + 1] = currentValue;
        }
    }

    // Main method to test insertion sort
    public static void main(String[] args) {
        Exercise359 sorter = new Exercise359();
        int[] numbers = {7, -5, 3, 2, 1, 0, 45};

        System.out.println("Original Array:");
        System.out.println(Arrays.toString(numbers));

        sorter.sort(numbers);

        System.out.println("Sorted Array:");
        System.out.println(Arrays.toString(numbers));
    }
}
