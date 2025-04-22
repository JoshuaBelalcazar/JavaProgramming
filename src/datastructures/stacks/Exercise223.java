package datastructures.stacks;

public class Exercise223 {
    private int[] arr;
    private int top;

    public Exercise223(int size) {
        arr = new int[size];
        top = -1;
    }

    public void push(int num) {
        if (top == arr.length - 1) {
            System.out.println("Stack is full");
        } else {
            arr[++top] = num;
        }
    }

    public int pop() {
        if (top == -1) {
            System.out.println("Stack Underflow");
            return -1;
        } else {
            return arr[top--];
        }
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("Stack is empty!");
        } else {
            System.out.print("Stack elements: ");
            for (int i = top; i >= 0; i--) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
    }

    public void findCommonElements(Exercise223 otherStack) {
        Exercise223 commonStack = new Exercise223(arr.length);
        for (int i = 0; i <= top; i++) {
            int currentElement = arr[i];
            for (int j = 0; j <= otherStack.top; j++) {
                if (currentElement == otherStack.arr[j]) {
                    commonStack.push(currentElement);
                    break;
                }
            }
        }
        System.out.print("Common elements: ");
        commonStack.display();
    }

    public static void main(String[] args) {
        Exercise223 stack1 = new Exercise223(5);
        stack1.push(1);
        stack1.push(2);
        stack1.push(3);
        System.out.println("\nStack-1");
        stack1.display();

        Exercise223 stack2 = new Exercise223(5);
        stack2.push(3);
        stack2.push(5);
        stack2.push(6);
        System.out.println("\nStack-2");
        stack2.display();

        Exercise223 stack3 = new Exercise223(5);
        stack3.push(1);
        stack3.push(2);
        stack3.push(4);
        System.out.println("\nStack-3");
        stack3.display();

        System.out.println("\nFind elements that are common in stack1 and stack2:");
        stack1.findCommonElements(stack2);

        System.out.println("\nFind elements that are common in stack1 and stack3:");
        stack1.findCommonElements(stack3);

        System.out.println("\nFind elements that are common in stack3 and stack2:");
        stack3.findCommonElements(stack2);
    }
}
