package javacollections.arraylists;

/*
 * Exercise 240:
 * Write a Java program to clone an array list to another array list.
 *
 * Sample Output:
 * Original array list: [Red, Green, Black, White, Pink]
 * Cloned array list: [Red, Green, Black, White, Pink]
 */

import java.util.ArrayList;

public class Exercise240 {
    public static void main(String[] args) {
        // Create and populate the original array list
        ArrayList<String> originalList = new ArrayList<>();
        originalList.add("Red");
        originalList.add("Green");
        originalList.add("Black");
        originalList.add("White");
        originalList.add("Pink");

        // Display the original list
        System.out.println("Original array list: " + originalList);

        // Clone the list using type-safe casting
        @SuppressWarnings("unchecked")
        ArrayList<String> clonedList = (ArrayList<String>) originalList.clone();

        // Display the cloned list
        System.out.println("Cloned array list: " + clonedList);
    }
}

