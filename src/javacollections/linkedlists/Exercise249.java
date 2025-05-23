package javacollections.linkedlists;

/*
 * Exercise 249:
 * Write a Java program to iterate a linked list in reverse order.
 *
 * Sample Output:
 * Original linked list: [Red, Green, Black, Pink, orange]
 * Elements in Reverse Order:
 * orange
 * Pink
 * Black
 * Green
 * Red
 */

import java.util.LinkedList;
import java.util.Iterator;

public class Exercise249 {
    public static void main(String[] args) {
        // Create a linked list and add elements
        LinkedList<String> colorList = new LinkedList<>();
        colorList.add("Red");
        colorList.add("Green");
        colorList.add("Black");
        colorList.add("Pink");
        colorList.add("orange");

        // Print the original list
        System.out.println("Original linked list: " + colorList);

        // Get a descending iterator to iterate in reverse order
        Iterator<String> iterator = colorList.descendingIterator();

        // Print elements in reverse order
        System.out.println("Elements in Reverse Order:");
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
