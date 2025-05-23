package javacollections.treeset;

/**
 * Exercise 279:
 * Write a Java program to create a reverse order view of the elements contained in a given tree set.
 *
 * Sample Output:
 * Original tree set: [Black, Green, Pink, Red, orange]
 * Elements in Reverse Order:
 * orange
 * Red
 * Pink
 * Green
 * Black
 */

import java.util.TreeSet;
import java.util.NavigableSet;

public class Exercise279 {
    public static void main(String[] args) {
        // Create a TreeSet and add some colors
        TreeSet<String> treeSet = new TreeSet<>();
        treeSet.add("Red");
        treeSet.add("Green");
        treeSet.add("Black");
        treeSet.add("Pink");
        treeSet.add("orange");

        // Display the original tree set (natural ascending order)
        System.out.println("Original tree set: " + treeSet);

        // Obtain a reverse-order view of the tree set
        NavigableSet<String> descending = treeSet.descendingSet();

        // Display elements in reverse order
        System.out.println("Elements in Reverse Order:");
        for (String color : descending) {
            System.out.println(color);
        }
    }
}

