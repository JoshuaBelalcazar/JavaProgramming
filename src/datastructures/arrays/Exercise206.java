package datastructures.arrays;

/*
Exercise 206:
Write a Java program to find the rotation count in a given rotated sorted array of integers.
*/

public class Exercise206 {

    // Method to count the number of rotations in a rotated sorted array
    public static int countRotations(int[] arr) {
        int minValue = arr[0];
        int minIndex = 0;

        // Find index of the minimum element (rotation count)
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < minValue) {
                minValue = arr[i];
                minIndex = i;
            }
        }
        return minIndex;
    }

    public static void main(String[] args) {
        int[] arr1 = {35, 32, 30, 14, 18, 21, 27};
        int[] arr2 = {35, 32, 14, 18, 21, 27};
        int[] arr3 = {35, 14, 18, 21, 27};

        System.out.println("Rotation count in arr1: " + countRotations(arr1)); // 3
        System.out.println("Rotation count in arr2: " + countRotations(arr2)); // 2
        System.out.println("Rotation count in arr3: " + countRotations(arr3)); // 1
    }
}

