package control_flow;

/*
Exercise 62:
Write a Java program to solve quadratic equations (use if, else if and else).

Test Data:
Input a: 1
Input b: 5
Input c: 1

Expected Output:
The roots are -0.20871215252208009 and -4.7912878474779195
*/

import java.util.Scanner;

public class Exercise62 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt the user for coefficients a, b, and c
        System.out.print("Input a: ");
        double a = input.nextDouble();

        System.out.print("Input b: ");
        double b = input.nextDouble();

        System.out.print("Input c: ");
        double c = input.nextDouble();

        // Calculate the discriminant (b^2 - 4ac)
        double discriminant = b * b - 4.0 * a * c;

        // Determine and display the roots based on the discriminant value
        if (discriminant > 0.0) {
            double r1 = (-b + Math.sqrt(discriminant)) / (2.0 * a);
            double r2 = (-b - Math.sqrt(discriminant)) / (2.0 * a);
            System.out.println("The roots are " + r1 + " and " + r2);
        } else if (discriminant == 0.0) {
            double r1 = -b / (2.0 * a);
            System.out.println("The root is " + r1);
        } else {
            System.out.println("The equation has no real roots.");
        }
    }
}

