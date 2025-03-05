package recursion;

/*
Exercise 72:
Write a Java recursive method to calculate the sum of all numbers from 1 to n.

Sample Output:
Sum of numbers from 1 to 7 is: 28
*/

public class Exercise72 {

    // Recursive method to calculate the sum from 1 to n
    public static int calculateSum(int n) {
        // Base case: if n is 0, the sum is 0
        if (n == 0) {
            return 0;
        }
        // Recursive case: add n to the sum of numbers from 1 to n-1
        return n + calculateSum(n - 1);
    }

    public static void main(String[] args) {
        int number = 7;
        int sum = calculateSum(number);
        System.out.println("Sum of numbers from 1 to " + number + " is: " + sum);
    }
}

