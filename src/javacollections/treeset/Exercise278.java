package javacollections.treeset;

/**
 * Exercise 278:
 * Write a Java program to add all the elements of a specified tree set to another tree set.
 *
 * Sample Output:
 * Tree set1: [Green, Orange, Red]
 * Tree set2: [Black, Pink, White]
 * Tree set1: [Black, Green, Orange, Pink, Red, White]
 */

import java.util.TreeSet;

public class Exercise278 {
    public static void main(String[] args) {
        // Create the first TreeSet and add elements
        TreeSet<String> treeSet1 = new TreeSet<>();
        treeSet1.add("Red");
        treeSet1.add("Green");
        treeSet1.add("Orange");
        System.out.println("Tree set1: " + treeSet1);

        // Create the second TreeSet and add elements
        TreeSet<String> treeSet2 = new TreeSet<>();
        treeSet2.add("Pink");
        treeSet2.add("White");
        treeSet2.add("Black");
        System.out.println("Tree set2: " + treeSet2);

        // Add all elements from treeSet2 into treeSet1
        treeSet1.addAll(treeSet2);
        System.out.println("Tree set1: " + treeSet1);
    }
}

