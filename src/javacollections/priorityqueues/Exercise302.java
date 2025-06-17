package javacollections.priorityqueues;

/**
 * Exercise 302: Write a Java program to convert Priority Queue elements to string representations.
 *
 * Sample Output:
 * Original Priority Queue: [Black, Red, Green, White]
 * String representation of the Priority Queue: [Black, Red, Green, White]
 */

import java.util.PriorityQueue;

public class Exercise302 {
    public static void main(String[] args) {
        // Create and populate the priority queue
        PriorityQueue<String> pq = new PriorityQueue<>();
        pq.add("Red");
        pq.add("Green");
        pq.add("Black");
        pq.add("White");

        // Display the original priority queue
        System.out.println("Original Priority Queue: " + pq);

        // Convert the priority queue to its string representation
        String str = pq.toString();
        System.out.println("String representation of the Priority Queue: " + str);
    }
}
