package javacollections.treeset;

/**
 * Exercise 285:
 * Write a Java program to get the element in a tree set which is greater than or equal to the given element.
 *
 * Sample Output:
 * Greater than or equal to 86 : 89
 * Greater than or equal to 29 : 36
 */

import java.util.TreeSet;

public class Exercise285 {
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

        // Find and print the least element greater than or equal to 86
        Integer ceilingFor86 = treeNumbers.ceiling(86);
        System.out.println("Greater than or equal to 86 : " + ceilingFor86);

        // Find and print the least element greater than or equal to 29
        Integer ceilingFor29 = treeNumbers.ceiling(29);
        System.out.println("Greater than or equal to 29 : " + ceilingFor29);
    }
}

