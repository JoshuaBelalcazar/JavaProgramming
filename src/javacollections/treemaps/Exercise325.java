package javacollections.treemaps;

/**
 * Exercise 325: Write a Java program to get the portion of a map
 * whose keys are strictly less than a given key.
 *
 * Sample Output:
 * Original TreeMap content: {10=Red, 20=Green, 40=Black, 50=White, 60=Pink}
 * Checking the headMap for 10:
 * Key(s): {}
 * Checking the headMap for 30:
 * Key(s): {10=Red, 20=Green}
 * Checking the headMap for 70:
 * Key(s): {10=Red, 20=Green, 40=Black, 50=White, 60=Pink}
 */

import java.util.NavigableMap;
import java.util.TreeMap;

public class Exercise325 {
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

        // Test headMap for various keys
        int[] testKeys = {10, 30, 70};
        for (int key : testKeys) {
            NavigableMap<Integer, String> head = treeMap.headMap(key, false);
            System.out.println("Checking the headMap for " + key + ":");
            System.out.println("Key(s): " + head);
        }
    }
}

