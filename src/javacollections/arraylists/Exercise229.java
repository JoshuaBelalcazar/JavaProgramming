package javacollections.arraylists;

// Exercise 229:
// Write a Java program to update an array element by the given element.

import java.util.ArrayList;
import java.util.List;

public class Exercise229 {
    public static void main(String[] args) {
        // Create a list of color strings
        List<String> colorList = new ArrayList<>();

        // Add initial colors to the list
        colorList.add("Red");
        colorList.add("Green");
        colorList.add("Orange");
        colorList.add("White");
        colorList.add("Black");

        // Print the original list
        System.out.println("Original list:");
        System.out.println(colorList);

        // Update the third element (index 2) with "Yellow"
        colorList.set(2, "Yellow");

        // Print the updated list
        System.out.println("Updated list after changing the third element to 'Yellow':");
        System.out.println(colorList);
    }
}

