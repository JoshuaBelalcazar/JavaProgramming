package control_flow;

/*
Exercise 69:
Write a Java program that takes a year from the user and prints whether it is a leap year or not.

Test Data:
Input the year: 2016

Expected Output:
2016 is a leap year
*/

import java.util.Scanner;

public class Exercise69 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Input the year: ");
        int year = in.nextInt();

        // A year is a leap year if it is divisible by 4 but not by 100,
        // unless it is also divisible by 400.
        boolean divisibleBy4 = (year % 4) == 0;
        boolean notDivisibleBy100 = (year % 100) != 0;
        boolean divisibleBy400 = (year % 400) == 0;

        if (divisibleBy4 && (notDivisibleBy100 || divisibleBy400)) {
            System.out.println(year + " is a leap year");
        } else {
            System.out.println(year + " is not a leap year");
        }
    }
}
