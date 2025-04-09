package lambdaexpressions;

/*
Exercise 190:
Write a Java program to implement a lambda expression to convert an integer to their corresponding binary representation.
*/

import java.util.function.Function;

public class Exercise190 {
    public static void main(String[] args) {
        // Lambda expression to convert integer to binary string
        Function<Integer, String> convertToBinary = num -> Integer.toBinaryString(num);

        // First example
        int n1 = 33;
        System.out.println("Number: " + n1);
        System.out.println("Binary representation: " + convertToBinary.apply(n1));

        // Second example
        int n2 = 747;
        System.out.println("\nNumber: " + n2);
        System.out.println("Binary representation: " + convertToBinary.apply(n2));
    }
}
