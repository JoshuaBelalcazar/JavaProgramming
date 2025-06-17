package javacollections.hashmaps;

/**
 * Exercise 310: Write a Java program to test if a map contains a mapping for the specified key.
 *
 * Sample Output:
 * The Original map: {Red=1, White=4, Blue=5, Black=3, Green=2}
 * 1. Is key 'Green' exists?
 * yes! - 2
 *
 * 2. Is key 'orange' exists?
 * no!
 */

import java.util.HashMap;
import java.util.Map;

public class Exercise310 {
    public static void main(String[] args) {
        // Create and populate the map
        Map<String, Integer> map = new HashMap<>();
        map.put("Red", 1);
        map.put("Green", 2);
        map.put("Black", 3);
        map.put("White", 4);
        map.put("Blue", 5);

        System.out.println("The Original map: " + map);

        // Test for key "Green"
        System.out.println("1. Is key 'Green' exists?");
        if (map.containsKey("Green")) {
            System.out.println("yes! - " + map.get("Green"));
        } else {
            System.out.println("no!");
        }

        System.out.println();
        // Test for key "orange"
        System.out.println("2. Is key 'orange' exists?");
        if (map.containsKey("orange")) {
            System.out.println("yes! - " + map.get("orange"));
        } else {
            System.out.println("no!");
        }
    }
}

