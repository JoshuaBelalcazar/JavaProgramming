package javacollections.arraylists;

/**
 * Exercise 233:
 * Write a Java program to copy one array list into another.
 *
 * Sample Output:
 * List1: [1, 2, 3, 4]
 * List2: [A, B, C, D]
 * Copy List to List2,
 * After copy:
 * List1: [A, B, C, D]
 * List2: [A, B, C, D]
 */

import java.util.*;

public class Exercise233 {
    public static void main(String[] args) {
        // Create first list with numeric elements
        List<String> sourceList = new ArrayList<String>();
        sourceList.add("1");
        sourceList.add("2");
        sourceList.add("3");
        sourceList.add("4");
        System.out.println("List1: " + sourceList);

        // Create second list with alphabetic elements
        List<String> destinationList = new ArrayList<String>();
        destinationList.add("A");
        destinationList.add("B");
        destinationList.add("C");
        destinationList.add("D");
        System.out.println("List2: " + destinationList);

        // Copy destinationList to sourceList
        // Note: Both lists must be of same size for Collections.copy to work
        Collections.copy(sourceList, destinationList);

        // Display both lists after copying
        System.out.println("Copy List to List2,\nAfter copy:");
        System.out.println("List1: " + sourceList);
        System.out.println("List2: " + destinationList);
    }
}
