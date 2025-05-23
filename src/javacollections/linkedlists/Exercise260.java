package javacollections.linkedlists;


/**
 * Exercise 260:
 * Write a Java program to copy a linked list to another linked list.
 *
 * Sample Output:
 * Original linked list: [Red, Green, Black, White, Pink]
 * Cloned linked list:  [Red, Green, Black, White, Pink]
 */

import java.util.LinkedList;

public class Exercise260 {
    public static void main(String[] args) {
        // Create and populate the original linked list
        LinkedList<String> originalList = new LinkedList<>();
        originalList.add("Red");
        originalList.add("Green");
        originalList.add("Black");
        originalList.add("White");
        originalList.add("Pink");
        System.out.println("Original linked list: " + originalList);

        // Copy the original list into a new linked list
        LinkedList<String> copiedList = new LinkedList<>(originalList);
        System.out.println("Cloned linked list:  " + copiedList);
    }
}

