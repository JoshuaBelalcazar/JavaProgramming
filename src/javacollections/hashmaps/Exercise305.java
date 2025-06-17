package javacollections.hashmaps;

/**
 * Exercise 305: Write a Java program to count the number of key-value (size) mappings in a map.
 *
 * Sample Output:
 * Size of the hash map: 5
 */

import java.util.HashMap;
import java.util.Map;

public class Exercise305 {
    public static void main(String[] args) {
        // Create a HashMap to store Integer keys and String values
        Map<Integer, String> colorMap = new HashMap<>();

        // Populate the map with some entries
        colorMap.put(1, "Red");
        colorMap.put(2, "Green");
        colorMap.put(3, "Black");
        colorMap.put(4, "White");
        colorMap.put(5, "Blue");

        // Print out the size of the map
        System.out.println("Size of the hash map: " + colorMap.size());
    }
}

