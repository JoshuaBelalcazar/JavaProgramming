package javabasics_II;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Exercise39 {
    /*
    Exercise 39:

    Write a Java program to check if a string follows a given pattern.

    Example pattern:
    Given pattern = "xyyx", str = "red black black red", return true.
    Given pattern = "xyyx", str = "red black black green", return false.
    Given pattern = "xxxx", str = "red black black red", return false.
    Given pattern = "xxxx", str = "red red red red", return true.

    Expected Output:

    Is the string and pattern matched? false
    */
    public static void main(String[] args) {


        // Example inputs
        String sampleString = "red black black red";
        String samplePattern = "xyxx";

        // Display whether the string matches the pattern
        System.out.println("Is the string and pattern matched? " + doesPatternMatch(samplePattern, sampleString));
    }

    // Checks if a given pattern matches the words in a string
    public static boolean doesPatternMatch(String pattern, String text) {

        // Convert the pattern into a character array
        char[] patternChars = pattern.toCharArray();

        // Split the input text into an array of words
        String[] words = text.split(" ");

        // If the pattern length and the number of words differ, it cannot match
        if (patternChars.length != words.length) {
            return false;
        }

        // Create a map to hold the pattern character -> word mapping
        Map<Character, String> mapping = new HashMap<>();
        // Create a set to track words already mapped to ensure no duplicates
        Set<String> usedWords = new HashSet<>();

        // Iterate over the pattern
        for (int i = 0; i < patternChars.length; i++) {
            char currentChar = patternChars[i];
            String currentWord = words[i];

            // If the map already has an entry for the current pattern character
            if (mapping.containsKey(currentChar)) {
                // If the mapped word doesn't match the current word, pattern fails
                if (!mapping.get(currentChar).equals(currentWord)) {
                    return false;
                }
            } else {
                // If the current word is already mapped to another character, pattern fails
                if (usedWords.contains(currentWord)) {
                    return false;
                }

                // Otherwise, establish the new mapping and mark the word as used
                mapping.put(currentChar, currentWord);
                usedWords.add(currentWord);
            }
        }

        // If we pass all checks, the string matches the pattern
        return true;
    }
}