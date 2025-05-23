package javacollections.arraylists;

/**
 * Exercise 244:
 * Write a Java program to increase an array list size.
 *
 * Sample Output:
 * Original array list: [Red, Green, Black]
 * New array list: [Red, Green, Black, White, Pink, Yellow]
 */

import java.util.ArrayList;

public class Exercise244 {
    public static void main(String[] args) {
        // Create an ArrayList with initial capacity of 3
        ArrayList<String> colorsList = new ArrayList<String>(3);

        // Add initial colors to the list
        colorsList.add("Red");
        colorsList.add("Green");
        colorsList.add("Black");

        // Display the original array list
        System.out.println("Original array list: " + colorsList);

        // Increase capacity to 6 to accommodate more elements
        colorsList.ensureCapacity(6);

        // Add additional colors to expand the list size
        colorsList.add("White");
        colorsList.add("Pink");
        colorsList.add("Yellow");

        // Display the expanded array list
        System.out.println("New array list: " + colorsList);
    }
}
