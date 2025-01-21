package javabasics_II;

public class Exercise34 {
    /*
    Exercise 34:
    Write a Java program to find the length of the last word in a given string.
    The string contains upper/lower-case alphabets and empty space characters like ' '.

    Sample Output:

    Original String: The length of last word
    Length of the last word of the above string: 4
    */
    public static void main(String[] args) {



        // Define a sample string
        String sampleText = "The length of last word";

        // Print the original string
        System.out.println("Original String: " + sampleText);

        // Compute and display the length of the last word
        System.out.println("Length of the last word of the above string: " + findLastWordLength(sampleText));
    }

    // Method to determine the length of the last word in a string
    public static int findLastWordLength(String input) {
        // Split the string into words based on spaces
        String[] words = input.split(" ");

        // If there is at least one word, get the length of the last one
        if (words.length > 0) {
            return words[words.length - 1].length();
        }

        // If no words are found (empty string scenario), return 0
        return 0;
    }
}