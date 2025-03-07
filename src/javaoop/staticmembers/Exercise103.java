package javaoop.staticmembers;

/*
Exercise 103:
Write a Java program to create a class called "Initializer" with a static block that initializes a static variable 'initialValue' to 1000.
Print the value of 'initialValue' before and after creating an instance of "Initializer".

Expected Output:
Static block: initialValue initialized to 1000
Before creating an instance: initialValue = 1000
After creating an instance: initialValue = 1000
*/

public class Exercise103 {
    public static void main(String[] args) {
        // Print the static variable before creating any instance.
        System.out.println("Before creating an instance: initialValue = " + Initializer.initialValue);

        // Create an instance of the Initializer class.
        Initializer instance = new Initializer();

        // Print the static variable after creating the instance.
        System.out.println("After creating an instance: initialValue = " + Initializer.initialValue);
    }

    // Private static inner class Initializer to avoid conflicts.
    private static class Initializer {
        // Declare a static variable initialValue.
        static int initialValue;

        // Static block to initialize initialValue.
        static {
            initialValue = 1000;
            System.out.println("Static block: initialValue initialized to " + initialValue);
        }

        // Default constructor.
        public Initializer() {
            // No additional initialization required.
        }
    }
}
