package javacollections.linkedlists;

/**
 * Exercise 262:
 * Write a Java program to retrieve, but not remove, the first element of a linked list.
 *
 * Sample Output:
 * Original linked list: [Red, Green, Black, White, Pink]
 * First element in the list: Red
 * Original linked list: [Red, Green, Black, White, Pink]
 */

import java.util.LinkedList;

public class Exercise262 {
    public static void main(String[] args) {
        // create and populate the linked list
        LinkedList<String> list = new LinkedList<>();
        list.add("Red");
        list.add("Green");
        list.add("Black");
        list.add("White");
        list.add("Pink");
        System.out.println("Original linked list: " + list);

        // retrieve, but do not remove, the first element
        String first = list.peekFirst();
        System.out.println("First element in the list: " + first);

        // demonstrate that the list remains unchanged
        System.out.println("Original linked list: " + list);
    }
}

