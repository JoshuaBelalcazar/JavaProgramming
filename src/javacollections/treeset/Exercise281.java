package javacollections.treeset;

/**
 * Exercise 281:
 * Write a Java program to clone a tree set list to another tree set.
 *
 * Sample Output:
 * Original tree set: [Black, Green, Pink, Red, orange]
 * Cloned tree set:   [Black, Green, Pink, Red, orange]
 */

import java.util.TreeSet;

public class Exercise281 {
    public static void main(String[] args) {
        // Create and populate the original TreeSet
        TreeSet<String> originalSet = new TreeSet<>();
        originalSet.add("Red");
        originalSet.add("Green");
        originalSet.add("Black");
        originalSet.add("Pink");
        originalSet.add("orange");

        // Display the original TreeSet
        System.out.println("Original tree set: " + originalSet);

        // Clone by constructing a new TreeSet from the original
        TreeSet<String> clonedSet = new TreeSet<>(originalSet);

        // Display the cloned TreeSet
        System.out.println("Cloned tree set:   " + clonedSet);
    }
}

