package javabasics_II;

import java.util.Scanner;

public class Exercise38 {
    public static void main(String[] args) {
        /*
    Exercise 38:
    Write a Java program to test whether there are two integers x and y such that x^2 + y^2 is equal to a given positive number.

    Expected Output:

    Input a positive integer:  25
    Is 25 sum of two square numbers? true
     */

        // Prepare to read a positive integer from the user
        Scanner sc = new Scanner(System.in);
        System.out.print("Input a positive integer: ");
        int number = sc.nextInt();

        // If the number is positive, determine whether it's the sum of two squares
        if (number > 0) {
            System.out.println("Is " + number + " sum of two square numbers? " + isSumOfTwoSquares(number));
        }
    }

    // Method to verify if a given number can be expressed as x^2 + y^2
    public static boolean isSumOfTwoSquares(int n) {
        // Set left pointer at 0, right pointer at the square root of n
        int left = 0, right = (int) Math.sqrt(n);

        while (left <= right) {
            int sum = left * left + right * right;
            if (sum == n) {
                return true;
            } else if (sum < n) {
                left++;
            } else {
                right--;
            }
        }
        // If we exhaust all possibilities, return false
        return false;
    }
}