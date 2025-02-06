package control_flow;

/*
Exercise 63:
Write a Java program that takes three numbers from the user and prints the greatest number.

Test Data:
Input the 1st number: 25
Input the 2nd number: 78
Input the 3rd number: 87

Expected Output:
The greatest: 87
*/

import java.util.Scanner;

public class Exercise63 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Prompt the user for three numbers
        System.out.print("Input the 1st number: ");
        int num1 = in.nextInt();

        System.out.print("Input the 2nd number: ");
        int num2 = in.nextInt();

        System.out.print("Input the 3rd number: ");
        int num3 = in.nextInt();

        // Assume the first number is the greatest
        int greatest = num1;

        // Compare with the second number
        if (num2 > greatest) {
            greatest = num2;
        }

        // Compare with the third number
        if (num3 > greatest) {
            greatest = num3;
        }

        // Display the greatest number
        System.out.println("The greatest: " + greatest);
    }
}
