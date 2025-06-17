package javacollections.hashmaps;

/**
 * Exercise 314: Write a Java program to get a set view of the keys contained in this map.
 *
 * Sample Output:
 * Key set values are: [1, 2, 3, 4, 5]
 */

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Exercise314 {
    public static void main(String[] args) {
        // Create and populate the map
        Map<Integer, String> colorMap = new HashMap<>();
        colorMap.put(1, "Red");
        colorMap.put(2, "Green");
        colorMap.put(3, "Black");
        colorMap.put(4, "White");
        colorMap.put(5, "Blue");

        // Get the set view of keys contained in the map
        Set<Integer> keySet = colorMap.keySet();

        // Display the key set
        System.out.println("Key set values are: " + keySet);
    }
}
