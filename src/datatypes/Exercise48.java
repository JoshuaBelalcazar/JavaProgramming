package datatypes;

/*
Exercise 48:
Write a Java program that reads a number and displays the square, cube, and fourth power.

Test Data:
Input the side length value: [user input]

Expected Output (values formatted to 2 decimal places):
Square:      <value>
Cube:        <value>
Fourth power: <value>
*/

import java.util.Scanner;

public class Exercise48 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input the side length value: ");
        double value = input.nextDouble();

        // Calculate square, cube, and fourth power of the input value
        double square = value * value;
        double cube = value * value * value;
        double fourthPower = Math.pow(value, 4);

        // Display the results using formatted output
        System.out.printf("Square: %12.2f\n", square);
        System.out.printf("Cube: %14.2f\n", cube);
        System.out.printf("Fourth power: %6.2f\n", fourthPower);
    }
}
