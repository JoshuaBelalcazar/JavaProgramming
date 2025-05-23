package javacollections.treeset;

/**
 * Exercise 280:
 * Write a Java program to get the first and last elements in a tree set.
 *
 * Sample Output:
 * Tree set:
 * [Black, Green, Orange, Red, White]
 * First Element is: Black
 * Last Element is: White
 */

import java.util.TreeSet;

public class Exercise280 {
    public static void main(String[] args) {
        // Create a TreeSet and add some colors
        TreeSet<String> treeSet = new TreeSet<>();
        treeSet.add("Red");
        treeSet.add("Green");
        treeSet.add("Orange");
        treeSet.add("White");
        treeSet.add("Black");

        // Display the TreeSet
        System.out.println("Tree set:");
        System.out.println(treeSet);

        // Retrieve and display the first (lowest) element
        String firstElement = treeSet.first();
        System.out.println("First Element is: " + firstElement);

        // Retrieve and display the last (highest) element
        String lastElement = treeSet.last();
        System.out.println("Last Element is: " + lastElement);
    }
}

