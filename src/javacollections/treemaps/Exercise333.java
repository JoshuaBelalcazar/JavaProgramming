package javacollections.treemaps;

/**
 * Exercise 333:
 * Write a Java program to get a portion of a map whose keys are greater than or equal to a given key.
 *
 * Sample Output:
 * Original TreeMap content: {10=Red, 20=Green, 30=Black, 40=White, 50=Pink}
 * Keys are greater than or equal to 20: {20=Green, 30=Black, 40=White, 50=Pink}
 */

import java.util.NavigableMap;
import java.util.TreeMap;

public class Exercise333 {
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

        // Get the tailMap from key 20 (inclusive)
        NavigableMap<Integer, String> tailMap = treeMap.tailMap(20, true);

        // Display the resulting tail map
        System.out.println("Keys are greater than or equal to 20: " + tailMap);
    }
}

