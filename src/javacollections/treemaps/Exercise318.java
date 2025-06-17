package javacollections.treemaps;

/**
 * Exercise 318: Write a Java program to search for a key in a TreeMap.
 *
 * Sample Output:
 * {C1=Red, C2=Green, C3=Black, C4=White}
 * The TreeMap contains key C1
 * The TreeMap does not contain key C5
 */

import java.util.TreeMap;

public class Exercise318 {
    public static void main(String[] args) {
        // Create and populate the TreeMap
        TreeMap<String, String> treeMap = new TreeMap<>();
        treeMap.put("C1", "Red");
        treeMap.put("C2", "Green");
        treeMap.put("C3", "Black");
        treeMap.put("C4", "White");

        // Display the map
        System.out.println(treeMap);

        // Search for key "C1"
        if (treeMap.containsKey("C1")) {
            System.out.println("The TreeMap contains key C1");
        } else {
            System.out.println("The TreeMap does not contain key C1");
        }

        // Search for key "C5"
        if (treeMap.containsKey("C5")) {
            System.out.println("The TreeMap contains key C5");
        } else {
            System.out.println("The TreeMap does not contain key C5");
        }
    }
}

