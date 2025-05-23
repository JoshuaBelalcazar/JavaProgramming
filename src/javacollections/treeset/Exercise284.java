package javacollections.treeset;

/**
 * Exercise 284:
 * Write a Java program to find numbers less than 7 in a tree set.
 *
 * Sample Output:
 * Tree set data:
 * 1
 * 2
 * 3
 * 5
 * 6
 */

import java.util.SortedSet;
import java.util.TreeSet;

public class Exercise284 {
    public static void main(String[] args) {
        // Create and populate the TreeSet with integers
        TreeSet<Integer> numbers = new TreeSet<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(5);
        numbers.add(6);
        numbers.add(7);
        numbers.add(8);
        numbers.add(9);
        numbers.add(10);

        // Obtain a view of the set containing elements strictly less than 7
        SortedSet<Integer> lessThanSeven = numbers.headSet(7);

        // Display the result
        System.out.println("Tree set data:");
        for (Integer n : lessThanSeven) {
            System.out.println(n);
        }
    }
}

