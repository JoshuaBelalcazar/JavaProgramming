package javacollections.treemaps;

/**
 * Exercise 326: Write a Java program to get the portion of this map
 * whose keys are less than (or equal to, if inclusive is true) a given key.
 *
 * Sample Output:
 * Original TreeMap content: {10=Red, 20=Green, 40=Black, 50=White, 60=Pink}
 * Checking headMap for key=10, inclusive=true:
 * Key(s): {10=Red}
 * Checking headMap for key=20, inclusive=true:
 * Key(s): {10=Red, 20=Green}
 * Checking headMap for key=70, inclusive=true:
 * Key(s): {10=Red, 20=Green, 40=Black, 50=White, 60=Pink}
 */

import java.util.NavigableMap;
import java.util.TreeMap;

public class Exercise326 {
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

        // Define test keys for headMap with inclusive=true
        int[] testKeys = {10, 20, 70};

        // For each test key, retrieve and display the headMap
        for (int key : testKeys) {
            NavigableMap<Integer, String> head = treeMap.headMap(key, true);
            System.out.println("Checking headMap for key=" + key + ", inclusive=true:");
            System.out.println("Key(s): " + head);
        }
    }
}
