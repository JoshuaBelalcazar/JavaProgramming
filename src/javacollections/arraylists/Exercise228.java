package javacollections.arraylists;

// Exercise 228:
// Write a Java program to insert an element into the array list at the first position.

import java.util.ArrayList;
import java.util.List;

public class Exercise228 {
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

        // Insert a color at the first position
        colorList.add(0, "Pink");

        // Insert a color at a specific position (before the last element)
        colorList.add(5, "Yellow");

        // Print the updated list
        System.out.println("Updated list after inserting elements:");
        System.out.println(colorList);
    }
}

