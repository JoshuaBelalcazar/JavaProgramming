package javacollections.treemaps;

/**
 * Exercise 323: Write a Java program to get a reverse order view of the keys
 * contained in a given map.
 *
 * Sample Output:
 * Original TreeMap content: {C1=Green, C2=Red, C3=White, C4=Black}
 * Reverse order view of the keys: [C4, C3, C2, C1]
 */

import java.util.TreeMap;
import java.util.NavigableSet;

public class Exercise323 {
    public static void main(String[] args) {
        // Create and populate a TreeMap to maintain natural (ascending) key order
        TreeMap<String, String> treeMap = new TreeMap<>();
        treeMap.put("C2", "Red");
        treeMap.put("C1", "Green");
        treeMap.put("C4", "Black");
        treeMap.put("C3", "White");

        // Display the original map
        System.out.println("Original TreeMap content: " + treeMap);

        // Obtain a reverse-order view of the keys
        NavigableSet<String> reverseKeys = treeMap.descendingKeySet();

        // Print the reverse-order key set
        System.out.println("Reverse order view of the keys: " + reverseKeys);
    }
}

