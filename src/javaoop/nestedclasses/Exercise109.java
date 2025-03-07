package javaoop.nestedclasses;

/*
Exercise 109:
Write a Java program to create a class called "MathUtil" with a static nested class Calculator.
The Calculator class should have a static method add(int a, int b) that returns the sum of a and b.
Call the add() method from the main method.

Expected Output:
Sum: 26
*/

public class Exercise109 {
    public static void main(String[] args) {
        // Call the static method add from the nested Calculator class
        int sum = MathUtil.Calculator.add(12, 14);
        System.out.println("Sum: " + sum);
    }

    // Private static inner class MathUtil to avoid conflicts
    private static class MathUtil {
        // Static nested class Calculator
        public static class Calculator {
            // Static method add that returns the sum of two integers
            public static int add(int a, int b) {
                return a + b;
            }
        }
    }
}
