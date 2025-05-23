package javacollections.hashset;

/**
 * Exercise 267:
 * Write a Java program to iterate through all elements in a hash set.
 *
 * Sample Output:
 * Red
 * White
 * Pink
 * Yellow
 * Black
 * Green
 */

import java.util.HashSet;
import java.util.Iterator;

public class Exercise267 {
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

        // Obtain an iterator for the hash set
        Iterator<String> iterator = hSet.iterator();

        // Iterate through the hash set and print each element
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
