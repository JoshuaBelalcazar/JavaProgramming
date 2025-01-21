package javabasics_I;

import java.util.Scanner;

public class Exercise13 {
    public static void main(String[] args) {

        /*
        Exercise 13:
        Write a Java program to reverse a string.
        Input Data:
        Input a string: The quick brown fox
        Expected Output

        Reverse string: xof nworb kciuq ehT
         */
        // Create a scanner to read user input
        Scanner scIn = new Scanner(System.in);

        // Prompt user for a string
        System.out.print("Input a string: ");

        // Convert the entered string to a character array
        char[] inputArray = scIn.nextLine().toCharArray();

        // Indicate we're about to print the reversed version
        System.out.print("Reverse string: ");

        // Traverse the character array in reverse order and display each character
        for (int idx = inputArray.length - 1; idx >= 0; idx--) {
            System.out.print(inputArray[idx]);
        }

        // Move to the next line
        System.out.println();
    }
}
