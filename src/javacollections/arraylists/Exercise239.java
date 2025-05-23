package javacollections.arraylists;

/*
 * Exercise 239:
 * Write a Java program to join two array lists.
 *
 * Sample Output:
 * List of first array: [Red, Green, Black, White, Pink]
 * List of second array: [Red, Green, Black, Pink]
 * New array: [Red, Green, Black, White, Pink, Red, Green, Black, Pink]
 */

import java.util.ArrayList;

public class Exercise239 {
    public static void main(String[] args) {
        // First array list
        ArrayList<String> list1 = new ArrayList<>();
        list1.add("Red");
        list1.add("Green");
        list1.add("Black");
        list1.add("White");
        list1.add("Pink");
        System.out.println("List of first array: " + list1);

        // Second array list
        ArrayList<String> list2 = new ArrayList<>();
        list2.add("Red");
        list2.add("Green");
        list2.add("Black");
        list2.add("Pink");
        System.out.println("List of second array: " + list2);

        // Joining the two lists
        ArrayList<String> joinedList = new ArrayList<>();
        joinedList.addAll(list1);
        joinedList.addAll(list2);

        // Output the joined list
        System.out.println("New array: " + joinedList);
    }
}

