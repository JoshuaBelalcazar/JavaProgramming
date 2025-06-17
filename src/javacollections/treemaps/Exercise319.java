package javacollections.treemaps;

/**
 * Exercise 319: Write a Java program to delete all elements from a TreeMap.
 *
 * Sample Output:
 * Original TreeMap content: {C1=Red, C2=Green, C3=Black, C4=White}
 * The New map: {}
 */

import java.util.TreeMap;

public class Exercise319 {
    public static void main(String[] args) {
        // Create and populate the TreeMap
        TreeMap<String, String> treeMap = new TreeMap<>();
        treeMap.put("C1", "Red");
        treeMap.put("C2", "Green");
        treeMap.put("C3", "Black");
        treeMap.put("C4", "White");

        // Display original content
        System.out.println("Original TreeMap content: " + treeMap);

        // Remove all elements
        treeMap.clear();

        // Display the map after deletion
        System.out.println("The New map: " + treeMap);
    }
}

