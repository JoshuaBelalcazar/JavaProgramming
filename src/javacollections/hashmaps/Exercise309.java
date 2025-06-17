package javacollections.hashmaps;

/**
 * Exercise 309: Write a Java program to get a shallow copy of a HashMap instance.
 *
 * Sample Output:
 * Note: Example6.java uses unchecked or unsafe operations.
 * Note: Recompile with -Xlint:unchecked for details.
 * The Original map: {1=Red, 2=Green, 3=Black, 4=White, 5=Blue}
 * Cloned map: {1=Red, 2=Green, 3=Black, 4=White, 5=Blue}
 */

import java.util.HashMap;
import java.util.Map;

public class Exercise309 {
    public static void main(String[] args) {
        // Create and populate the original HashMap
        Map<Integer, String> originalMap = new HashMap<>();
        originalMap.put(1, "Red");
        originalMap.put(2, "Green");
        originalMap.put(3, "Black");
        originalMap.put(4, "White");
        originalMap.put(5, "Blue");

        System.out.println("The Original map: " + originalMap);

        // Obtain a shallow copy using the copy-constructor
        Map<Integer, String> shallowCopy = new HashMap<>(originalMap);

        System.out.println("Cloned map: " + shallowCopy);
    }
}

