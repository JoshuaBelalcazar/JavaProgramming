package javacollections.hashset;

/**
 * Exercise 270:
 * Write a Java program to test if a hash set is empty or not.
 *
 * Sample Output:
 * Original Hash Set: [Red, White, Pink, Yellow, Black, Green]
 * Is the hash set empty? false
 * After clearing, is the hash set empty? true
 */

import java.util.HashSet;

public class Exercise270 {
    public static void main(String[] args) {
        // Create and populate the hash set
        HashSet<String> colors = new HashSet<>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Black");
        colors.add("White");
        colors.add("Pink");
        colors.add("Yellow");

        // Display the original set and check if it's empty
        System.out.println("Original Hash Set: " + colors);
        System.out.println("Is the hash set empty? " + colors.isEmpty());

        // Clear all elements and check again
        colors.clear();
        System.out.println("After clearing, is the hash set empty? " + colors.isEmpty());
    }
}
