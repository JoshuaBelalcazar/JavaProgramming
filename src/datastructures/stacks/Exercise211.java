package datastructures.stacks;

public class Exercise211 {
    private int[] arr;
    private int top;

    // Constructor to initialize the stack with a given size
    public Exercise211(int size) {
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

    // Pop the top element from the stack
    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack Underflow");
            return -1;
        } else {
            return arr[top--];
        }
    }

    // Peek at the top element without removing it
    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return -1;
        } else {
            return arr[top];
        }
    }

    // Check if the stack is empty
    public boolean isEmpty() {
        return top == -1;
    }

    // Display all elements in the stack
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

    // Main method to test stack operations
    public static void main(String[] args) {
        System.out.println("Initialize a stack:");
        Exercise211 stack = new Exercise211(5);

        System.out.println("Is the stack empty? " + stack.isEmpty());

        System.out.println("\nInput some elements on the stack:");
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        stack.display();

        System.out.println("\nTop element of the stack: " + stack.peek());

        System.out.println("\nRemove two elements from the stack:");
        stack.pop();
        stack.pop();
        stack.display();

        System.out.println("\nTop element of the stack after popping: " + stack.peek());

        System.out.println("\nIs the stack empty? " + stack.isEmpty());
    }
}

