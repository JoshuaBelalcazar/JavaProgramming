package java_algorithms.searching;

/*
  Exercise 351:
  Write a Java program to find a specified element in a given array of elements using Ternary Search.

  Sample Output:
  Original array:
  [0, 1, 2, 3, 5, 7, 9, 12, 15, 17, 18, 21, 25, 32, 52, 54, 75, 89, 90, 93, 97, 104, 120]
  Input an element to search:
  25
  25 element found at position 12
 */

import java.util.Arrays;
import java.util.Scanner;

public class Exercise351 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] sortedArray = {0, 1, 2, 3, 5, 7, 9, 12, 15, 17, 18, 21, 25, 32, 52, 54, 75, 89, 90, 93, 97, 104, 120};

        System.out.println("Original array:");
        System.out.println(Arrays.toString(sortedArray));

        System.out.println("Input an element to search:");
        int target = scanner.nextInt();

        int resultIndex = ternarySearch(sortedArray, target, 0, sortedArray.length - 1);

        if (resultIndex == -1) {
            System.out.println("\n" + target + " element not found");
        } else {
            System.out.println("\n" + target + " element found at position " + resultIndex);
        }
    }

    // Recursive ternary search algorithm
    private static int ternarySearch(int[] array, int target, int left, int right) {
        if (left > right) {
            return -1;
        }

        int mid1 = left + (right - left) / 3;
        int mid2 = right - (right - left) / 3;

        if (array[mid1] == target) {
            return mid1;
        } else if (array[mid2] == target) {
            return mid2;
        } else if (target < array[mid1]) {
            return ternarySearch(array, target, left, mid1 - 1);
        } else if (target > array[mid2]) {
            return ternarySearch(array, target, mid2 + 1, right);
        } else {
            return ternarySearch(array, target, mid1 + 1, mid2 - 1);
        }
    }
}

