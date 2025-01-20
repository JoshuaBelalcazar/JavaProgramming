package javabasics;

import java.util.Scanner;

public class Exercise17 {
    public static void main(String[] args) {
        /*
        Exercise 17:
        Write a Java program to capitalize the first letter of each word in a sentence.
        Sample Output:

        Input a Sentence: the quick brown fox jumps over the lazy dog.
        The Quick Brown Fox Jumps Over The Lazy Dog.
         */

        // Prepare to read user input
        Scanner keyboardInput = new Scanner(System.in);
        System.out.print("Input a Sentence: ");

        // Read the entire line as a sentence
        String userSentence = keyboardInput.nextLine();

        // Variable to accumulate the transformed sentence
        String transformed = "";

        // Use another scanner to split the sentence into words
        Scanner wordScanner = new Scanner(userSentence);

        // Process each word, capitalizing its first letter
        while (wordScanner.hasNext()) {
            String word = wordScanner.next();
            transformed += Character.toUpperCase(word.charAt(0)) + word.substring(1) + " ";
        }

        // Trim and display the final result
        System.out.println(transformed.trim());
    }
}