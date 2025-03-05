package recursion;

/*
Exercise 73:
Write a Java recursive method to calculate the nth Fibonacci number.

Sample Output:
The Fibonacci number at position 0 is: 0

The Fibonacci number at position 3 is: 2

The Fibonacci number at position 9 is: 34
*/

public class Exercise73 {
    // Recursive method to calculate the nth Fibonacci number
    public static int calculateFibonacci(int n) {
        // Base cases: Fibonacci number at position 0 is 0 and at position 1 is 1
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        }
        // Recursive case: Sum of the two preceding Fibonacci numbers
        return calculateFibonacci(n - 1) + calculateFibonacci(n - 2);
    }

    public static void main(String[] args) {
        int position = 0;
        int fibonacciNumber = calculateFibonacci(position);
        System.out.println("The Fibonacci number at position " + position + " is: " + fibonacciNumber);

        position = 3;
        fibonacciNumber = calculateFibonacci(position);
        System.out.println("\nThe Fibonacci number at position " + position + " is: " + fibonacciNumber);

        position = 9;
        fibonacciNumber = calculateFibonacci(position);
        System.out.println("\nThe Fibonacci number at position " + position + " is: " + fibonacciNumber);
    }
}
