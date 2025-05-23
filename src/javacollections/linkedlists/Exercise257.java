package javacollections.linkedlists;

/**
 * Exercise 257:
 * Write a Java program to remove all elements from a linked list.
 *
 * Sample Output:
 * The Original linked list: [Red, Green, Black, Pink, orange]
 * The New linked list: []
 */

import java.util.*;

public class Exercise257 {
    public static void main(String[] args) {
        // Create an empty linked list to store color names
        LinkedList<String> colorsList = new LinkedList<String>();

        // Use add() method to add color values to the linked list
        colorsList.add("Red");
        colorsList.add("Green");
        colorsList.add("Black");
        colorsList.add("Pink");
        colorsList.add("orange");

        // Display the original linked list
        System.out.println("The Original linked list: " + colorsList);

        // Remove all elements from the linked list using clear() method
        colorsList.clear();

        // Display the linked list after clearing all elements
        System.out.println("The New linked list: " + colorsList);
    }
}
