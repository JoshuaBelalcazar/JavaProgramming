package lambdaexpressions;

/*
Exercise 184:
Write a Java program to implement a lambda expression to filter out even and odd numbers from a list of integers.
*/

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Exercise184 {
    public static void main(String[] args) {

        // Create a list of integers
        List<Integer> nums = Arrays.asList(11, 23, 98, 34, 15, 32, 42, 80, 99, 100);

        // Print the original numbers
        System.out.println("Original numbers:");
        nums.forEach(n -> System.out.print(n + " "));

        // Filter even numbers using lambda expression
        List<Integer> evenNumbers = nums.stream()
                .filter(n -> n % 2 == 0)
                .collect(Collectors.toList());

        // Print the even numbers
        System.out.print("\nEven numbers:");
        evenNumbers.forEach(n -> System.out.print(n + " "));

        // Filter odd numbers using lambda expression
        List<Integer> oddNumbers = nums.stream()
                .filter(n -> n % 2 != 0)
                .collect(Collectors.toList());

        // Print the odd numbers
        System.out.print("\nOdd numbers:");
        oddNumbers.forEach(n -> System.out.print(n + " "));
    }
}

