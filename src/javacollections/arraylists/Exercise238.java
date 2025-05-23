package javacollections.arraylists;

/*
 * Exercise 238:
 * Write a Java program that swaps two elements in an array list.
 *
 * Sample Output:
 * Array list before Swap:
 * Red
 * Green
 * Black
 * White
 * Pink
 * Array list after swap:
 * Black
 * Green
 * Red
 * White
 * Pink
 */

import java.util.ArrayList;
import java.util.Collections;

public class Exercise238 {
    public static void main(String[] args) {
        // Create and populate the array list
        ArrayList<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Black");
        colors.add("White");
        colors.add("Pink");

        // Display the list before swapping
        System.out.println("Array list before Swap:");
        for (String color : colors) {
            System.out.println(color);
        }

        // Swap the 1st (index 0) and 3rd (index 2) elements
        Collections.swap(colors, 0, 2);

        // Display the list after swapping
        System.out.println("Array list after swap:");
        for (String color : colors) {
            System.out.println(color);
        }
    }
}

