package exceptionhandling;

/*
Exercise 177:
Write a Java program to create a method that takes an integer as a parameter and throws an exception if the number is odd.
*/

// Exercise177.java

public class Exercise177 {

    public static void main(String[] args) {
        int n1 = 18;
        int n2 = 7;

        // Test the trynumber method with n1 and n2
        trynumber(n1);
        trynumber(n2);
    }

    // Method to check whether a number is even and handle exceptions
    public static void trynumber(int n) {
        try {
            checkEvenNumber(n);  // Call the method to check if the number is even
            System.out.println(n + " is even.");  // Print if the number is even
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());  // Print the error message if an exception is caught
        }
    }

    // Method to check if a number is even, throws an exception if it's odd
    public static void checkEvenNumber(int number) {
        if (number % 2 != 0) {
            // Throw an exception if the number is odd
            throw new IllegalArgumentException(number + " is odd.");
        }
    }
}
