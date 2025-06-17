package javacollections.hashmaps;

/**
 * Exercise 313: Write a Java program to get the value of a specified key in a map.
 *
 * Sample Output:
 * Value for key 3 is: Black
 */

import java.util.HashMap;
import java.util.Map;

public class Exercise313 {
    public static void main(String[] args) {
        // Create and populate the map
        Map<Integer, String> colorMap = new HashMap<>();
        colorMap.put(1, "Red");
        colorMap.put(2, "Green");
        colorMap.put(3, "Black");
        colorMap.put(4, "White");
        colorMap.put(5, "Blue");

        // Retrieve the value for key 3
        String value = colorMap.get(3);

        // Display the result
        System.out.println("Value for key 3 is: " + value);
    }
}

