package javacollections.linkedlists;

/**
 * Exercise 256:
 * Write a Java program to remove the first and last elements from a linked list.
 *
 * Sample Output:
 * The Original linked list: [Red, Green, Black, Pink, orange]
 * Element removed: Red
 * Element removed: orange
 * The New linked list: [Green, Black, Pink]
 */

import java.util.*;

public class Exercise256 {
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

        // Remove the first element and store it for display
        String removedFirstElement = colorsList.removeFirst();
        System.out.println("Element removed: " + removedFirstElement);

        // Remove the last element and store it for display
        String removedLastElement = colorsList.removeLast();
        System.out.println("Element removed: " + removedLastElement);

        // Display the updated linked list after removals
        System.out.println("The New linked list: " + colorsList);
    }
}
