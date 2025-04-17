package datastructures.arrays;

/*
Exercise 196:
Write a Java program to remove duplicate elements from an array.

Sample Output:
Original Array :
0	3	-2	4	3	2
Array with unique values :
0	3	-2	4	2
---------------------------
Original Array :
10	22	10	20	11	22
Array with unique values :
10	22	11	20
---------------------------
*/

import java.util.Arrays;

public class Exercise196 {

    // Method to remove duplicate values from an integer array
    public static void removeDuplicates(int[] array) {
        System.out.println("Original Array : ");
        for (int value : array) {
            System.out.print(value + "\t");
        }

        int length = array.length;

        // Process to remove duplicates in-place
        for (int i = 0; i < length; i++) {
            for (int j = i + 1; j < length; j++) {
                if (array[i] == array[j]) {
                    array[j] = array[length - 1];
                    length--;
                    j--;
                }
            }
        }

        // Copy unique elements to a new array
        int[] uniqueArray = Arrays.copyOf(array, length);

        // Output the result
        System.out.println("\nArray with unique values : ");
        for (int value : uniqueArray) {
            System.out.print(value + "\t");
        }
        System.out.println("\n---------------------------");
    }

    public static void main(String[] args) {
        removeDuplicates(new int[]{0, 3, -2, 4, 3, 2});
        removeDuplicates(new int[]{10, 22, 10, 20, 11, 22});
    }
}
