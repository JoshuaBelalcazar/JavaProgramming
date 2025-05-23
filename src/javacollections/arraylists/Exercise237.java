package javacollections.arraylists;

/*
 * Exercise 237:
 * Write a Java program to compare two array lists.
 *
 * Sample Output:
 * [Yes, Yes, Yes, No, Yes]
 */

import java.util.ArrayList;
import java.util.List;

public class Exercise237 {
    public static void main(String[] args) {
        // Create the first list
        List<String> list1 = new ArrayList<>();
        list1.add("Red");
        list1.add("Green");
        list1.add("Black");
        list1.add("White");
        list1.add("Pink");

        // Create the second list
        List<String> list2 = new ArrayList<>();
        list2.add("Red");
        list2.add("Green");
        list2.add("Black");
        list2.add("Pink");

        // Compare elements of list1 with list2
        List<String> comparisonResult = new ArrayList<>();
        for (String color : list1) {
            comparisonResult.add(list2.contains(color) ? "Yes" : "No");
        }

        // Print the result of comparison
        System.out.println(comparisonResult);
    }
}

