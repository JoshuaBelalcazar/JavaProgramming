package javacollections.priorityqueues;

/**
 * Exercise 298:
 * Write a Java program to retrieve the first element of the priority queue.
 *
 * Sample Output:
 * Original Priority Queue: [10, 14, 36, 16, 22, 70, 82, 89, 25]
 * The first element of the Queue: 10
 */

import java.util.PriorityQueue;

public class    Exercise298 {
    public static void main(String[] args) {
        // Create and populate the priority queue
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(10);
        pq.add(22);
        pq.add(36);
        pq.add(25);
        pq.add(16);
        pq.add(70);
        pq.add(82);
        pq.add(89);
        pq.add(14);

        // Print the entire queue
        System.out.println("Original Priority Queue: " + pq);

        // Retrieve (but do not remove) the head of the queue
        Integer firstElement = pq.peek();
        System.out.println("The first element of the Queue: " + firstElement);
    }
}
