package javacollections.hashmaps;

/**
 * Exercise 306: Write a Java program to copy all mappings from the specified map to another map.
 *
 * Sample Output:
 * Values in first map: {1=Red, 2=Green, 3=Black}
 *
 * Values in second map: {4=White, 5=Blue, 6=Orange}
 *
 * Now values in second map: {1=Red, 2=Green, 3=Black, 4=White, 5=Blue, 6=Orange}
 */

import java.util.HashMap;
import java.util.Map;

public class Exercise306 {
    public static void main(String[] args) {
        // Create and populate the first map
        Map<Integer, String> map1 = new HashMap<>();
        map1.put(1, "Red");
        map1.put(2, "Green");
        map1.put(3, "Black");
        System.out.println("Values in first map: " + map1);

        // Create and populate the second map
        Map<Integer, String> map2 = new HashMap<>();
        map2.put(4, "White");
        map2.put(5, "Blue");
        map2.put(6, "Orange");
        System.out.println("\nValues in second map: " + map2);

        // Copy all mappings from map1 into map2
        map2.putAll(map1);
        System.out.println("\nNow values in second map: " + map2);
    }
}
