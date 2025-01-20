package javabasics;

import java.util.Scanner;

public class Exercise4 {
    public static void main(String[] args) {
        /*
        Exercise 4:
        Write a Java program to print the sum (addition), multiply, subtract, divide and remainder of two numbers.

                Test Data:
        Input first number: 125
        Input second number: 24
        */

        Scanner scannerTool = new Scanner(System.in);

        // Prompt the user for the first input
        System.out.print("Input first number: ");
        int primaryNumber = scannerTool.nextInt();

        // Prompt the user for the second input
        System.out.print("Input second number: ");
        int secondaryNumber = scannerTool.nextInt();

        // Perform and display addition
        System.out.println(primaryNumber + " + " + secondaryNumber + " = " + (primaryNumber + secondaryNumber));

        // Perform and display subtraction
        System.out.println(primaryNumber + " - " + secondaryNumber + " = " + (primaryNumber - secondaryNumber));

        // Perform and display multiplication
        System.out.println(primaryNumber + " x " + secondaryNumber + " = " + (primaryNumber * secondaryNumber));

        // Perform and display division
        System.out.println(primaryNumber + " / " + secondaryNumber + " = " + (primaryNumber / secondaryNumber));

        // Perform and display remainder
        System.out.println(primaryNumber + " mod " + secondaryNumber + " = " + (primaryNumber % secondaryNumber));
    }
}
