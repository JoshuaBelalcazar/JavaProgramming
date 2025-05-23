package javacollections.arraylists;

/**
 * Exercise 246:
 * Write a Java program to print all the elements of an ArrayList using the elements' position.
 *
 * Sample Output:
 * Original array list: [Red, Green, Black, White, Pink]
 *
 * Print using index of an element:
 * Red
 * Green
 * Black
 * White
 * Pink
 */

import java.util.ArrayList;

public class Exercise246 {
    public static void main(String[] args) {
        // Create an ArrayList to store color names
        ArrayList<String> colorsList = new ArrayList<String>();

        // Add color elements to the list
        colorsList.add("Red");
        colorsList.add("Green");
        colorsList.add("Black");
        colorsList.add("White");
        colorsList.add("Pink");

        // Display the original array list
        System.out.println("\nOriginal array list: " + colorsList);
        System.out.println("\nPrint using index of an element: ");

        // Get the total number of elements in the list
        int numberOfElements = colorsList.size();

        // Loop through each element using its index position
        for (int index = 0; index < numberOfElements; index++) {
            // Print each element using get() method with index
            System.out.println(colorsList.get(index));
        }
    }
}
