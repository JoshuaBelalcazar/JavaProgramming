package javacollections.treemaps;

/**
 * Exercise 322: Write a Java program to get the first (lowest) key and
 * the last (highest) key currently in a map.
 *
 * Sample Output:
 * Original TreeMap content: {C1=Green, C2=Red, C3=White, C4=Black}
 * Lowest key: C1
 * Highest key: C4
 */

import java.util.TreeMap;

public class Exercise322 {
    public static void main(String[] args) {
        // Create and populate a TreeMap (which keeps keys in sorted order)
        TreeMap<String, String> treeMap = new TreeMap<>();
        treeMap.put("C2", "Red");
        treeMap.put("C1", "Green");
        treeMap.put("C4", "Black");
        treeMap.put("C3", "White");

        // Display the original map
        System.out.println("Original TreeMap content: " + treeMap);

        // Retrieve the lowest and highest keys
        String lowestKey = treeMap.firstKey();
        String highestKey = treeMap.lastKey();

        // Print the results
        System.out.println("Lowest key: " + lowestKey);
        System.out.println("Highest key: " + highestKey);
    }
}

