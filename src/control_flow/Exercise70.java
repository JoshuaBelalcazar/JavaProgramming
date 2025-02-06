package control_flow;

/*
Exercise 70:
Write a Java program that accepts three numbers and prints "All numbers are equal" if all three numbers are equal,
"All numbers are different" if all three numbers are different and "Neither all are equal or different" otherwise.

Test Data:
Input first number: 2564
Input second number: 3526
Input third number: 2456

Expected Output:
All numbers are different
*/

import java.util.Scanner;

public class Exercise70 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Prompt the user to input three numbers
        System.out.print("Input first number: ");
        int x = in.nextInt();

        System.out.print("Input second number: ");
        int y = in.nextInt();

        System.out.print("Input third number: ");
        int z = in.nextInt();

        // Check if all numbers are equal
        if (x == y && x == z) {
            System.out.println("All numbers are equal");
        }
        // Check if any two numbers are equal
        else if (x == y || x == z || y == z) {
            System.out.println("Neither all are equal or different");
        }
        // If no numbers are equal, then all numbers are different
        else {
            System.out.println("All numbers are different");
        }
    }
}
