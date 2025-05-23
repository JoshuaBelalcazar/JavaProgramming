package javacollections.linkedlists;

/*
 * Exercise 253:
 * Write a Java program to get the first and last occurrence of the specified elements in a linked list.
 *
 * Sample Output:
 * Original linked list: [Red, Green, Black, Pink, orange]
 * First Element is: Red
 * Last Element is: orange
 */

import java.util.LinkedList;

public class Exercise253 {
    public static void main(String[] args) {
        // Create and populate the linked list
        LinkedList<String> colorList = new LinkedList<>();
        colorList.add("Red");
        colorList.add("Green");
        colorList.add("Black");
        colorList.add("Pink");
        colorList.add("orange");

        // Print the original list
        System.out.println("Original linked list: " + colorList);

        // Retrieve and print the first and last elements
        String firstElement = colorList.getFirst();
        System.out.println("First Element is: " + firstElement);

        String lastElement = colorList.getLast();
        System.out.println("Last Element is: " + lastElement);
    }
}
