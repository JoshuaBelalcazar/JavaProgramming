package javacollections.treeset;

/**
 * Exercise 288:
 * Write a Java program to get an element in a tree set that has a lower value than the given element.
 *
 * Sample Output:
 * Strictly less than 69 : 36
 * Strictly less than 12 : 10
 */

import java.util.TreeSet;

public class Exercise288 {
    public static void main(String[] args) {
        // Create and populate the TreeSet with integer values
        TreeSet<Integer> treeNumbers = new TreeSet<>();
        treeNumbers.add(10);
        treeNumbers.add(22);
        treeNumbers.add(36);
        treeNumbers.add(25);
        treeNumbers.add(16);
        treeNumbers.add(70);
        treeNumbers.add(82);
        treeNumbers.add(89);
        treeNumbers.add(14);

        // Find and print the greatest element strictly less than 69
        Integer lowerThan69 = treeNumbers.lower(69);
        System.out.println("Strictly less than 69 : " + lowerThan69);

        // Find and print the greatest element strictly less than 12
        Integer lowerThan12 = treeNumbers.lower(12);
        System.out.println("Strictly less than 12 : " + lowerThan12);
    }
}
