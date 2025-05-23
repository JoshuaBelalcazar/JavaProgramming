package javacollections.hashset;

/**
 * Exercise 274:
 * Write a Java program to compare two hash sets.
 *
 * Sample Output:
 * Yes
 * No
 * Yes
 * No
 */

import java.util.HashSet;
import java.util.Set;

public class Exercise274 {
    public static void main(String[] args) {
        // Create and populate the first hash set
        Set<String> hSet1 = new HashSet<>();
        hSet1.add("Red");
        hSet1.add("Green");
        hSet1.add("Black");
        hSet1.add("White");

        // Create and populate the second hash set
        Set<String> hSet2 = new HashSet<>();
        hSet2.add("Red");
        hSet2.add("Pink");
        hSet2.add("Black");
        hSet2.add("Orange");

        // Compare elements of the first set against the second set
        for (String element : hSet1) {
            System.out.println(hSet2.contains(element) ? "Yes" : "No");
        }
    }
}
