package javacollections.treemaps;

/**
 * Exercise 334:
 * Write a Java program to get a portion of a map whose keys are greater than a given key.
 *
 * Sample Output:
 * Original TreeMap content: {10=Red, 20=Green, 30=Black, 40=White, 50=Pink}
 * Keys are greater than 20: {30=Black, 40=White, 50=Pink}
 */

import java.util.NavigableMap;
import java.util.TreeMap;

public class Exercise334 {
    public static void main(String[] args) {
        // Create and populate the TreeMap
        TreeMap<Integer, String> treeMap = new TreeMap<>();
        treeMap.put(10, "Red");
        treeMap.put(20, "Green");
        treeMap.put(30, "Black");
        treeMap.put(40, "White");
        treeMap.put(50, "Pink");

        // Display the original map
        System.out.println("Original TreeMap content: " + treeMap);

        // Get the tailMap from key 20 (exclusive)
        NavigableMap<Integer, String> greaterMap = treeMap.tailMap(20, false);

        // Display the resulting map
        System.out.println("Keys are greater than 20: " + greaterMap);
    }
}
