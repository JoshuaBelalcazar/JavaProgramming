package javacollections.priorityqueues;

/**
 * Exercise 294:
 * Write a Java program to add all the elements of a priority queue to another priority queue.
 *
 * Sample Output:
 * Priority Queue1: [Green, Red, Orange]
 * Priority Queue2: [Black, White, Pink]
 * New Priority Queue1: [Black, Green, Orange, Red, White, Pink]
 */

import java.util.PriorityQueue;

public class Exercise294 {
    public static void main(String[] args) {
        // Create and populate the first priority queue
        PriorityQueue<String> queue1 = new PriorityQueue<>();
        queue1.add("Red");
        queue1.add("Green");
        queue1.add("Orange");
        System.out.println("Priority Queue1: " + queue1);

        // Create and populate the second priority queue
        PriorityQueue<String> queue2 = new PriorityQueue<>();
        queue2.add("Pink");
        queue2.add("White");
        queue2.add("Black");
        System.out.println("Priority Queue2: " + queue2);

        // Add all elements from queue2 into queue1
        queue1.addAll(queue2);
        System.out.println("New Priority Queue1: " + queue1);
    }
}

