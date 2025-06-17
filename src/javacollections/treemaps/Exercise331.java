package javacollections.treemaps;

/**
 * Exercise 331:
 * Write a Java program to remove and get a key-value mapping associated with the greatest key in this map.
 *
 * Sample Output:
 * Value before poll: {10=Red, 20=Green, 40=Black, 50=White, 60=Pink}
 * Value returned: 60=Pink
 * Value after poll: {10=Red, 20=Green, 40=Black, 50=White}
 */

import java.util.Map;
import java.util.TreeMap;

public class Exercise331 {
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

        // Remove and return the mapping for the greatest key
        Map.Entry<Integer, String> lastEntry = treeMap.pollLastEntry();
        System.out.println("Value returned: " + lastEntry);

        // Display the map after polling
        System.out.println("Value after poll: " + treeMap);
    }
}

