package javacollections.treeset;

/**
 * Exercise 277:
 * Write a Java program to iterate through all elements in a tree set.
 *
 * Sample Output:
 * Black
 * Green
 * Orange
 * Red
 * White
 */

import java.util.TreeSet;
import java.util.Set;

public class Exercise277 {
    public static void main(String[] args) {
        // Create a TreeSet and add some colors
        Set<String> treeSet = new TreeSet<>();
        treeSet.add("Red");
        treeSet.add("Green");
        treeSet.add("Orange");
        treeSet.add("White");
        treeSet.add("Black");

        // Iterate through all elements and print each one
        for (String color : treeSet) {
            System.out.println(color);
        }
    }
}

