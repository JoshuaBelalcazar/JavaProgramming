package javacollections.hashmaps;

/**
 * Exercise 304: Write a Java program to associate the specified value with the specified key in a HashMap.
 *
 * Sample Output:
 * 1 Red
 * 2 Green
 * 3 Black
 * 4 White
 * 5 Blue
 */

import java.util.HashMap;
import java.util.Map;

public class Exercise304 {
    public static void main(String[] args) {
        // Create a HashMap to store Integer keys and String values
        Map<Integer, String> colorMap = new HashMap<>();

        // Associate keys with values using put()
        colorMap.put(1, "Red");
        colorMap.put(2, "Green");
        colorMap.put(3, "Black");
        colorMap.put(4, "White");
        colorMap.put(5, "Blue");

        // Iterate over the entries and print each key-value pair
        for (Map.Entry<Integer, String> entry : colorMap.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}

