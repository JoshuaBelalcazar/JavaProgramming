package javacollections.priorityqueues;

/**
 * Exercise 300: Write a Java program to retrieve and remove the first element of a priority queue.
 *
 * Sample Output:
 * Original Priority Queue: [10, 14, 36, 16, 22, 70, 82, 89, 25]
 * Removes the first element: 10
 * Priority Queue after removing first element: [14, 16, 36, 25, 22, 70, 82, 89]
 */

import java.util.PriorityQueue;

public class Exercise300 {
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

        // Display the original priority queue
        System.out.println("Original Priority Queue: " + pq);

        // Retrieve and remove the first (head) element
        Integer first = pq.poll();
        System.out.println("Removes the first element: " + first);

        // Display the priority queue after removal
        System.out.println("Priority Queue after removing first element: " + pq);
    }
}

