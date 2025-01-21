package javabasics_II;


import java.util.Collections;
import java.util.Stack;

public class Exercise40 {
    /*
    Write a Java program to remove duplicate letters and arrange them in lexicographical order from a given string containing only lowercase letters.

    Note: In mathematics, the lexicographic or lexicographical order (also known as lexical order, dictionary order, alphabetical order or lexicographic(al) product) is a generalization of the way words are alphabetically ordered based on the alphabetical order of their component letters.

    Expected Output:

    Original string: zxywooxz
    After removing duplicate characters: xywoz
    */
    public static void main(String[] args) {

        // Example input
        String input = "zxywooxz";

        // Display the original string
        System.out.println("Original string: " + input);

        // Remove duplicates and sort in lexicographical order
        String result = removeDuplicatesAndSort(input);

        // Display the processed result
        System.out.println("After removing duplicate characters: " + result);
    }

    // Method to eliminate duplicate letters and sort them lexicographically
    public static String removeDuplicatesAndSort(String text) {

        // Booleans to track whether a letter is already in the resulting sequence
        boolean[] used = new boolean[26];
        // Count occurrences of each character
        int[] charCount = new int[26];

        // Use a stack to build the result
        Stack<Character> stackHelper = new Stack<>();

        // Count how many times each character appears
        for (char ch : text.toCharArray()) {
            charCount[ch - 'a']++;
        }

        // Iterate through each character in the string
        for (char ch : text.toCharArray()) {
            // Reduce the count for the current character
            charCount[ch - 'a']--;

            // If we've already added this character, skip
            if (used[ch - 'a']) {
                continue;
            }

            // While the stack isn't empty and the top character is larger than the current one
            // and that top character appears later in the string (count > 0), pop from stack.
            while (!stackHelper.isEmpty() && ch < stackHelper.peek() && charCount[stackHelper.peek() - 'a'] > 0) {
                used[stackHelper.pop() - 'a'] = false;
            }

            // Push the current character onto the stack and mark it as used
            stackHelper.push(ch);
            used[ch - 'a'] = true;
        }

        // Sort the characters in the stack
        Collections.sort(stackHelper);

        // Build a final string from the sorted stack content
        StringBuilder sb = new StringBuilder();
        for (char c : stackHelper) {
            sb.append(c);
        }

        // Return the result
        return sb.toString();
    }
}
