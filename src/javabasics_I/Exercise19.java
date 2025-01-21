package javabasics_I;

public class Exercise19 {
    public static void main(String[] args) {
        /*
        Exercise 19:
        Write a Java program to check if a string starts with a specified word.
        Sample Data: string1 = "Hello how are you?"
        Sample Output:

        true
         */

        // Define a sample string to test
        String testString = "Hello how are you?";

        // Check if the string starts with the word "Hello"
        boolean isStartingWithHello = testString.startsWith("Hello");

        // Print the result
        System.out.println(isStartingWithHello);
    }
}