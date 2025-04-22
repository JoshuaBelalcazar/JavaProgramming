package datastructures.stacks;

public class Exercise214 {
    private int[] arr;
    private int top;

    // Constructor to initialize the stack
    public Exercise214(int size) {
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

    // Check if the stack is empty
    public boolean isEmpty() {
        return top == -1;
    }

    // Method to get the maximum value in the stack
    public int getMax() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return -1;
        }
        int max = arr[0];
        for (int i = 1; i <= top; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    // Method to get the minimum value in the stack
    public int getMin() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return -1;
        }
        int min = arr[0];
        for (int i = 1; i <= top; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
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

    // Main method to test max and min operations
    public static void main(String[] args) {
        System.out.println("Initialize a stack:");
        Exercise214 stack = new Exercise214(10);

        System.out.println("\nInput some elements on the stack:");
        stack.push(1);
        stack.push(3);
        stack.push(2);
        stack.push(0);
        stack.push(7);
        stack.push(5);
        stack.push(-1);
        stack.display();

        System.out.println("\nMaximum value in stack: " + stack.getMax());
        System.out.println("Minimum value in stack: " + stack.getMin());
    }
}

