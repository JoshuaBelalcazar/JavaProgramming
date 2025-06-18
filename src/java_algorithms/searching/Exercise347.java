package java_algorithms.searching;

/*
  Exercise 347:
  Write a Java program to find a specified element in a given array of elements using Linear Search.

  Sample Output:
  Number found at index 4
 */

public class Exercise347 {

    public static void main(String[] args) {
        int[] numbers = {3, 2, 4, 5, 6, 6, 7, 8, 9, 9, 0, 9};
        int target = 6;

        int foundIndex = linearSearch(numbers, target);

        if (foundIndex == -1) {
            System.out.println("Not present in the array!");
        } else {
            System.out.println("Number found at index " + foundIndex);
        }
    }

    // Performs a linear search on the array
    private static int linearSearch(int[] array, int targetValue) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == targetValue) {
                return i;
            }
        }
        return -1;
    }
}

