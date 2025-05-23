package javacollections.hashset;

/**
 * Exercise 271:
 * Write a Java program to clone a hash set to another hash set.
 *
 * Sample Output:
 * Original Hash Set: [Red, White, Pink, Yellow, Black, Green]
 * Cloned Hash Set:   [Red, White, Pink, Yellow, Black, Green]
 */

import java.util.HashSet;

public class Exercise271 {
    public static void main(String[] args) {
        // Create and populate the original hash set
        HashSet<String> originalSet = new HashSet<>();
        originalSet.add("Red");
        originalSet.add("Green");
        originalSet.add("Black");
        originalSet.add("White");
        originalSet.add("Pink");
        originalSet.add("Yellow");

        // Display the original set
        System.out.println("Original Hash Set: " + originalSet);

        // Clone the set using the copy constructor for type safety
        HashSet<String> clonedSet = new HashSet<>(originalSet);

        // Display the cloned set
        System.out.println("Cloned Hash Set:   " + clonedSet);
    }
}
