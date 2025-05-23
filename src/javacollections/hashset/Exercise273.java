package javacollections.hashset;

/**
 * Exercise 273:
 * Write a Java program to convert a hash set to a tree set.
 *
 * Sample Output:
 * Original Hash Set: [Red, White, Pink, Yellow, Black, Green]
 * TreeSet elements:
 * Black
 * Green
 * Pink
 * Red
 * White
 * Yellow
 */

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Exercise273 {
    public static void main(String[] args) {
        // Create and populate the hash set
        Set<String> hashSet = new HashSet<>();
        hashSet.add("Red");
        hashSet.add("Green");
        hashSet.add("Black");
        hashSet.add("White");
        hashSet.add("Pink");
        hashSet.add("Yellow");

        // Display the original hash set
        System.out.println("Original Hash Set: " + hashSet);

        // Convert the hash set to a tree set (sorted order)
        Set<String> treeSet = new TreeSet<>(hashSet);

        // Display the tree set elements
        System.out.println("TreeSet elements:");
        for (String color : treeSet) {
            System.out.println(color);
        }
    }
}
