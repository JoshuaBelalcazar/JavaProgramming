package javacollections.linkedlists;


/**
 * Exercise 261:
 * Write a Java program to remove and return the first element of a linked list.
 *
 * Sample Output:
 * Original linked list: [Red, Green, Black, White, Pink]
 * Removed element: Red
 * Linked list after pop operation: [Green, Black, White, Pink]
 */

import java.util.LinkedList;

public class Exercise261 {
    public static void main(String[] args) {
        // Create and populate the linked list
        LinkedList<String> list = new LinkedList<>();
        list.add("Red");
        list.add("Green");
        list.add("Black");
        list.add("White");
        list.add("Pink");
        System.out.println("Original linked list: " + list);

        // Remove and return the first element
        String removed = list.pop();
        System.out.println("Removed element: " + removed);

        // Print the list after removal
        System.out.println("Linked list after pop operation: " + list);
    }
}
