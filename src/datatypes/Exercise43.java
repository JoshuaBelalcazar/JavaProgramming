package datatypes;

/*
Exercise 43:
Write a Java program that reads an integer between 0 and 1000 and adds all the digits in the integer.

Test Data:
Input an integer between 0 and 1000: 565

Expected Output:
The sum of all digits in 565 is 16
*/

import java.util.Scanner;

public class Exercise43 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Input an integer between 0 and 1000: ");
        int number = scanner.nextInt();

        // Extract digits from the number
        int ones = number % 10;
        int remaining = number / 10;
        int tens = remaining % 10;
        remaining /= 10;
        int hundreds = remaining % 10;
        remaining /= 10;
        int thousands = remaining % 10; // This will capture the thousand digit, if any (e.g., 1000)

        // Compute the sum of all digits
        int sum = ones + tens + hundreds + thousands;

        System.out.println("The sum of all digits in " + number + " is " + sum);
    }
}
