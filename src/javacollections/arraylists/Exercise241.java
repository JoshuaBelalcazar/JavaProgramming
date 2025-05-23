package javacollections.arraylists;

/*
 * Exercise 241:
 * Write a Java program to empty an array list.
 *
 * Sample Output:
 * Original array list: [Red, Green, Black, White, Pink]
 * Array list after remove all elements: []
 */

import java.util.ArrayList;

public class Exercise241 {
    public static void main(String[] args) {
        // Create and populate the array list
        ArrayList<String> colorList = new ArrayList<>();
        colorList.add("Red");
        colorList.add("Green");
        colorList.add("Black");
        colorList.add("White");
        colorList.add("Pink");

        // Display the original list
        System.out.println("Original array list: " + colorList);

        // Clear the list
        colorList.clear();

        // Display the list after clearing
        System.out.println("Array list after remove all elements: " + colorList);
    }
}
