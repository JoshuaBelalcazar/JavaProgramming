package javabasics_II;

import java.util.Scanner;

public class Exercise27 {
        /*
        Exercise 27:
        Write a Java program to divide the two given integers using the subtraction operator.

        Expected Output:
        Input the dividend: 625
        Input the divider: 25
        Result: 25.0
         */

        // Method to divide two integers using repeated subtraction
        public static float subtractDivision(int dividendVal, int divisorVal) {
            if (divisorVal == 0) {
                // Division by zero is not defined, return 0 or handle accordingly
                return 0;
            }

            // Prepare to accumulate quotient
            float quotient = 0;

            // Subtract until the dividend is less than divisor
            while (dividendVal > divisorVal) {
                dividendVal -= divisorVal;
                quotient++;
            }

            // Calculate the fractional part
            float remainderFraction = (float) dividendVal / divisorVal;
            quotient += remainderFraction;

            return quotient;
        }

        public static void main(String[] args) {
            Scanner userInput = new Scanner(System.in);

            // Prompt for dividend
            System.out.print("Input the dividend: ");
            int theDividend = userInput.nextInt();

            // Prompt for divisor
            System.out.print("Input the divider: ");
            int theDivisor = userInput.nextInt();

            // Output the result of the division using subtraction
            System.out.println("\nResult: " + subtractDivision(theDividend, theDivisor));
        }
    }