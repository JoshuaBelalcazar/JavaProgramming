package datatypes;

/*
Exercise 49:
Write a Java program that accepts two integers from the user and prints the sum, the difference, the product, the average, the distance (the difference between the integers), the maximum (the largest of the two integers), and the minimum (the smallest of the two integers).

Test Data:
Input 1st integer: 25
Input 2nd integer: 5

Expected Output:
Sum of two integers: 30
Difference of two integers: 20
Product of two integers: 125
Average of two integers: 15.00
Distance of two integers: 20
Max integer: 25
Min integer: 5
*/

import java.util.Scanner;

public class Exercise49 {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);

        // Prompt for the two integers
        System.out.print("Input 1st integer: ");
        int firstNumber = inputScanner.nextInt();

        System.out.print("Input 2nd integer: ");
        int secondNumber = inputScanner.nextInt();

        // Calculate the required values
        int sum = firstNumber + secondNumber;
        int difference = firstNumber - secondNumber;
        int product = firstNumber * secondNumber;
        double average = (double)(firstNumber + secondNumber) / 2;
        int distance = Math.abs(firstNumber - secondNumber);
        int max = Math.max(firstNumber, secondNumber);
        int min = Math.min(firstNumber, secondNumber);

        // Display the results with appropriate formatting
        System.out.printf("Sum of two integers: %d%n", sum);
        System.out.printf("Difference of two integers: %d%n", difference);
        System.out.printf("Product of two integers: %d%n", product);
        System.out.printf("Average of two integers: %.2f%n", average);
        System.out.printf("Distance of two integers: %d%n", distance);
        System.out.printf("Max integer: %d%n", max);
        System.out.printf("Min integer: %d%n", min);
    }
}

