package lambdaexpressions;

/*
Exercise 189:
Write a Java program to implement a lambda expression to find the largest prime factor of a given number.
*/

import java.util.stream.LongStream;

public class Exercise189 {
    public static void main(String[] args) {
        long n1 = 176;
        System.out.println("Number: " + n1);
        System.out.println("Largest prime factor: " + findLargestPrimeFactor(n1));

        long n2 = 36;
        System.out.println("\nNumber: " + n2);
        System.out.println("Largest prime factor: " + findLargestPrimeFactor(n2));
    }

    // Method to find the largest prime factor of a number
    public static long findLargestPrimeFactor(long n) {
        // Start from sqrt(n) down to 2 and find the largest prime factor
        for (long i = (long) Math.sqrt(n); i >= 2; i--) {
            if (n % i == 0 && isPrime.test(i)) {
                return i;
            }
        }
        return n; // If no prime factor found, return the number itself
    }

    // Lambda expression to check if a number is prime
    static PrimeChecker isPrime = number -> LongStream.rangeClosed(2, (long) Math.sqrt(number))
            .allMatch(n -> number % n != 0);
}

// Functional interface for prime checking
@FunctionalInterface
interface PrimeChecker {
    boolean test(long number);
}
