package javacollections.arraylists;

/**
 * Exercise 234:
 * Write a Java program to shuffle elements in an array list.
 *
 * Sample Output:
 * List before shuffling:
 * [Red, Green, Orange, White, Black]
 * List after shuffling:
 * [White, Orange, Black, Red, Green]
 */

import java.util.*;

public class Exercise234 {
    public static void main(String[] args) {
        // Create a list and add some colors to the list
        List<String> colorsList = new ArrayList<String>();

        // Add color elements to the list
        colorsList.add("Red");
        colorsList.add("Green");
        colorsList.add("Orange");
        colorsList.add("White");
        colorsList.add("Black");

        // Display the list before shuffling
        System.out.println("List before shuffling:\n" + colorsList);

        // Shuffle the elements randomly using Collections utility
        Collections.shuffle(colorsList);

        // Display the list after shuffling
        System.out.println("List after shuffling:\n" + colorsList);
    }
}