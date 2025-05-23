package javacollections.hashset;

/**
 * Exercise 272:
 * Write a Java program to convert a hash set to an array.
 *
 * Sample Output:
 * Original Hash Set: [Red, White, Pink, Yellow, Black, Green]
 * Array elements:
 * Red
 * White
 * Pink
 * Yellow
 * Black
 * Green
 */

import java.util.HashSet;

public class Exercise272 {
    public static void main(String[] args) {
        // Create and populate the hash set
        HashSet<String> colorSet = new HashSet<>();
        colorSet.add("Red");
        colorSet.add("Green");
        colorSet.add("Black");
        colorSet.add("White");
        colorSet.add("Pink");
        colorSet.add("Yellow");

        // Display the original hash set
        System.out.println("Original Hash Set: " + colorSet);

        // Convert the hash set to an array
        String[] colorArray = colorSet.toArray(new String[0]);

        // Display the array elements
        System.out.println("Array elements:");
        for (String color : colorArray) {
            System.out.println(color);
        }
    }
}
