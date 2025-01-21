package javabasics_I;

import java.util.Scanner;

public class Exercise18 {
    public static void main(String[] args) {
        /*
        Exercise 18:
        Write a program to reverse a word:
        Sample output:
        Input a word: dsaf
        Reverse word: fasd
        */

// Set up a Scanner to read user input
        Scanner scannerTool = new Scanner(System.in);
        System.out.print("Input a word: ");

        // Capture and trim any leading or trailing spaces from the input
        String userInput = scannerTool.nextLine().trim();

        // Prepare a string to accumulate the reversed characters
        String reversedWord = "";

        // Convert the trimmed input into a character array
        char[] charArray = userInput.toCharArray();

        // Build the reversed word by iterating from the end to the start
        for (int i = charArray.length - 1; i >= 0; i--) {
            reversedWord += charArray[i];
        }

        // Print out the reversed result
        System.out.println("Reverse word: " + reversedWord.trim());
    }
}