package javacollections.linkedlists;


/**
 * Exercise 259:
 * Write a Java program to join two linked lists.
 *
 * Sample Output:
 * List of first linked list: [Red, Green, Black, White, Pink]
 * List of second linked list: [Red, Green, Black, Pink]
 * New linked list: [Red, Green, Black, White, Pink, Red, Green, Black, Pink]
 */

import java.util.LinkedList;

public class Exercise259 {
    public static void main(String[] args) {
        // Create the first linked list and add elements
        LinkedList<String> firstList = new LinkedList<>();
        firstList.add("Red");
        firstList.add("Green");
        firstList.add("Black");
        firstList.add("White");
        firstList.add("Pink");
        System.out.println("List of first linked list: " + firstList);

        // Create the second linked list and add elements
        LinkedList<String> secondList = new LinkedList<>();
        secondList.add("Red");
        secondList.add("Green");
        secondList.add("Black");
        secondList.add("Pink");
        System.out.println("List of second linked list: " + secondList);

        // Join both lists
        LinkedList<String> joinedList = new LinkedList<>(firstList);
        joinedList.addAll(secondList);
        System.out.println("New linked list: " + joinedList);
    }
}
```
