package java_algorithms.searching;

/*
  Exercise 346:
  Write a Java program to find a specified element in a given array of elements using Binary Search.

  Sample Output:
  7 is at index 3
 */

public class Exercise346 {

    // Binary search implementation
    public static int binarySearch(int[] sortedArray, int targetValue) {
        int low = 0;
        int high = sortedArray.length - 1;

        while (low <= high) {
            int mid = (low + high) >>> 1; // Unsigned right shift to prevent overflow

            if (sortedArray[mid] > targetValue) {
                high = mid - 1;
            } else if (sortedArray[mid] < targetValue) {
                low = mid + 1;
            } else {
                return mid; // Element found
            }
        }

        return -1; // Element not found
    }

    public static void main(String[] args) {
        int[] numbers = {1, 5, 6, 7, 8, 11};
        int target = 7;

        int resultIndex = binarySearch(numbers, target);

        if (resultIndex == -1) {
            System.out.println(target + " is not in the array");
        } else {
            System.out.println(target + " is at index " + resultIndex);
        }
    }
}

