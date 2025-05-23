package javacollections.linkedlists;

/**
 * Exercise 255:
 * Write a Java program to remove a specified element from a linked list.
 *
 * Sample Output:
 * The Original linked list: [Red, Green, Black, Pink, orange]
 * The New linked list: [Red, Green, Pink, orange]
 */

import java.util.LinkedList;

public class Exercise255 {
    public static void main(String[] args) {
        // Create an empty linked list
        LinkedList<String> colors = new LinkedList<>();

        // Add some elements to the linked list
        colors.add("Red");
        colors.add("Green");
        colors.add("Black");
        colors.add("Pink");
        colors.add("orange");

        // Print the original list
        System.out.println("The Original linked list: " + colors);

        // Remove the element at index 2 ("Black")
        colors.remove(2);

        // Print the modified list
        System.out.println("The New linked list: " + colors);
    }
}

