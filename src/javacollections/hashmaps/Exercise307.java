package javacollections.hashmaps;

/**
 * Exercise 307: Write a Java program to remove all mappings from a map.
 *
 * Sample Output:
 * The Original map: {1=Red, 2=Green, 3=Black, 4=White, 5=Blue}
 * The New map: {}
 */

import java.util.HashMap;
import java.util.Map;

public class Exercise307 {
    public static void main(String[] args) {
        // Create and populate the map
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "Red");
        map.put(2, "Green");
        map.put(3, "Black");
        map.put(4, "White");
        map.put(5, "Blue");

        // Print the original map
        System.out.println("The Original map: " + map);

        // Remove all mappings
        map.clear();

        // Print the map after removing all entries
        System.out.println("The New map: " + map);
    }
}

