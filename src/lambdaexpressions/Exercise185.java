package lambdaexpressions;

/*
Exercise 185:
Write a lambda expression to implement a lambda expression to calculate the factorial of a given number.
*/

import java.util.function.LongUnaryOperator;

public class Exercise185 {
    public static void main(String[] args) {

        // Lambda expression to compute factorial of a number
        LongUnaryOperator factorial = n -> {
            long result = 1;
            for (long i = 1; i <= n; i++) {
                result *= i;
            }
            return result;
        };

        // Example: calculate factorial of 7
        long n = 7;
        long factorialResult = factorial.applyAsLong(n);

        // Print the result
        System.out.println("Factorial of " + n + " is: " + factorialResult);
    }
}

