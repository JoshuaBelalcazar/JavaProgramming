package javacollections.arraylists;

/**
 * Exercise 230:
 * Write a Java program to remove the third element from an array list.
 *
 * Sample Output:
 * [Red, Green, Orange, White, Black]
 * After removing third element from the list:
 * [Red, Green, White, Black]
 */

import java.util.*;

public class Exercise230 {
    public static void main(String[] args) {
        // Create a list and add some colors to the list
        List<String> colorsList = new ArrayList<String>();

        // Add color elements to the list
        colorsList.add("Red");
        colorsList.add("Green");
        colorsList.add("Orange");  // This is the third element (index 2) that will be removed
        colorsList.add("White");
        colorsList.add("Black");

        // Print the original list
        System.out.println(colorsList);

        // Remove the third element from the list (at index 2)
        colorsList.remove(2);

        // Print the modified list after removal
        System.out.println("After removing third element from the list:\n" + colorsList);
    }
}
