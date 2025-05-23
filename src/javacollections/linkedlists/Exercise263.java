package javacollections.linkedlists;

/**
 * Exercise 263:
 * Write a Java program to retrieve, but not remove, the last element of a linked list.
 *
 * Sample Output:
 * Original linked list: [Red, Green, Black, White, Pink]
 * Last element in the list: Pink
 * Original linked list: [Red, Green, Black, White, Pink]
 */

import java.util.LinkedList;

public class Exercise263 {
    public static void main(String[] args) {
        // create and populate the linked list
        LinkedList<String> list = new LinkedList<>();
        list.add("Red");
        list.add("Green");
        list.add("Black");
        list.add("White");
        list.add("Pink");
        System.out.println("Original linked list: " + list);

        // retrieve, but do not remove, the last element
        String last = list.peekLast();
        System.out.println("Last element in the list: " + last);

        // demonstrate that the list remains unchanged
        System.out.println("Original linked list: " + list);
    }
}
