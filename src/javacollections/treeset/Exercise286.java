package javacollections.treeset;

/**
 * Exercise 286:
 * Write a Java program to get the element in a tree set less than or equal to the given element.
 *
 * Sample Output:
 * Less than or equal to 86 : 82
 * Less than or equal to 29 : 25
 */

import java.util.TreeSet;

public class Exercise286 {
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

        // Find and print the greatest element less than or equal to 86
        Integer floorFor86 = treeNumbers.floor(86);
        System.out.println("Less than or equal to 86 : " + floorFor86);

        // Find and print the greatest element less than or equal to 29
        Integer floorFor29 = treeNumbers.floor(29);
        System.out.println("Less than or equal to 29 : " + floorFor29);
    }
}

