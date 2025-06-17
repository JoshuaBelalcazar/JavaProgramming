package javacollections.hashmaps;

/**
 * Exercise 308: Write a Java program to check whether a map contains key-value mappings (empty) or not.
 *
 * Sample Output:
 * Is hash map empty: false
 * Is hash map empty: true
 */

import java.util.HashMap;
import java.util.Map;

public class Exercise308 {
    public static void main(String[] args) {
        // Create and populate the map
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "Red");
        map.put(2, "Green");
        map.put(3, "Black");
        map.put(4, "White");
        map.put(5, "Blue");

        // Check if the map is empty
        System.out.println("Is hash map empty: " + map.isEmpty());

        // Remove all entries
        map.clear();

        // Check again if the map is empty
        System.out.println("Is hash map empty: " + map.isEmpty());
    }
}

