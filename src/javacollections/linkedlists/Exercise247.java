package javacollections.linkedlists;

/*
 * Exercise 247:
 * Write a Java program to append the specified element to the end of a linked list.
 *
 * Sample Output:
 * The linked list: [Red, Green, Black, White, Pink, Yellow]
 */

import java.util.LinkedList;

public class Exercise247 {
    public static void main(String[] args) {
        // Create an empty linked list
        LinkedList<String> colorList = new LinkedList<>();

        // Append elements to the end of the linked list
        colorList.add("Red");
        colorList.add("Green");
        colorList.add("Black");
        colorList.add("White");
        colorList.add("Pink");
        colorList.add("Yellow");

        // Print the linked list
        System.out.println("The linked list: " + colorList);
    }
}

