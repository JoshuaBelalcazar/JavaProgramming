package lambdaexpressions;

/*
Exercise 183:
Write a Java program to implement a lambda expression to convert a list of strings to uppercase and lowercase.
*/

import java.util.Arrays;
import java.util.List;

public class Exercise183 {
    public static void main(String[] args) {

        // Create a list of strings
        List<String> stringList = Arrays.asList("Red", "Green", "Blue", "PINK");

        // Print the original strings
        System.out.println("\nOriginal strings:");
        stringList.forEach(str -> System.out.println(str));

        // Convert strings to lowercase using lambda expression
        stringList.replaceAll(str -> str.toLowerCase());

        // Print the list of lowercase strings
        System.out.println("\nLowercase strings:");
        stringList.forEach(str -> System.out.println(str));

        // Convert strings to uppercase using lambda expression
        stringList.replaceAll(str -> str.toUpperCase());

        // Print the list of uppercase strings
        System.out.println("\nUppercase strings:");
        stringList.forEach(str -> System.out.println(str));
    }
}
