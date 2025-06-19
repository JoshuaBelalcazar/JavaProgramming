package java_algorithms.sorting;
import java.util.Arrays;


public class Exercise362 {
    /*
      Exercise 362:
      Write a Java program to sort an array of given integers using the Counting Sort algorithm.

      Sample Output:
      Original Array:
      [7, -5, 3, 2, 1, 0, 45]
      Sorted Array:
      [-5, 0, 1, 2, 3, 7, 45]
     */


    // Perform Counting Sort on the array
    public void sort(int[] array, int min, int max) {
        int[] count = new int[max - min + 1];

        // Count frequency of each element
        for (int number : array) {
            count[number - min]++;
        }

        // Reconstruct sorted array
        int index = 0;
        for (int i = min; i <= max; i++) {
            while (count[i - min] > 0) {
                array[index++] = i;
                count[i - min]--;
            }
        }
    }

    // Main method to test Counting Sort
    public static void main(String[] args) {
        Exercise362 sorter = new Exercise362();
        int[] numbers = {7, -5, 3, 2, 1, 0, 45};
        int minValue = -5;
        int maxValue = 45;

        System.out.println("Original Array:");
        System.out.println(Arrays.toString(numbers));

        sorter.sort(numbers, minValue, maxValue);

        System.out.println("Sorted Array:");
        System.out.println(Arrays.toString(numbers));
    }
}

