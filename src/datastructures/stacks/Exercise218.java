package datastructures.stacks;

public class Exercise218 {
    private int[] arr;
    private int top;

    // Constructor to initialize the stack
    public Exercise218(int size) {
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

    // Rotate the stack elements to the right
    public void rotateStackToRight(int rotations) {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return;
        }
        rotations = rotations % (top + 1);
        for (int i = 0; i < rotations; i++) {
            int temp = arr[0];
            for (int j = 0; j < top; j++) {
                arr[j] = arr[j + 1];
            }
            arr[top] = temp;
        }
    }

    public static void main(String[] args) {
        System.out.println("Initialize a stack:");
        Exercise218 stack = new Exercise218(7);

        System.out.println("Input some elements on the stack:");
        stack.push(7);
        stack.push(6);
        stack.push(5);
        stack.push(4);
        stack.push(3);
        stack.push(2);
        stack.push(1);
        stack.display();

        System.out.println("\nRotate the stack elements to the right by 1 position:");
        stack.rotateStackToRight(1);
        System.out.println("Display the rotated stack:");
        stack.display();

        System.out.println("\nRotate the stack elements to the right by 2 positions:");
        stack.rotateStackToRight(2);
        System.out.println("Display the rotated stack:");
        stack.display();

        System.out.println("\nRotate the stack elements to the right by 3 positions:");
        stack.rotateStackToRight(3);
        System.out.println("Display the rotated stack:");
        stack.display();
    }
}
