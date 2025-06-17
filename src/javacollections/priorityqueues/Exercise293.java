package javacollections.priorityqueues;

/**
 * Exercise 293:
 * Write a Java program to iterate through all elements in the priority queue.
 *
 * Sample Output:
 * Elements of the Priority Queue:
 * Black
 * Green
 * Orange
 * White
 * Red
 */

import java.util.PriorityQueue;

public class Exercise293 {
    public static void main(String[] args) {
        // Create and populate the priority queue
        PriorityQueue<String> pq = new PriorityQueue<>();
        pq.add("Red");
        pq.add("Green");
        pq.add("Orange");
        pq.add("White");
        pq.add("Black");

        // Iterate through all elements in the priority queue
        System.out.println("Elements of the Priority Queue:");
        for (String color : pq) {
            System.out.println(color);
        }
    }
}

