package javacollections.treemaps;

/**
 * Exercise 330:
 * Write a Java program to remove and get a key-value mapping associated with the least key in a map.
 *
 * Sample Output:
 * Value before poll: {10=Red, 20=Green, 40=Black, 50=White, 60=Pink}
 * Value returned: 10=Red
 * Value after poll: {20=Green, 40=Black, 50=White, 60=Pink}
 */

import java.util.Map;
import java.util.TreeMap;

public class Exercise330 {
    public static void main(String[] args) {
        // Create and populate the TreeMap
        TreeMap<Integer, String> treeMap = new TreeMap<>();
        treeMap.put(10, "Red");
        treeMap.put(20, "Green");
        treeMap.put(40, "Black");
        treeMap.put(50, "White");
        treeMap.put(60, "Pink");

        // Display the map before polling
        System.out.println("Value before poll: " + treeMap);

        // Remove and return the mapping for the least key
        Map.Entry<Integer, String> firstEntry = treeMap.pollFirstEntry();
        System.out.println("Value returned: " + firstEntry);

        // Display the map after polling
        System.out.println("Value after poll: " + treeMap);
    }
}

