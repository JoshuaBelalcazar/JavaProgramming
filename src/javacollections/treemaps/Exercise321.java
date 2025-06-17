package javacollections.treemaps;

/**
 * Exercise 321: Write a Java program to get a key-value mapping associated with
 * the greatest key and the least key in a map.
 *
 * Sample Output:
 * Original TreeMap content: {C1=Red, C2=Green, C3=Black, C4=White}
 * Least (smallest) entry: C1=Red
 * Greatest (largest) entry: C4=White
 */

import java.util.Map;
import java.util.TreeMap;

public class Exercise321 {
    public static void main(String[] args) {
        // Create and populate a TreeMap
        TreeMap<String, String> treeMap = new TreeMap<>();
        treeMap.put("C1", "Red");
        treeMap.put("C2", "Green");
        treeMap.put("C3", "Black");
        treeMap.put("C4", "White");

        // Display the original map
        System.out.println("Original TreeMap content: " + treeMap);

        // Retrieve the least (smallest) and greatest (largest) entries
        Map.Entry<String, String> leastEntry = treeMap.firstEntry();
        Map.Entry<String, String> greatestEntry = treeMap.lastEntry();

        // Print the results
        System.out.println("Least (smallest) entry: " + leastEntry.getKey() + "=" + leastEntry.getValue());
        System.out.println("Greatest (largest) entry: " + greatestEntry.getKey() + "=" + greatestEntry.getValue());
    }
}

