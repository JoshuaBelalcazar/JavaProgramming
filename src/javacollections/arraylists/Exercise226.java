package javacollections.arraylists;

// Exercise 226:
// Write a Java program to create an array list, add some colors (strings) and print out the collection.

import java.util.ArrayList;
import java.util.List;

public class Exercise226 {
    public static void main(String[] args) {
        // Create an ArrayList to store color names
        List<String> colorList = new ArrayList<>();

        // Add color strings to the list
        colorList.add("Red");
        colorList.add("Green");
        colorList.add("Orange");
        colorList.add("White");
        colorList.add("Black");

        // Print out the contents of the list
        System.out.println("Color List: " + colorList);
    }
}
