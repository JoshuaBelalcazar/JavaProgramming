package javabasics;

import java.util.Scanner;

public class Exercise8 {
    public static void main(String[] args) {
        /*
        Exercise 8:
        Write a Java program to swap two variables.
         */

        Scanner userInput = new Scanner(System.in);

        // Prompt for the first integer
        System.out.print("Input the first number: ");
        int firstValue = userInput.nextInt();

        // Prompt for the second integer
        System.out.print("Input the second number: ");
        int secondValue = userInput.nextInt();

        // Swap the values using a temporary variable
        int temp = firstValue;
        firstValue = secondValue;
        secondValue = temp;

        // Display the results after swapping
        System.out.println("Swapped values are: " + firstValue + " and " + secondValue);
    }x
}