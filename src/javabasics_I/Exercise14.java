package javabasics_I;

import java.io.Console;
import java.util.Arrays;

public class Exercise14 {
    public static void main(String[] args) {
        /*
        Exercise 14:
        Write a Java program to input and display your password.
        Expected Output

        Input your Password:
        Your password was: abc@123
         */


        // Attempt to retrieve the system console
        Console consoleIn = System.console();

        if (consoleIn != null) {

            char[] enteredPassword = null;

            try {
                // Prompt user to input their password
                enteredPassword = consoleIn.readPassword("Input your Password: ");

                // Display the entered password
                System.out.println("Your password was: " + new String(enteredPassword));

            } finally {
                // Clear the character array for security reasons
                if (enteredPassword != null) {
                    Arrays.fill(enteredPassword, ' ');
                }
            }
        } else {
            // If console is unavailable
            throw new RuntimeException("No console found. Unable to retrieve password.");
        }
    }
}