package javacollections.hashset;

/**
 * Exercise 269:
 * Write a Java program to empty a hash set.
 *
 * Sample Output:
 * Original Hash Set: [Red, White, Pink, Yellow, Black, Green]
 * Hash Set after removing all the elements: []
 */

import java.util.HashSet;

public class Exercise269 {
    public static void main(String[] args) {
        // Create an empty hash set
        HashSet<String> hSet = new HashSet<>();

        // Add elements to the hash set
        hSet.add("Red");
        hSet.add("Green");
        hSet.add("Black");
        hSet.add("White");
        hSet.add("Pink");
        hSet.add("Yellow");

        // Print the original hash set
        System.out.println("Original Hash Set: " + hSet);

        // Remove all elements from the hash set
        hSet.clear();

        // Print the hash set after clearing
        System.out.println("Hash Set after removing all the elements: " + hSet);
    }
}
