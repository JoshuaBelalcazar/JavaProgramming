package javacollections.treeset;

/**
 * Exercise 283:
 * Write a Java program to compare two tree sets.
 * For each element in the first set, print "Yes" if it exists in the second set, otherwise "No".
 *
 * Sample Output:
 * First Tree set: [Black, Green, Red, White]
 * Second Tree set: [Black, Orange, Pink, Red]
 * Yes
 * No
 * Yes
 * No
 */

import java.util.TreeSet;

public class Exercise283 {
    public static void main(String[] args) {
        // Create and populate the first TreeSet
        TreeSet<String> tSet1 = new TreeSet<>();
        tSet1.add("Red");
        tSet1.add("Green");
        tSet1.add("Black");
        tSet1.add("White");
        System.out.println("First Tree set: " + tSet1);

        // Create and populate the second TreeSet
        TreeSet<String> tSet2 = new TreeSet<>();
        tSet2.add("Red");
        tSet2.add("Pink");
        tSet2.add("Black");
        tSet2.add("Orange");
        System.out.println("Second Tree set: " + tSet2);

        // Compare the two sets
        for (String element : tSet1) {
            System.out.println(tSet2.contains(element) ? "Yes" : "No");
        }
    }
}

