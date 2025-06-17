package javacollections.treemaps;

/**
 * Exercise 332:
 * Write a Java program to get the portion of a map whose keys range from a given key (inclusive)
 * to another key (exclusive).
 *
 * Sample Output:
 * Original TreeMap content: {10=Red, 20=Green, 30=Black, 40=White, 50=Pink}
 * Sub map key-values: {20=Green, 30=Black}
 */

import java.util.SortedMap;
import java.util.TreeMap;

public class Exercise332 {
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

        // Get the subMap from key 20 (inclusive) to key 40 (exclusive)
        SortedMap<Integer, String> subMap = treeMap.subMap(20, 40);

        // Display the resulting sub-map
        System.out.println("Sub map key-values: " + subMap);
    }
}

