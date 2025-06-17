package javacollections.treemaps;

/**
 * Exercise 328:
 * Write a Java program to get a key-value mapping associated with the greatest key
 * strictly less than the given key. Return null if there is no such key.
 *
 * Sample Output:
 * Original TreeMap content: {10=Red, 20=Green, 40=Black, 50=White, 60=Pink}
 * Checking lowerEntry for key=10:
 * Key(s): null
 * Checking lowerEntry for key=20:
 * Key(s): 10=Red
 * Checking lowerEntry for key=70:
 * Key(s): 60=Pink
 */

import java.util.Map;
import java.util.TreeMap;

public class Exercise328 {
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

        // Keys to test
        int[] keysToTest = {10, 20, 70};

        // For each key, retrieve and display the lowerEntry
        for (int key : keysToTest) {
            Map.Entry<Integer, String> lower = treeMap.lowerEntry(key);
            System.out.println("Checking lowerEntry for key=" + key + ":");
            System.out.println("Key(s): " + lower);
        }
    }
}

