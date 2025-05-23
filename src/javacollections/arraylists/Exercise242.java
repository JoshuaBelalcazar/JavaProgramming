package javacollections.arraylists;

/*
 * Exercise 242:
 * Write a Java program to test whether an array list is empty or not.
 *
 * Sample Output:
 * Original array list: [Red, Green, Black, White, Pink]
 * Checking if the array list is empty: false
 * Array list after removing all elements: []
 * Checking if the array list is empty: true
 */

import java.util.ArrayList;

public class Exercise242 {
    public static void main(String[] args) {
        // Create and populate the array list
        ArrayList<String> colorList = new ArrayList<>();
        colorList.add("Red");
        colorList.add("Green");
        colorList.add("Black");
        colorList.add("White");
        colorList.add("Pink");

        // Display the original list
        System.out.println("Original array list: " + colorList);

        // Check if the list is empty
        System.out.println("Checking if the array list is empty: " + colorList.isEmpty());

        // Remove all elements
        colorList.clear();

        // Display the list and check again
        System.out.println("Array list after removing all elements: " + colorList);
        System.out.println("Checking if the array list is empty: " + colorList.isEmpty());
    }
}
