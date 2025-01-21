package javabasics_II;

public class Exercise33 {
        /*
        Exercise 33:
        Write a Java program to swap two adjacent nodes in a linked list.

        Expected Output:

        Original Linked list:
        10->20->30->40->50

        After swiping Linked list becomes:
        20->10->40->30->50
        */
    public static void main(String[] args) {


        // Build the linked list
        Node firstNode = new Node(10);
        firstNode.next = new Node(20);
        firstNode.next.next = new Node(30);
        firstNode.next.next.next = new Node(40);
        firstNode.next.next.next.next = new Node(50);

        // Display the original linked list
        System.out.println("\nOriginal Linked list:");
        displayList(firstNode);

        // Perform adjacent swaps
        Node updatedList = swapPairs(firstNode);

        // Display the list after swapping adjacent nodes
        System.out.println("\n\nAfter swapping, Linked list becomes:");
        displayList(updatedList);
    }

    // Method to swap pairs of adjacent nodes in a linked list
    public static Node swapPairs(Node head) {
        // Use a dummy node to simplify swapping
        Node dummy = new Node(0);
        dummy.next = head;
        // We'll move `prev` through the list, swapping pairs as we go
        Node prev = dummy;

        while (prev.next != null && prev.next.next != null) {
            Node first = prev.next;
            Node second = prev.next.next;

            // Perform the swap
            first.next = second.next;
            prev.next = second;
            second.next = first;

            // Advance the pointer for the next pair
            prev = first;
        }
        return dummy.next;
    }

    // Utility method to print the linked list
    public static void displayList(Node nodeRef) {
        while (nodeRef != null) {
            System.out.print(nodeRef.val);
            if (nodeRef.next != null) {
                System.out.print("->");
            }
            nodeRef = nodeRef.next;
        }
    }
}

// Definition of a Node for the linked list
class Node {
    int val;
    Node next;

    Node(int x) {
        val = x;
    }
}