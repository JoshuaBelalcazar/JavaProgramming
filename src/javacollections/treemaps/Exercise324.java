package javacollections.treemaps;

/**
 * Exercise 324: Write a Java program to get a key-value mapping associated
 * with the greatest key less than or equal to the given key.
 *
 * Sample Output:
 * Original TreeMap content: {10=Red, 20=Green, 40=Black, 50=White, 60=Pink}
 * Checking the entry for 10:
 * Value is: 10=Red
 * Checking the entry for 30:
 * Value is: 20=Green
 * Checking the entry for 70:
 * Value is: 60=Pink
 */

import java.util.Map;
import java.util.TreeMap;

public class Exercise324 {
    public static void main(String[] args) {
        // Create and populate a TreeMap with Integer keys and String values
        TreeMap<Integer, String> treeMap = new TreeMap<>();
        treeMap.put(10, "Red");
        treeMap.put(20, "Green");
        treeMap.put(40, "Black");
        treeMap.put(50, "White");
        treeMap.put(60, "Pink");

        // Display the original TreeMap
        System.out.println("Original TreeMap content: " + treeMap);

        // Query and display the floor entries for specified keys
        int[] testKeys = {10, 30, 70};
        for (int key : testKeys) {
            Map.Entry<Integer, String> entry = treeMap.floorEntry(key);
            System.out.println("Checking the entry for " + key + ":");
            System.out.println("Value is: " + (entry != null ? entry.getKey() + "=" + entry.getValue() : "null"));
        }
    }
}

