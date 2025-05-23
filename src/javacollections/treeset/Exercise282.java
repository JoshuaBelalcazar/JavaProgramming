package javacollections.treeset;

/**
 * Exercise 282:
 * Write a Java program to get the number of elements in a tree set.
 *
 * Sample Output:
 * Original tree set: [Black, Green, Pink, Red, orange]
 * Size of the tree set: 5
 */

import java.util.TreeSet;

public class Exercise282 {
    public static void main(String[] args) {
        // Create and populate the TreeSet
        TreeSet<String> colors = new TreeSet<>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Black");
        colors.add("Pink");
        colors.add("orange");

        // Display the contents of the TreeSet
        System.out.println("Original tree set: " + colors);

        // Get and display the size of the TreeSet
        System.out.println("Size of the tree set: " + colors.size());
    }
}

