package control_flow;

/*
Exercise 68:
Write a Java program that requires the user to enter a single character from the alphabet.
Print "Vowel" or "Consonant", depending on user input.
If the user input is not a letter (between a and z or A and Z), or is a string of length > 1, print an error message.

Test Data:
Input an alphabet: p

Expected Output:
Input letter is Consonant
*/

import java.util.Scanner;

public class Exercise68 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for a single character
        System.out.print("Input an alphabet: ");
        String input = scanner.next();

        // Validate that the input is a single character
        if (input.length() != 1) {
            System.out.println("Error. Not a single character.");
            return;
        }

        char ch = input.charAt(0);

        // Validate that the character is a letter
        if (!Character.isLetter(ch)) {
            System.out.println("Error. Not a letter. Enter an uppercase or lowercase letter.");
            return;
        }

        // Convert to lowercase for uniformity in checking vowels
        ch = Character.toLowerCase(ch);

        // Check if the letter is a vowel
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
            System.out.println("Input letter is Vowel");
        } else {
            System.out.println("Input letter is Consonant");
        }
    }
}
