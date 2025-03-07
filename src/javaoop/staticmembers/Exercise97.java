package javaoop.staticmembers;

/*
Exercise 97:
Write a Java program to create a class called "MathUtility" with a static method add that takes two integers and returns their sum.
Demonstrate the usage of this static method in the main method without creating an instance of "MathUtility".

Expected Output:
The sum of 10 and 9 is: 19
*/

public class Exercise97 {
    public static void main(String[] args) {
        // Call the static method add from MathUtility without creating an instance
        int sum = MathUtility.add(10, 9);
        System.out.println("The sum of 10 and 9 is: " + sum);
    }

    // Private static inner class MathUtility to avoid conflicts
    private static class MathUtility {
        // Static method add that takes two integers and returns their sum
        public static int add(int a, int b) {
            return a + b;
        }
    }
}
