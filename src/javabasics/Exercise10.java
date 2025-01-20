package javabasics;

import java.util.Scanner;

public class Exercise10 {
    public static void main(String[] args) {
        /*
        Exercise 10:
        Write a Java program to add two binary numbers.
        Input Data:
        Input first binary number: 10
        Input second binary number: 11
        Expected Output

        Sum of two binary numbers: 101
         */


        long binNum1, binNum2;
        int index = 0, carry = 0;

        // Array to accumulate the result of adding two binary numbers
        int[] result = new int[20];

        Scanner inputScanner = new Scanner(System.in);

        // Prompt the user for the first binary number
        System.out.print("Input first binary number: ");
        binNum1 = inputScanner.nextLong();

        // Prompt the user for the second binary number
        System.out.print("Input second binary number: ");
        binNum2 = inputScanner.nextLong();

        // Perform the addition while either binary number still has digits
        while (binNum1 != 0 || binNum2 != 0) {
            result[index++] = (int) ((binNum1 % 10 + binNum2 % 10 + carry) % 2);
            carry = (int) ((binNum1 % 10 + binNum2 % 10 + carry) / 2);
            binNum1 /= 10;
            binNum2 /= 10;
        }

        // If there's a leftover carry, place it in the result
        if (carry != 0) {
            result[index++] = carry;
        }

        // Prepare for printing by adjusting the index
        --index;

        // Display the sum of the two binary numbers
        System.out.print("Sum of two binary numbers: ");
        while (index >= 0) {
            System.out.print(result[index--]);
        }
        System.out.println();
    }
}