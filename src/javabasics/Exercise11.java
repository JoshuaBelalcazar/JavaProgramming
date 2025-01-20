package javabasics;

import java.util.Scanner;

public class Exercise11 {
    public static void main(String[] args) {
        /*
        Exercise 11:
        Write a Java program to convert a binary number to a decimal number.
        Input Data:
        Input a binary number: 100
        Expected Output

        Decimal Number: 4
         */

        // Prepare to read binary number from user
        Scanner userInput = new Scanner(System.in);

        // Declare necessary variables
        long binaryVal;
        long decimalVal = 0;
        long factor = 1;
        long remainderPart;

        // Prompt the user for a binary number
        System.out.print("Input a binary number: ");
        binaryVal = userInput.nextLong();

        // Convert the binary number to its decimal equivalent
        while (binaryVal != 0) {
            remainderPart = binaryVal % 10;
            decimalVal += remainderPart * factor;
            factor *= 2;
            binaryVal /= 10;
        }

        // Display the resulting decimal number
        System.out.println("Decimal Number: " + decimalVal);
    }
}