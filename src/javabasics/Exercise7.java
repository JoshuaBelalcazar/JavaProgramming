package javabasics;

import java.util.Scanner;

public class Exercise7 {
    public static void main(String[] args) {
        /*
        Exercise 7:
        Write a Java program that takes three numbers as input to calculate and print the average of the numbers.
         */

        // Prepare a Scanner to read user input
        Scanner input = new Scanner(System.in);

        // Prompt for how many numbers will be averaged
        System.out.print("Enter how many numbers you want the average of: ");
        int totalCount = input.nextInt();

        // Variables to keep track of sum and loop counter
        double sum = 0;
        int count = 1;

        // Loop to collect and sum the numbers
        while (count <= totalCount) {
            System.out.print("Input number (" + count + "): ");
            sum += input.nextDouble();
            count++;
        }

        // Compute and display the average
        double average = sum / totalCount;
        System.out.println("Average: " + average);
    }
}