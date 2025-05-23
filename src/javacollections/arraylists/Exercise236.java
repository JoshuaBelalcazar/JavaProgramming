package javacollections.arraylists;

/*
 * Exercise 236:
 * Write a Java program to extract a portion of an array list.
 *
 * Sample Output:
 * Original list: [Red, Green, Orange, White, Black]
 * List of first three elements: [Red, Green, Orange]
 */

import java.util.ArrayList;
import java.util.List;

public class Exercise236 {
    public static void main(String[] args) {
        // Create a list and add some color strings
        List<String> colorList = new ArrayList<>();
        colorList.add("Red");
        colorList.add("Green");
        colorList.add("Orange");
        colorList.add("White");
        colorList.add("Black");

        // Print the original list
        System.out.println("Original list: " + colorList);

        // Extract a sublist from index 0 (inclusive) to 3 (exclusive)
        List<String> subList = colorList.subList(0, 3);

        // Print the extracted portion
        System.out.println("List of first three elements: " + subList);
    }
}
