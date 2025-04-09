package lambdaexpressions;

/*
Exercise 187:
Write a Java program to implement a lambda expression to calculate the sum of squares of all odd and even numbers in a list.
*/

import java.util.Arrays;
import java.util.List;

public class Exercise187 {
    public static void main(String[] args) {
        // Create a list of integers
        List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        System.out.println("Original list elements: " + nums);

        // Sum of squares of odd numbers using lambda and streams
        int sumOfSquaresOdd = nums.stream()
                .filter(n -> n % 2 != 0)
                .mapToInt(n -> n * n)
                .sum();

        // Sum of squares of even numbers using lambda and streams
        int sumOfSquaresEven = nums.stream()
                .filter(n -> n % 2 == 0)
                .mapToInt(n -> n * n)
                .sum();

        // Output results
        System.out.println("\nSum of squares of odd numbers: " + sumOfSquaresOdd);
        System.out.println("\nSum of squares of even numbers: " + sumOfSquaresEven);
    }
}
