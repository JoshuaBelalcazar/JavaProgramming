package javacollections.treemaps;

/**
 * Exercise 329:
 * Write a Java program to get a NavigableSet view of keys in a map.
 *
 * Sample Output:
 * Original TreeMap content: {10=Red, 20=Green, 40=Black, 50=White, 60=Pink}
 * NavigableKeySet view: [10, 20, 40, 50, 60]
 */

import java.util.NavigableSet;
import java.util.TreeMap;

public class Exercise329 {
    public static void main(String[] args) {
        // Create and populate the TreeMap
        TreeMap<Integer, String> treeMap = new TreeMap<>();
        treeMap.put(10, "Red");
        treeMap.put(20, "Green");
        treeMap.put(40, "Black");
        treeMap.put(50, "White");
        treeMap.put(60, "Pink");

        // Display the original TreeMap
        System.out.println("Original TreeMap content: " + treeMap);

        // Get a NavigableSet view of the keys
        NavigableSet<Integer> navKeys = treeMap.navigableKeySet();

        // Display the NavigableSet of keys
        System.out.println("NavigableKeySet view: " + navKeys);
    }
}

