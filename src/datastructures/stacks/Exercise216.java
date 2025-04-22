package datastructures.stacks;

import java.util.HashSet;

public class Exercise216 {
    private int[] arr;
    private int top;

    // Constructor to initialize the stack
    public Exercise216(int size) {
        arr = new int[size];
        top = -1;
    }

    // Push an element onto the stack
    public void push(int num) {
        if (top == arr.length - 1) {
            System.out.println("Stack is full");
        } else {
            arr[++top] = num;
        }
    }

    // Pop an element from the stack
    public int pop() {
        if (top == -1) {
            System.out.println("Stack Underflow");
            return -1;
        } else {
            return arr[top--];
        }
    }

    // Check if the stack is empty
    public boolean isEmpty() {
        return top == -1;
    }

    // Remove duplicate elements from the stack
    public void removeDuplicates() {
        HashSet<Integer> set = new HashSet<>();
        Exercise216 tempStack = new Exercise216(arr.length);

        while (!isEmpty()) {
            int current = pop();
            if (!set.contains(current)) {
                set.add(current);
                tempStack.push(current);
            }
        }

        while (!tempStack.isEmpty()) {
            push(tempStack.pop());
        }
    }

    // Display stack elements
    public void display() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
        } else {
            System.out.print("Stack elements: ");
            for (int i = top; i >= 0; i--) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        System.out.println("Initialize a stack:");
        Exercise216 stack = new Exercise216(10);

        System.out.println("\nInput some elements on the stack:");
        stack.push(1);
        stack.push(3);
        stack.push(2);
        stack.push(0);
        stack.push(7);
        stack.push(5);
        stack.push(-1);
        stack.push(3);
        stack.push(-1);

        stack.display();

        stack.removeDuplicates();
        System.out.println("\nStack after removing duplicates:");
        stack.display();
    }
}

