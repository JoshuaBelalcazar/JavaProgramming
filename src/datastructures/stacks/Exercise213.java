package datastructures.stacks;

public class Exercise213 {
    private int[] arr;
    private int top;

    // Constructor to initialize the stack
    public Exercise213(int size) {
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
        if (isEmpty()) {
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

    // Reverse the stack elements
    public void reverse() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return;
        }

        int[] reversedArray = new int[top + 1];
        int index = 0;

        // Pop elements and store in reversedArray
        while (!isEmpty()) {
            reversedArray[index++] = pop();
        }

        // Push back to stack
        for (int i = 0; i < index; i++) {
            push(reversedArray[i]);
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

    // Main method to test stack reversal
    public static void main(String[] args) {
        System.out.println("Initialize a stack:");
        Exercise213 stack = new Exercise213(10);

        System.out.println("\nInput some elements on the stack:");
        stack.push(1);
        stack.push(3);
        stack.push(2);
        stack.push(0);
        stack.push(7);
        stack.push(5);
        stack.display();

        System.out.println("\nReverse the elements of the said stack:");
        stack.reverse();
        stack.display();

        System.out.println("\nInput two more elements on the stack:");
        stack.push(9);
        stack.push(10);
        stack.display();

        System.out.println("\nReverse the elements of the said stack:");
        stack.reverse();
        stack.display();
    }
}

