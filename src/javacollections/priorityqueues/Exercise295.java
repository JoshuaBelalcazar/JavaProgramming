package javacollections.priorityqueues;

/**
 * Exercise 295:
 * Write a Java program to insert a given element into a priority queue.
 *
 * Sample Output:
 * Original Priority Queue: [Black, Red, Green, White]
 * The New Priority Queue: [Black, Blue, Green, White, Red]
 */

import java.util.PriorityQueue;

public class Exercise295 {
    public static void main(String[] args) {
        // Create and populate the priority queue
        PriorityQueue<String> pq = new PriorityQueue<>();
        pq.add("Red");
        pq.add("Green");
        pq.add("Black");
        pq.add("White");
        System.out.println("Original Priority Queue: " + pq);

        // Insert the specified element into the priority queue
        pq.offer("Blue");
        System.out.println("The New Priority Queue: " + pq);
    }
}

