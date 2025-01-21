package javabasics_II;

import java.util.Scanner;

public class Exercise29 {
    /*
    Exercise 29:
    Write a Java program to reverse a sentence (assume a single space between two words) without reverse every word.

    Input a string: The quick brown fox jumps over the lazy dog
    Result: dog lazy the over jumps fox brown quick The
     */

    // Method to reverse the order of words in a sentence
    public static String reverseSentence(String sentence) {
        if (sentence == null) {
            throw new IllegalArgumentException("Input cannot be null.");
        }

        // Split the sentence on spaces
        String[] splitWords = sentence.split(" ");

        // Use a StringBuilder to construct the reversed sentence
        StringBuilder reversedResult = new StringBuilder();

        // Append the words in reverse order
        for (int i = splitWords.length - 1; i >= 0; i--) {
            reversedResult.append(splitWords[i]);

            // Add a space between words, but not after the last one
            if (i != 0) {
                reversedResult.append(" ");
            }
        }

        return reversedResult.toString();
    }

    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);

        // Prompt the user for a sentence
        System.out.print("Input a string: ");
        String sentence = userInput.nextLine();

        // Print the reversed sequence of words
        System.out.println("\nResult: " + reverseSentence(sentence));
    }
}


