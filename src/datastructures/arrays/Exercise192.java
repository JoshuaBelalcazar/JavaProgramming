package datastructures.arrays;

/*
Exercise 192:
Write a Java program to sum values of an array.
*/

public class Exercise192 {
    public static void main(String[] args) {
        // Declare and initialize an integer array.
        int[] myArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        // Variable to store the sum
        int sum = 0;

        // Loop through the array and add each element to sum
        for (int num : myArray) {
            sum += num;
        }

        // Print the result
        System.out.println("The sum is " + sum);
    }
}

