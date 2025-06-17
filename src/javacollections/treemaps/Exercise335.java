package javacollections.treemaps;

/*
  Exercise 335:
  Write a Java program to get a key-value mapping associated with the least key
  greater than or equal to the given key. Return null if there is no such key.

  Sample Output:
  Original TreeMap content: {10=Red, 20=Green, 30=Black, 40=White, 50=Pink}
  Keys greater than or equal to 20: 20=Green
  Keys greater than or equal to 40: 40=White
  Keys greater than or equal to 50: 50=Pink
 */

import java.util.Map;
import java.util.TreeMap;

public class Exercise335 {
    public static void main(String[] args) {
        // Create and populate the TreeMap
        TreeMap<Integer, String> treeMap = new TreeMap<>();
        treeMap.put(10, "Red");
        treeMap.put(20, "Green");
        treeMap.put(30, "Black");
        treeMap.put(40, "White");
        treeMap.put(50, "Pink");

        // Display the original map
        System.out.println("Original TreeMap content: " + treeMap);

        // Find and display the least entry with k`ey >= given key
        Map.Entry<Integer, String> entry;

        entry = treeMap.ceilingEntry(20);
        System.out.println("Keys greater than or equal to 20: " + entry);

        entry = treeMap.ceilingEntry(40);
        System.out.println("Keys greater than or equal to 40: " + entry);

        entry = treeMap.ceilingEntry(50);
        System.out.println("Keys greater than or equal to 50: " + entry);
    }
}

