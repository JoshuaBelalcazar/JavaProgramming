package javacollections.arraylists;

/**
 * Exercise 231:
 * Write a Java program to search for an element in an array list.
 *
 * Sample Output:
 * Found the element
 */

import java.util.*;

public class Exercise231 {
    public static void main(String[] args) {
        // Create a list and add some colors to the list
        List<String> colorsList = new ArrayList<String>();

        // Add color elements to the list
        colorsList.add("Red");     // Element to search for
        colorsList.add("Green");
        colorsList.add("Orange");
        colorsList.add("White");
        colorsList.add("Black");

        // Define the element to search for
        String searchElement = "Red";

        // Search for the element in the list
        if (colorsList.contains(searchElement)) {
            System.out.println("Found the element");
        } else {
            System.out.println("There is no such element");
        }
    }
}
