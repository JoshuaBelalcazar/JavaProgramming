package javacollections.hashmaps;


/**
 * Exercise 315: Write a Java program to get a collection view of the values contained in this map.
 *
 * Sample Output:
 * Collection view is: [Red, Green, Black, White, Blue]
 */

import java.util.HashMap;
import java.util.Map;
import java.util.Collection;

public class Exercise315 {
    public static void main(String[] args) {
        // Create and populate the map
        Map<Integer, String> colorMap = new HashMap<>();
        colorMap.put(1, "Red");
        colorMap.put(2, "Green");
        colorMap.put(3, "Black");
        colorMap.put(4, "White");
        colorMap.put(5, "Blue");

        // Get the collection view of values contained in the map
        Collection<String> values = colorMap.values();

        // Display the collection view
        System.out.println("Collection view is: " + values);
    }
}

