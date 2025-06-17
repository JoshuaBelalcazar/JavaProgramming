package javacollections.priorityqueues;

/**
 * Exercise 301: Write a Java program to convert a priority queue to an array containing all its elements.
 *
 * Sample Output:
 * Original Priority Queue: [Black, Red, Green, White]
 * Array containing all of the elements in the queue: [Black, Red, Green, White]
 */

import java.util.PriorityQueue;
import java.util.ArrayList;
import java.util.List;

public class Exercise301 {
    public static void main(String[] args) {
        // Create and populate the priority queue
        PriorityQueue<String> pq = new PriorityQueue<>();
        pq.add("Red");
        pq.add("Green");
        pq.add("Black");
        pq.add("White");

        // Display the original priority queue
        System.out.println("Original Priority Queue: " + pq);

        // Convert the priority queue to a list (array)
        List<String> arrayList = new ArrayList<>(pq);
        System.out.println("Array containing all of the elements in the queue: " + arrayList);
    }
}

