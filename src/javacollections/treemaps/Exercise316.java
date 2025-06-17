package javacollections.treemaps;

/**
 * Exercise 316: Write a Java program to iterate through a TreeMap and print its key-value mappings.
 *
 * Sample Output:
 * 1=>Red
 * 2=>Green
 * 3=>Black
 * 4=>White
 * 5=>Blue
 */

import java.util.Map;
import java.util.TreeMap;

public class Exercise316 {
    public static void main(String[] args) {
        // Create and populate the TreeMap
        TreeMap<Integer, String> treeMap = new TreeMap<>();
        treeMap.put(1, "Red");
        treeMap.put(2, "Green");
        treeMap.put(3, "Black");
        treeMap.put(4, "White");
        treeMap.put(5, "Blue");

        // Iterate through the TreeMap and print each key=>value pair
        for (Map.Entry<Integer, String> entry : treeMap.entrySet()) {
            System.out.println(entry.getKey() + "=>" + entry.getValue());
        }
    }
}
