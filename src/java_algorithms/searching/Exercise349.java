package java_algorithms.searching;

/*
  Exercise 349:
  Write a Java program to find a specified element in a given array of elements using Interpolation Search.

  Sample Output:
  91 is found at index 13
 */

public class Exercise349 {

    public static void main(String[] args) {
        int[] sortedArray = {1, 2, 2, 3, 4, 5, 5, 6, 7, 8, 21, 34, 45, 91, 120, 130, 456, 564};
        int target = 91;

        int resultIndex = interpolationSearch(sortedArray, target);

        if (resultIndex != -1) {
            System.out.println(target + " is found at index " + resultIndex);
        } else {
            System.out.println(target + " is not in the array.");
        }
    }

    // Performs interpolation search on a sorted array
    public static int interpolationSearch(int[] array, int target) {
        int low = 0;
        int high = array.length - 1;

        while (low <= high && array[low] <= target && array[high] >= target) {
            if (array[low] == array[high]) {
                break; // Avoid division by zero
            }

            // Estimate the position of the target using interpolation
            int mid = low + ((target - array[low]) * (high - low)) / (array[high] - array[low]);

            if (array[mid] == target) {
                return mid;
            } else if (array[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        // Final check if target is at the low bound
        return (array[low] == target) ? low : -1;
    }
}

