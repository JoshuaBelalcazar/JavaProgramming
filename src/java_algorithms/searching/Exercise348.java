package java_algorithms.searching;

/*
  Exercise 348:
  Write a Java program to find a specified element in a given sorted array of elements using Jump Search.

  Sample Output:
  120 is found at index 12
 */

public class Exercise348 {

    public static void main(String[] args) {
        int[] sortedArray = {1, 2, 3, 4, 5, 6, 7, 8, 21, 34, 45, 91, 120, 130, 456, 564};
        int target = 120;

        int resultIndex = jumpSearch(sortedArray, target);

        if (resultIndex != -1) {
            System.out.println(target + " is found at index " + resultIndex);
        } else {
            System.out.println(target + " is not in the array.");
        }
    }

    // Performs jump search on a sorted array
    public static int jumpSearch(int[] array, int target) {
        int length = array.length;
        int step = (int) Math.floor(Math.sqrt(length));  // Optimal block size
        int prev = 0;

        // Finding the block where the target may exist
        while (array[Math.min(step, length) - 1] < target) {
            prev = step;
            step += (int) Math.floor(Math.sqrt(length));
            if (prev >= length) {
                return -1;
            }
        }

        // Linear search within the identified block
        while (array[prev] < target) {
            prev++;
            if (prev == Math.min(step, length)) {
                return -1;
            }
        }

        // Check if element is found
        if (array[prev] == target) {
            return prev;
        }

        return -1; // Element not found
    }
}

