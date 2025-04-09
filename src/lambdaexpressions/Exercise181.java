package lambdaexpressions;

/*
Exercise 181:
Write a Java program to implement a lambda expression to find the sum of two integers.
*/

// SumCalculator.java

// Functional Interface with a single abstract method
interface SumCalculator {
    int sum(int a, int b);  // Method to calculate sum of two integers
}

// Exercise181.java
public class Exercise181 {
    public static void main(String[] args) {

        // Lambda expression to implement the sum() method of SumCalculator interface
        SumCalculator sumCalculator = (x, y) -> x + y;

        // Testing the lambda expression with different integer values
        int result1 = sumCalculator.sum(7, 6);
        int result2 = sumCalculator.sum(15, -35);

        // Displaying the results
        System.out.println("Sum of (7, 6): " + result1);
        System.out.println("Sum of (15, -35): " + result2);
    }
}
