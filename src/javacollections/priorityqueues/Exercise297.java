package javacollections.priorityqueues;

/**
 * Exercise 297:
 * Write a Java program to compare two priority queues.
 *
 * Sample Output:
 * First Priority Queue: [Black, Red, Green, White]
 * Second Priority Queue: [Black, Orange, Pink, Red]
 * Yes
 * Yes
 * No
 * No
 */

import java.util.PriorityQueue;

public class Exercise297 {
    public static void main(String[] args) {
        // Create and populate the first priority queue
        PriorityQueue<String> pq1 = new PriorityQueue<>();
        pq1.add("Red");
        pq1.add("Green");
        pq1.add("Black");
        pq1.add("White");
        System.out.println("First Priority Queue: " + pq1);

        // Create and populate the second priority queue
        PriorityQueue<String> pq2 = new PriorityQueue<>();
        pq2.add("Red");
        pq2.add("Pink");
        pq2.add("Black");
        pq2.add("Orange");
        System.out.println("Second Priority Queue: " + pq2);

        // Compare elements of pq1 against pq2
        for (String element : pq1) {
            System.out.println(pq2.contains(element) ? "Yes" : "No");
        }
    }
}

