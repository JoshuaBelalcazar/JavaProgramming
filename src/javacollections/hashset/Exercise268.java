package javacollections.hashset;

/**
 * Exercise 268:
 * Write a Java program to get the number of elements in a hash set.
 *
 * Sample Output:
 * Original Hash Set: [Red, White, Pink, Yellow, Black, Green]
 * Size of the Hash Set: 6
 */

import java.util.HashSet;

public class Exercise268 {
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

        // Print the size of the hash set
        System.out.println("Size of the Hash Set: " + hSet.size());
    }
}
