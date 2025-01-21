package javabasics_I;

import java.util.Scanner;

public class Exercise5 {
    public static void main(String[] args) {
    /*
    Exercise 5:
    Write a Java program that takes a number as input and prints its multiplication table up to 10.
    Test Data:
    Input a number: 8
    Expected Output :
    8 x 1 = 8
    8 x 2 = 16
    8 x 3 = 24
    ...
    8 x 10 = 80
    */

        Scanner userInput = new Scanner(System.in);

        // Ask the user for a number
        System.out.print("Input a number: ");
        int numberToMultiply = userInput.nextInt();

        // Generate and display the multiplication table (1 through 10)
        for (int step = 1; step <= 10; step++) {
            System.out.println(numberToMultiply + " x " + step + " = " + (numberToMultiply * step));
        }
    }
}