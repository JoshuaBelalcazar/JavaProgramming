package javacollections.arraylists;

/**
 * Exercise 232:
 * Write a Java program to sort a given array list.
 *
 * Sample Output:
 * List before sort: [Red, Green, Orange, White, Black]
 * List after sort: [Black, Green, Orange, Red, White]
 */

import java.util.*;

public class Exercise232 {
    public static void main(String[] args) {
        // Create a list and add some colors to the list
        List<String> colorsList = new ArrayList<String>();

        // Add color elements to the list
        colorsList.add("Red");
        colorsList.add("Green");
        colorsList.add("Orange");
        colorsList.add("White");
        colorsList.add("Black");

        // Display the list before sorting
        System.out.println("List before sort: " + colorsList);

        // Sort the list in alphabetical order
        Collections.sort(colorsList);

        // Display the list after sorting
        System.out.println("List after sort: " + colorsList);
    }
}
