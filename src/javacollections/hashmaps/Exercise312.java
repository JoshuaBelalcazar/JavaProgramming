package javacollections.hashmaps;

/**
 * Exercise 312: Write a Java program to create a set view of the mappings contained in a map.
 *
 * Sample Output:
 * Set values: [1=Red, 2=Green, 3=Black, 4=White, 5=Blue]
 */

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Exercise312 {
    public static void main(String[] args) {
        // Create and populate the map
        Map<Integer, String> hashMap = new HashMap<>();
        hashMap.put(1, "Red");
        hashMap.put(2, "Green");
        hashMap.put(3, "Black");
        hashMap.put(4, "White");
        hashMap.put(5, "Blue");

        // Create a set view of the map's mappings
        Set<Map.Entry<Integer, String>> entrySet = hashMap.entrySet();

        // Display the set view
        System.out.println("Set values: " + entrySet);
    }
}

