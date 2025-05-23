package javacollections.arraylists;

/*
 * Exercise 243:
 * Write a Java program for trimming the capacity of an array list.
 *
 * Sample Output:
 * Original array list: [Red, Green, Black, White, Pink]
 * Trimming the capacity of the array list...
 * [Red, Green, Black, White, Pink]
 */

import java.util.ArrayList;

public class Exercise243 {
    public static void main(String[] args) {
        // Create and populate the array list
        ArrayList<String> colorList = new ArrayList<>();
        colorList.add("Red");
        colorList.add("Green");
        colorList.add("Black");
        colorList.add("White");
        colorList.add("Pink");

        // Display original list
        System.out.println("Original array list: " + colorList);

        // Trim capacity to the current size
        System.out.println("Trimming the capacity of the array list...");
        colorList.trimToSize();

        // Print the list after trimming
        System.out.println(colorList);
    }
}

