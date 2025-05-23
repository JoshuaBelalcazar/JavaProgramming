package javacollections.linkedlists;

/**
 * Exercise 250:
 * Write a Java program to insert the specified element at the specified position in the linked list.
 *
 * Sample Output:
 * Original linked list:
 * Let add the Yellow color after the Red Color: [Red, Green, Black, White, Pink]
 * The linked list:[Red, Yellow, Green, Black, White, Pink]
 */

import java.util.LinkedList;

public class Exercise250 {
    public static void main(String[] args) {
        // Create an empty linked list to store color names
        LinkedList<String> colorsList = new LinkedList<String>();

        // Use add() method to add color values to the linked list
        colorsList.add("Red");
        colorsList.add("Green");
        colorsList.add("Black");
        colorsList.add("White");
        colorsList.add("Pink");

        // Display the original linked list
        System.out.println("Original linked list: ");
        System.out.println("Let add the Yellow color after the Red Color: " + colorsList);

        // Insert "Yellow" at index 1 (after "Red" which is at index 0)
        colorsList.add(1, "Yellow");

        // Display the updated linked list after insertion
        System.out.println("The linked list:" + colorsList);
    }
}
