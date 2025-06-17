package javacollections.hashmaps;

/**
 * Exercise 311: Write a Java program to test if a map contains a mapping for the specified value.
 *
 * Sample Output:
 * The Original map: {1=Red, 2=Green, 3=Black, 4=White, 5=Blue}
 * 1. Is value 'Green' exists?
 * Yes!
 *
 * 2. Is value 'orange' exists?
 * No!
 */

import java.util.HashMap;
import java.util.Map;

public class Exercise311 {
    public static void main(String[] args) {
        // Create and populate the map
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "Red");
        map.put(2, "Green");
        map.put(3, "Black");
        map.put(4, "White");
        map.put(5, "Blue");

        System.out.println("The Original map: " + map);

        // Test for value "Green"
        System.out.println("1. Is value 'Green' exists?");
        if (map.containsValue("Green")) {
            System.out.println("Yes!");
        } else {
            System.out.println("No!");
        }

        System.out.println();
        // Test for value "orange"
        System.out.println("2. Is value 'orange' exists?");
        if (map.containsValue("orange")) {
            System.out.println("Yes!");
        } else {
            System.out.println("No!");
        }
    }
}

