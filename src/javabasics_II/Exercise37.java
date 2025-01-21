package javabasics_II;

import java.util.Arrays;

public class Exercise37 {
    /*
Exercise 37:
Write a Java program to find the missing string from two given strings.

Expected Output:

Missing string: [Solution]
*/
    public static void main(String[] args) {


        // Two sample strings
        String fullText = "Java Programming Exercises, Practice, Solution";
        String partialText = "Java Programming Exercises, Practice,";

        // Display the missing words
        System.out.println("Missing string: " + Arrays.toString(findMissingWords(fullText, partialText)));
    }

    // Method that identifies the missing words from two given strings
    public static String[] findMissingWords(String first, String second) {

        // Split each string by whitespace
        String[] firstArr = first.split(" ");
        String[] secondArr = second.split(" ");

        // The difference in length tells us how many words are missing
        int missingCount = firstArr.length - secondArr.length;
        String[] missingSet = new String[missingCount];

        int index = 0;

        // Check for each word in the first array if it appears in the second array
        for (int i = 0; i < firstArr.length; i++) {
            boolean found = false;
            for (int j = 0; j < secondArr.length; j++) {
                if (firstArr[i].equals(secondArr[j])) {
                    found = true;
                    break;
                }
            }
            // If the word does not appear in secondArr, add it to missingSet
            if (!found) {
                missingSet[index++] = firstArr[i];
            }
        }
        return missingSet;
    }
}