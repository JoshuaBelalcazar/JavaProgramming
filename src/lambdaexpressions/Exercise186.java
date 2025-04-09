package lambdaexpressions;

/*
Exercise 186:
Write a Java program to implement a lambda expression to check if a number is prime.
*/

import java.util.function.Predicate;

public class Exercise186 {
    public static void main(String[] args) {

        // Lambda expression to check if a number is prime
        Predicate<Integer> isPrime = n -> {
            if (n <= 1) return false;
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) return false;
            }
            return true;
        };

        // Test cases
        int number1 = 17;
        int number2 = 15;

        // Print results
        System.out.println(number1 + " is prime? " + isPrime.test(number1));
        System.out.println("\n" + number2 + " is prime? " + isPrime.test(number2));
    }
}
