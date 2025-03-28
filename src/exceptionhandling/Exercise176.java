package exceptionhandling;

/*
Exercise 176:
Write a Java program that throws an exception and catch it using a try-catch block.
*/

// Exercise176.java

public class Exercise176 {
    public static void main(String[] args) {
        try {
            // Attempt to divide two numbers and store the result
            int result = divideNumbers(5, 0);
            System.out.println("Result: " + result); // Print the result if no exception occurs
        } catch (ArithmeticException e) {
            // Catch block to handle ArithmeticException
            System.out.println("Error: " + e.getMessage()); // Print the error message
        }
    }

    // Method to perform division
    public static int divideNumbers(int dividend, int divisor) {
        // Check if the divisor is zero and throw an exception if true
        if (divisor == 0) {
            throw new ArithmeticException("Cannot divide the given number by zero!");
        }
        return dividend / divisor; // Return the division result
    }
}

