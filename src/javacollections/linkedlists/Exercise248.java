package javacollections.linkedlists;

/**
 * Exercise 248:
 * Write a Java program to iterate through all elements in a linked list.
 *
 * Sample Output:
 * Red
 * Green
 * Black
 * White
 * Pink
 */

import java.util.LinkedList;

public class Exercise248 {
    public static void main(String[] args) {
        // Create an empty linked list to store color names
        LinkedList<String> colorsList = new LinkedList<String>();

        // Use add() method to add color values to the linked list
        colorsList.add("Red");
        colorsList.add("Green");
        colorsList.add("Black");
        colorsList.add("White");
        colorsList.add("Pink");

        // Iterate through and print each element using enhanced for-loop
        for (String currentColor : colorsList) {
            System.out.println(currentColor);
        }
    }
}
