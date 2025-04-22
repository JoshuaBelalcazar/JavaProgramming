package datastructures.stacks;

public class Exercise217 {
    private int[] arr;
    private int top;

    // Constructor to initialize the stack
    public Exercise217(int size) {
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

    // Get the top element of the stack
    public int peek() {
        if (top == -1) {
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
        Exercise217 stack = new Exercise217(10);

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

        System.out.println("\nGet the top element:");
        int topElement = stack.peek();
        System.out.println("Top element: " + topElement);

        System.out.println("\nGet the bottom element:");
        int bottomElement = -1;
        while (!stack.isEmpty()) {
            bottomElement = stack.pop();
        }
        System.out.println("Bottom element: " + bottomElement);
    }
}

