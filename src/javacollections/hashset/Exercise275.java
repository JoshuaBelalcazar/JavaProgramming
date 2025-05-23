package javacollections.hashset;

/**
 * Exercise 275:
 * Write a Java program to compare two sets and retain elements that are the same.
 *
 * Sample Output:
 * First HashSet content: [Red, White, Black, Green]
 * Second HashSet content: [Red, Pink, Black, Orange]
 * HashSet content:
 * [Red, Black]
 */

import java.util.HashSet;
import java.util.Set;

public class Exercise275 {
    public static void main(String[] args) {
        // Create and populate the first hash set
        Set<String> hSet1 = new HashSet<>();
        hSet1.add("Red");
        hSet1.add("Green");
        hSet1.add("Black");
        hSet1.add("White");
        System.out.println("First HashSet content: " + hSet1);

        // Create and populate the second hash set
        Set<String> hSet2 = new HashSet<>();
        hSet2.add("Red");
        hSet2.add("Pink");
        hSet2.add("Black");
        hSet2.add("Orange");
        System.out.println("Second HashSet content: " + hSet2);

        // Retain only the elements that are present in both sets
        hSet1.retainAll(hSet2);
        System.out.println("HashSet content:");
        System.out.println(hSet1);
    }
}
