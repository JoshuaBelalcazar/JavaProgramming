package javacollections.priorityqueues;

/**
 * Exercise 303: Write a Java program to change a PriorityQueue to a maximum PriorityQueue.
 *
 * Sample Output:
 * Original Priority Queue: [89, 82, 70, 25, 16, 22, 36, 10, 14]
 *
 * Maximum Priority Queue: 89  82  70  36  25  22  16  14  10
 */

import java.util.Collections;
import java.util.PriorityQueue;

public class Exercise303 {
    public static void main(String[] args) {
        // Create a max-heap by supplying reverseOrder comparator
        PriorityQueue<Integer> maxPQ = new PriorityQueue<>(10, Collections.reverseOrder());

        // Add numbers to the priority queue
        maxPQ.add(10);
        maxPQ.add(22);
        maxPQ.add(36);
        maxPQ.add(25);
        maxPQ.add(16);
        maxPQ.add(70);
        maxPQ.add(82);
        maxPQ.add(89);
        maxPQ.add(14);

        // Display the internal ordering of the max-heap
        System.out.println("Original Priority Queue: " + maxPQ);
        System.out.println();

        // Poll elements one by one to demonstrate max-priority order
        System.out.print("Maximum Priority Queue: ");
        Integer value;
        while ((value = maxPQ.poll()) != null) {
            System.out.print(value + "  ");
        }
        System.out.println();
    }
}

