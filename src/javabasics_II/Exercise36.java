package javabasics_II;

import java.util.HashMap;
import java.util.Map;

public class Exercise36 {
    /*
    Exercise 36:
    Write a Java program to check if two strings are isomorphic or not.

    Expected Output:

    Is abca and zbxz are Isomorphic? true

    */
    public static void main(String[] args) {


        String s1 = "abca";
        String s2 = "zbxz";

        System.out.println("Is " + s1 + " and " + s2 + " are Isomorphic? " + areIsomorphic(s1, s2));
    }

    // Method to determine if two strings are isomorphic
    public static boolean areIsomorphic(String str1, String str2) {

        // If either string is null or they are of different lengths, return false
        if (str1 == null || str2 == null || str1.length() != str2.length()) {
            return false;
        }

        // Map to store character mappings from str1 -> str2
        Map<Character, Character> charMap = new HashMap<>();

        // Check each character pair
        for (int i = 0; i < str1.length(); i++) {
            char firstChar = str1.charAt(i);
            char secondChar = str2.charAt(i);

            // If the mapping for the character in str1 exists
            if (charMap.containsKey(firstChar)) {
                // If the existing mapping doesn't match the current character in str2, not isomorphic
                if (charMap.get(firstChar) != secondChar) {
                    return false;
                }
            } else {
                // If a different character from str1 is already mapped to secondChar, not isomorphic
                if (charMap.containsValue(secondChar)) {
                    return false;
                }
                // Otherwise, create a new mapping
                charMap.put(firstChar, secondChar);
            }
        }
        // If we finish the loop without mismatches, they are isomorphic
        return true;
    }
}