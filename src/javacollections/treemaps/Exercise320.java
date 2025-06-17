package javacollections.treemaps;

/**
 * Exercise 320: Write a Java program to sort keys in a TreeMap by using a Comparator.
 *
 * Sample Output:
 * {C1=White, C2=Red, C3=Black, C4=Green}
 */

import java.util.Comparator;
import java.util.TreeMap;

public class Exercise320 {
    public static void main(String[] args) {
        // Create a TreeMap with a custom Comparator for keys
        TreeMap<String, String> treeMap = new TreeMap<>(new SortKey());

        // Put elements into the map in arbitrary order
        treeMap.put("C2", "Red");
        treeMap.put("C4", "Green");
        treeMap.put("C3", "Black");
        treeMap.put("C1", "White");

        // Print the TreeMap; keys will be in sorted order per the Comparator
        System.out.println(treeMap);
    }

    // Comparator implementation to sort keys lexicographically
    static class SortKey implements Comparator<String> {
        @Override
        public int compare(String str1, String str2) {
            return str1.compareTo(str2);
        }
    }
}

