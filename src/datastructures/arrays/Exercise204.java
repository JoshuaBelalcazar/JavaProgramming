package datastructures.arrays;

/*
Exercise 204:
Write a Java program to print all the LEADERS in the array.
Note: An element is a leader if it is greater than all the elements to its right side.
*/

public class Exercise204 {
    public static void main(String[] args) {
        int[] arr = {10, 9, 14, 23, 15, 0, 9};

        System.out.print("Leaders in the array: ");
        printLeaders(arr);
    }

    // Method to print all leaders in the array
    public static void printLeaders(int[] arr) {
        int size = arr.length;

        for (int i = 0; i < size; i++) {
            boolean isLeader = true;

            // Check if current element is greater than all elements to its right
            for (int j = i + 1; j < size; j++) {
                if (arr[i] <= arr[j]) {
                    isLeader = false;
                    break;
                }
            }

            if (isLeader) {
                System.out.print(arr[i] + " ");
            }
        }
        System.out.println(); // For a clean newline after output
    }
}
