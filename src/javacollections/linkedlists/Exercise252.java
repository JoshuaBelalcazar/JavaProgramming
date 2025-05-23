package javacollections.linkedlists;

/**
 * Exercise 252:
 * Write a Java program to insert the specified element at the front of a linked list.
 *
 * Sample Output:
 * Original linked list:[Red, Green, Black]
 * Final linked list:[Pink, Red, Green, Black]
 */

import java.util.LinkedList;

public class Exercise252 {
    public static void main(String[] args) {
        // Create an empty linked list to store color names
        LinkedList<String> colorsList = new LinkedList<String>();

        // Use add() method to add color values to the linked list
        colorsList.add("Red");
        colorsList.add("Green");
        colorsList.add("Black");

        // Display the original linked list
        System.out.println("Original linked list:" + colorsList);

        // Add an element to the front of the LinkedList using offerFirst()
        colorsList.offerFirst("Pink");

        // Display the final linked list after adding element to front
        System.out.println("Final linked list:" + colorsList);
    }
}
