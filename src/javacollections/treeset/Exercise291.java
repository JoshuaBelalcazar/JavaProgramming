package javacollections.treeset;

/**
 * Exercise 291:
 * Write a Java program to remove a given element from a tree set.
 *
 * Sample Output:
 * Original tree set: [10, 14, 16, 22, 25, 36, 70, 82, 89]
 * Removes 70 from the list: true
 * Tree set after removing 70: [10, 14, 16, 22, 25, 36, 82, 89]
 */

import java.util.TreeSet;

public class Exercise291 {
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

        // Display the original tree set
        System.out.println("Original tree set: " + treeNumbers);

        // Remove the specified element (70) and report success
        boolean removed = treeNumbers.remove(70);
        System.out.println("Removes 70 from the list: " + removed);

        // Display the tree set after removal
        System.out.println("Tree set after removing 70: " + treeNumbers);
    }
}

