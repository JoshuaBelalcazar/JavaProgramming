package javacollections.arraylists;

/*
 * Exercise 245:
 * Write a Java program to replace the second element of an ArrayList with the specified element.
 *
 * Sample Output:
 * Original array list: [Red, Green]
 * Replace second element with 'White'.
 * Red
 * White
 */

import java.util.ArrayList;

public class Exercise245 {
    public static void main(String[] args) {
        // Create and populate the ArrayList
        ArrayList<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Green");

        // Display original list
        System.out.println("Original array list: " + colors);

        // Replace second element with "White"
        String newColor = "White";
        colors.set(1, newColor);

        // Print updated list
        System.out.println("Replace second element with 'White'.");
        for (String color : colors) {
            System.out.println(color);
        }
    }
}

