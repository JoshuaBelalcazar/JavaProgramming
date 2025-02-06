package datatypes;

/*
Exercise 50:
Write a Java program to break an integer into a sequence of digits.

Test Data:
Input six non-negative digits: 123456

Expected Output:
1 2 3 4 5 6
*/

import java.util.Scanner;

public class Exercise50 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Input six non-negative digits: ");
        int number = scanner.nextInt();

        // Extract each digit from the six-digit number
        int digit1 = number / 100000 % 10;
        int digit2 = number / 10000 % 10;
        int digit3 = number / 1000 % 10;
        int digit4 = number / 100 % 10;
        int digit5 = number / 10 % 10;
        int digit6 = number % 10;

        // Print the digits separated by a space
        System.out.println(digit1 + " " + digit2 + " " + digit3 + " " + digit4 + " " + digit5 + " " + digit6);
    }
}
