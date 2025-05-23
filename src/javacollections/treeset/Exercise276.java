package javacollections.treeset;

/**
 * Exercise 276:
 * Write a Java program to create a tree set, add some colors (strings)
 * and print out the tree set.
 *
 * Sample Output:
 * Tree set:
 * [Black, Green, Orange, Red, White]
 */

import java.util.TreeSet;
import java.util.Set;

public class Exercise276 {
    public static void main(String[] args) {
        // Create a TreeSet to store colors in sorted (natural) order
        Set<String> colors = new TreeSet<>();

        // Add some colors to the set
        colors.add("Red");
        colors.add("Green");
        colors.add("Orange");
        colors.add("White");
        colors.add("Black");

        // Print the TreeSet
        System.out.println("Tree set:");
        System.out.println(colors);
    }
}

