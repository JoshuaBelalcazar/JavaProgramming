package control_flow;

/*
Exercise 66:
Write a Java program that reads two floating-point numbers and tests whether they are the same up to three decimal places.

Test Data:
Input floating-point number: 25.586
Input floating-point another number: 25.589

Expected Output:
They are different
*/

import java.util.Scanner;

public class Exercise66 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Read two floating-point numbers from the user
        System.out.print("Input floating-point number: ");
        double x = in.nextDouble();
        System.out.print("Input floating-point another number: ");
        double y = in.nextDouble();

        // Round both numbers to three decimal places
        x = Math.round(x * 1000) / 1000.0;
        y = Math.round(y * 1000) / 1000.0;

        // Compare the rounded values and output the result
        if (x == y) {
            System.out.println("They are the same up to three decimal places");
        } else {
            System.out.println("They are different");
        }
    }
}
