package javacollections.arraylists;

/**
 * Exercise 235:
 * Write a Java program to reverse elements in an array list.
 *
 * Sample Output:
 * List before reversing :
 * [Red, Green, Orange, White, Black]
 * List after reversing :
 * [Black, White, Orange, Green, Red]
 */

import java.util.*;

public class Exercise235 {
    public static void main(String[] args) {
        // Create a list and add some colors to the list
        List<String> colorsList = new ArrayList<String>();

        // Add color elements to the list
        colorsList.add("Red");
        colorsList.add("Green");
        colorsList.add("Orange");
        colorsList.add("White");
        colorsList.add("Black");

        // Display the list before reversing
        System.out.println("List before reversing :\n" + colorsList);

        // Reverse the order of elements in the list
        Collections.reverse(colorsList);

        // Display the list after reversing
        System.out.println("List after reversing :\n" + colorsList);
    }
}
