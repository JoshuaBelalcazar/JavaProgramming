package javacollections.linkedlists;

/*
 * Exercise 251:
 * Write a Java program to insert elements into the linked list at the first and last positions.
 *
 * Sample Output:
 * Original linked list: [Red, Green, Black]
 * Final linked list: [White, Red, Green, Black, Pink]
 */

import java.util.LinkedList;

public class Exercise251 {
    public static void main(String[] args) {
        // Create a linked list and add initial elements
        LinkedList<String> colorList = new LinkedList<>();
        colorList.add("Red");
        colorList.add("Green");
        colorList.add("Black");

        // Print the original linked list
        System.out.println("Original linked list: " + colorList);

        // Insert an element at the beginning
        colorList.addFirst("White");

        // Insert an element at the end
        colorList.addLast("Pink");

        // Print the modified linked list
        System.out.println("Final linked list: " + colorList);
    }
}
