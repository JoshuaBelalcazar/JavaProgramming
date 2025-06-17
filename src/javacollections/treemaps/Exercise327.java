package javacollections.treemaps;

/**
 * Exercise 327: Write a Java program to get the least key strictly greater
 * than the given key in a TreeMap. Return null if there is no such key.
 *
 * Sample Output:
 * Original TreeMap content: {10=Red, 20=Green, 40=Black, 50=White, 60=Pink}
 * Checking higherEntry for key=10:
 * Key(s): 20=Green
 * Checking higherEntry for key=20:
 * Key(s): 40=Black
 * Checking higherEntry for key=70:
 * Key(s): null
 */

import java.util.Map;
import java.util.TreeMap;

public class Exercise327 {
    public static void main(String[] args) {
        // Initialize and populate the TreeMap
        TreeMap<Integer, String> treeMap = new TreeMap<>();
        treeMap.put(10, "Red");
        treeMap.put(20, "Green");
        treeMap.put(40, "Black");
        treeMap.put(50, "White");
        treeMap.put(60, "Pink");

        // Display the original TreeMap
        System.out.println("Original TreeMap content: " + treeMap);

        // Keys to test
        int[] testKeys = {10, 20, 70};

        // For each test key, retrieve and display the higherEntry
        for (int key : testKeys) {
            Map.Entry<Integer, String> higher = treeMap.higherEntry(key);
            System.out.println("Checking higherEntry for key=" + key + ":");
            System.out.println("Key(s): " + higher);
        }
    }
}

