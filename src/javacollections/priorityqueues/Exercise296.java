package javacollections.priorityqueues;

/**
 * Exercise 296:
 * Write a Java program to count the number of elements in a priority queue.
 *
 * Sample Output:
 * Priority Queue: [Black, Pink, Green, Red, orange]
 * Size of the Priority Queue: 5
 */

import java.util.PriorityQueue;

public class Exercise296 {
    public static void main(String[] args) {
        // Create and populate the priority queue
        PriorityQueue<String> pq = new PriorityQueue<>();
        pq.add("Red");
        pq.add("Green");
        pq.add("Black");
        pq.add("Pink");
        pq.add("orange");

        // Display the queue and its size
        System.out.println("Priority Queue: " + pq);
        System.out.println("Size of the Priority Queue: " + pq.size());
    }
}

