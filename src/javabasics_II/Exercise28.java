package javabasics_II;

import java.util.Scanner;

public class Exercise28 {
    /*
    Exercise 28:
    Write a Java program to multiply two given integers without using the multiply operator (*).

    Input the first number: 25
    Input the second number: 5
    Result: 125
     */

    // Method to multiply two integers using repeated addition/subtraction
    public static int multiply(int a, int b) {
        int product = 0;

        // Check if the result should be negative
        boolean negativeResult = (a < 0 && b >= 0) || (b < 0 && a >= 0);

        // Convert both values to their absolute values for easier looping
        int absA = Math.abs(a);
        int absB = Math.abs(b);

        // Repeatedly add or subtract
        for (int i = 0; i < absA; i++) {
            // If result should be negative, subtract absB from product
            // Otherwise, add absB to product
            product += (negativeResult ? -absB : absB);
        }

        return product;
    }


    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);

        // Prompt user for the first integer
        System.out.print("Input the first number: ");
        int firstNum = userInput.nextInt();

        // Prompt user for the second integer
        System.out.print("Input the second number: ");
        int secondNum = userInput.nextInt();

        // Show the multiplication result
        System.out.println("\nResult: " + multiply(firstNum, secondNum));
    }
}
