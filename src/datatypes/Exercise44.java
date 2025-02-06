package datatypes;

/*
Exercise 44:
Write a Java program to convert minutes into years and days.

Test Data:
Input the number of minutes: 3456789

Expected Output:
3456789 minutes is approximately 6 years and 210 days.
*/

import java.util.Scanner;

public class Exercise44 {
    public static void main(String[] args) {

        // Calculate the number of minutes in one year (non-leap year)
        double minutesPerYear = 60 * 24 * 365;

        // Create a Scanner object to read user input
        Scanner input = new Scanner(System.in);
        System.out.print("Input the number of minutes: ");
        double minutes = input.nextDouble();

        // Compute the number of years and the remaining days
        long years = (long) (minutes / minutesPerYear);
        int days = (int) (minutes / 60 / 24) % 365;

        // Display the conversion result
        System.out.println((int) minutes + " minutes is approximately "
                + years + " years and " + days + " days");
    }
}
