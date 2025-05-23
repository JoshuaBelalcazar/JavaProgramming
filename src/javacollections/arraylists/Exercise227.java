package javacollections.arraylists;

// Exercise 227:
// Write a Java program to iterate through all elements in an array list.

import java.util.ArrayList;
import java.util.List;

public class Exercise227 {
    public static void main(String[] args) {
        // Create a list of color strings
        List<String> colorList = new ArrayList<>();

        // Add colors to the list
        colorList.add("Red");
        colorList.add("Green");
        colorList.add("Orange");
        colorList.add("White");
        colorList.add("Black");

        // Iterate through the list and print each color
        System.out.println("Iterating through the color list:");
        for (String color : colorList) {
            System.out.println(color);
        }
    }
}
