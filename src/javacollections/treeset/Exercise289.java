package javacollections.treeset;

/**
 * Exercise 289:
 * Write a Java program to retrieve and remove the first element of a tree set.
 *
 * Sample Output:
 * Original tree set: [10, 14, 16, 22, 25, 36, 70, 82, 89]
 * Removes the first(lowest) element: 10
 * Tree set after removing first element: [14, 16, 22, 25, 36, 70, 82, 89]
 */

import java.util.TreeSet;

public class Exercise289 {
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

        // Retrieve and remove the first (lowest) element
        Integer firstElement = treeNumbers.pollFirst();
        System.out.println("Removes the first(lowest) element: " + firstElement);

        // Display the tree set after removal
        System.out.println("Tree set after removing first element: " + treeNumbers);
    }
}
