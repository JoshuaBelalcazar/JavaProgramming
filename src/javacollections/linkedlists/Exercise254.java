package javacollections.linkedlists;

/**
 * Exercise 254:
 * Write a Java program to display elements and their positions in a linked list.
 *
 * Sample Output:
 * Original linked list:[Red, Green, Black, Pink, orange]
 * Element at index 0: Red
 * Element at index 1: Green
 * Element at index 2: Black
 * Element at index 3: Pink
 * Element at index 4: orange
 */

import java.util.LinkedList;

public class Exercise254 {
    public static void main(String[] args) {
        // Create an empty linked list to store color names
        LinkedList<String> colorsList = new LinkedList<String>();

        // Use add() method to add color values to the linked list
        colorsList.add("Red");
        colorsList.add("Green");
        colorsList.add("Black");
        colorsList.add("Pink");
        colorsList.add("orange");

        // Display the original linked list
        System.out.println("Original linked list:" + colorsList);

        // Loop through each element and display its position and value
        for (int position = 0; position < colorsList.size(); position++) {
            // Print element at current index position
            System.out.println("Element at index " + position + ": " + colorsList.get(position));
        }
    }
}
