package javabasics_II;

import java.util.Scanner;

public class Exercise22 {
    /*
    Exercise 22:
    Write a Java program that accepts four integers from the user and prints equal if all four are equal, and not equal otherwise.
    Sample Output:
    Input first number: 25
    Input second number: 37
    Input third number: 45
    Input fourth number: 23
    Numbers are not equal!
     */
    public static void main(String[] args) {


        Scanner inputDevice = new Scanner(System.in);

        // Prompt user for four integers
        System.out.print("Input first number: ");
        int valueA = inputDevice.nextInt();

        System.out.print("Input second number: ");
        int valueB = inputDevice.nextInt();

        System.out.print("Input third number: ");
        int valueC = inputDevice.nextInt();

        System.out.print("Input fourth number: ");
        int valueD = inputDevice.nextInt();

        // Determine if all four integers match
        if (valueA == valueB && valueB == valueC && valueC == valueD) {
            System.out.println("Numbers are equal.");
        } else {
            System.out.println("Numbers are not equal!");
        }
    }
}