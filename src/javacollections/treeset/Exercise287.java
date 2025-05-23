package javacollections.treeset;

/**
 * Exercise 287:
 * Write a Java program to get the element in a tree set strictly greater than the given element.
 *
 * Sample Output:
 * Strictly greater than 76 : 82
 * Strictly greater than 31 : 36
 */

import java.util.TreeSet;

public class Exercise287 {
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

        // Find and print the least element strictly greater than 76
        Integer higherThan76 = treeNumbers.higher(76);
        System.out.println("Strictly greater than 76 : " + higherThan76);

        // Find and print the least element strictly greater than 31
        Integer higherThan31 = treeNumbers.higher(31);
        System.out.println("Strictly greater than 31 : " + higherThan31);
    }
}

