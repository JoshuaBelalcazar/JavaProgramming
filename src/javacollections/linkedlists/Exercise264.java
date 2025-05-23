package javacollections.linkedlists;

/**
 * Exercise 264:
 * Write a Java program to check if a particular element exists in a linked list.
 *
 * Sample Output:
 * Original linked list: [Red, Green, Black, White, Pink]
 * Color Green is present in the linked list.
 * Color Orange is not present in the linked list.
 */

import java.util.LinkedList;

public class Exercise264 {
    public static void main(String[] args) {
        // create and populate the linked list
        LinkedList<String> list = new LinkedList<>();
        list.add("Red");
        list.add("Green");
        list.add("Black");
        list.add("White");
        list.add("Pink");
        System.out.println("Original linked list: " + list);

        // check for "Green"
        if (list.contains("Green")) {
            System.out.println("Color Green is present in the linked list.");
        } else {
            System.out.println("Color Green is not present in the linked list.");
        }

        // check for "Orange"
        if (list.contains("Orange")) {
            System.out.println("Color Orange is present in the linked list.");
        } else {
            System.out.println("Color Orange is not present in the linked list.");
        }
    }
}
