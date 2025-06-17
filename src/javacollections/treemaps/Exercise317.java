package javacollections.treemaps;

/**
 * Exercise 317: Write a Java program to copy the contents of one TreeMap into another TreeMap.
 *
 * Sample Output:
 * Tree Map 1: {C1=Red, C2=Green, C3=Black, C4=White, C5=Blue}
 * Tree Map 2: {A1=Orange, A2=Pink}
 * After copying Tree Map 2 into Tree Map 1: {A1=Orange, A2=Pink, C1=Red, C2=Green, C3=Black, C4=White, C5=Blue}
 */

import java.util.TreeMap;

public class Exercise317 {
    public static void main(String[] args) {
        // Create and populate the first TreeMap
        TreeMap<String, String> treeMap1 = new TreeMap<>();
        treeMap1.put("C1", "Red");
        treeMap1.put("C2", "Green");
        treeMap1.put("C3", "Black");
        treeMap1.put("C4", "White");
        treeMap1.put("C5", "Blue");
        System.out.println("Tree Map 1: " + treeMap1);

        // Create and populate the second TreeMap
        TreeMap<String, String> treeMap2 = new TreeMap<>();
        treeMap2.put("A1", "Orange");
        treeMap2.put("A2", "Pink");
        System.out.println("Tree Map 2: " + treeMap2);

        // Copy all entries from treeMap2 into treeMap1
        treeMap1.putAll(treeMap2);
        System.out.println("After copying Tree Map 2 into Tree Map 1: " + treeMap1);
    }
}

