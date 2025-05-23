package javacollections.linkedlists;

/**
 * Exercise 265:
 * Write a Java program to convert a linked list to an array list.
 *
 * Sample Output:
 * Original linked list: [Red, Green, Black, White, Pink]
 * Red
 * Green
 * Black
 * White
 * Pink
 */

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Exercise265 {
    public static void main(String[] args) {
        // create and populate the linked list
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("Red");
        linkedList.add("Green");
        linkedList.add("Black");
        linkedList.add("White");
        linkedList.add("Pink");
        System.out.println("Original linked list: " + linkedList);

        // convert the linked list to an array list
        List<String> arrayList = new ArrayList<>(linkedList);

        // print the elements of the new array list
        for (String color : arrayList) {
            System.out.println(color);
        }
    }
}
