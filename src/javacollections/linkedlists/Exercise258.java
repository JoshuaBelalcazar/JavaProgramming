package javacollections.linkedlists;

/**
 * Exercise 258:
 * Write a Java program that swaps two elements in a linked list.
 *
 * Sample Output:
 * The Original linked list: [Red, Green, Black, Pink, orange]
 * The New linked list after swap: [Black, Green, Red, Pink, orange]
 */

import java.util.Collections;
import java.util.LinkedList;

public class Exercise258 {
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

        // Swap the elements at index 0 ("Red") and index 2 ("Black")
        Collections.swap(colors, 0, 2);

        // Print the list after swapping
        System.out.println("The New linked list after swap: " + colors);
    }
}

