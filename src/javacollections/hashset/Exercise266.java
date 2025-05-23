package javacollections.hashset;

/**
 * Exercise 266:
 * Write a Java program to append the specified element to the end of a hash set.
 *
 * Sample Output:
 * The Hash Set: [Red, White, Pink, Yellow, Black, Green]
 */

import java.util.HashSet;

public class Exercise266 {
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

        // Print the hash set
        System.out.println("The Hash Set: " + hSet);
    }
}

