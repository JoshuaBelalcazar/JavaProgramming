package javacollections.priorityqueues;

/**
 * Exercise 299: Write a Java program to remove all elements from a priority queue.
 *
 * Sample Output:
 * Original Priority Queue: [Black, Red, Green, White]
 * The New Priority Queue: []
 */

import java.util.PriorityQueue;

public class Exercise299 {
    public static void main(String[] args) {
        // Create and populate the priority queue
        PriorityQueue<String> pq = new PriorityQueue<>();
        pq.add("Red");
        pq.add("Green");
        pq.add("Black");
        pq.add("White");

        // Display the original priority queue
        System.out.println("Original Priority Queue: " + pq);

        // Remove all elements from the priority queue
        pq.clear();

        // Display the cleared priority queue
        System.out.println("The New Priority Queue: " + pq);
    }
}

