package javabasics_II;

import java.util.Scanner;

public class Exercise35 {
    /*
    Exercise 35:
    Write a Java program to accept a positive number and repeatedly add all its digits until the result has only one digit.

    Expected Output:

    Input a positive integer:  25
    7
    */
    public static void main(String[] args) {

        // Create a Scanner to read input from the user
        Scanner sc = new Scanner(System.in);

        // Prompt the user to input a positive integer
        System.out.print("Input a positive integer: ");
        int number = sc.nextInt();

        // Check if input is indeed positive
        if (number > 0) {
            // Print out the single-digit result
            System.out.println(reduceToSingleDigit(number));
        }
    }

    // Method to repeatedly sum the digits of a number until it's a single digit
    public static int reduceToSingleDigit(int value) {
        // Keep summing digits until the result is a one-digit number
        while (value > 9) {
            int digitSum = 0;

            // Calculate the sum of digits
            while (value != 0) {
                digitSum += value % 10;
                value /= 10;
            }

            // Assign the summed value back to 'value' for the next iteration
            value = digitSum;
        }
        // Return the single-digit result
        return value;
    }
}