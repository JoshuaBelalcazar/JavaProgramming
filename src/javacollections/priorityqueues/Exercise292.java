package javacollections.priorityqueues;

/**
 * Exercise 292:
 * Write a Java program to create a priority queue, add some colors (strings)
 * and print out the elements of the priority queue.
 *
 * Sample Output:
 * Elements of the Priority Queue:
 * [Black, Green, Orange, White, Red]
 */

import java.util.PriorityQueue;

public class Exercise292 {
    public static void main(String[] args) {
        // Create a PriorityQueue to hold String elements
        PriorityQueue<String> colorQueue = new PriorityQueue<>();

        // Add some colors to the queue
        colorQueue.add("Red");
        colorQueue.add("Green");
        colorQueue.add("Orange");
        colorQueue.add("White");
        colorQueue.add("Black");

        // Print out the elements of the priority queue
        System.out.println("Elements of the Priority Queue:");
        System.out.println(colorQueue);
    }
}

