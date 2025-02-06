package control_flow;

/*
Exercise 67:
Write a Java program to find the number of days in a month.

Test Data:
Input a month number: 2
Input a year: 2016

Expected Output:
February 2016 has 29 days
*/

import java.util.Scanner;

public class Exercise67 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int numberOfDaysInMonth = 0;
        String monthName = "Unknown";

        System.out.print("Input a month number: ");
        int month = input.nextInt();

        System.out.print("Input a year: ");
        int year = input.nextInt();

        // Determine month name and number of days based on the month number and year
        switch (month) {
            case 1:
                monthName = "January";
                numberOfDaysInMonth = 31;
                break;
            case 2:
                monthName = "February";
                if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))) {
                    numberOfDaysInMonth = 29;
                } else {
                    numberOfDaysInMonth = 28;
                }
                break;
            case 3:
                monthName = "March";
                numberOfDaysInMonth = 31;
                break;
            case 4:
                monthName = "April";
                numberOfDaysInMonth = 30;
                break;
            case 5:
                monthName = "May";
                numberOfDaysInMonth = 31;
                break;
            case 6:
                monthName = "June";
                numberOfDaysInMonth = 30;
                break;
            case 7:
                monthName = "July";
                numberOfDaysInMonth = 31;
                break;
            case 8:
                monthName = "August";
                numberOfDaysInMonth = 31;
                break;
            case 9:
                monthName = "September";
                numberOfDaysInMonth = 30;
                break;
            case 10:
                monthName = "October";
                numberOfDaysInMonth = 31;
                break;
            case 11:
                monthName = "November";
                numberOfDaysInMonth = 30;
                break;
            case 12:
                monthName = "December";
                numberOfDaysInMonth = 31;
                break;
            default:
                System.out.println("Invalid month number.");
                System.exit(0);
        }

        // Output the result
        System.out.println(monthName + " " + year + " has " + numberOfDaysInMonth + " days");
    }
}
