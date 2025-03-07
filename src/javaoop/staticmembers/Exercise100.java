package javaoop.staticmembers;

/*
Exercise 100:
Write a Java program to create a class called "IDGenerator" with a static variable 'nextID' and a static method "generateID()"
that returns the next ID and increments 'nextID'. Demonstrate the usage of generateID in the main method.

Expected Output:
Generated ID: 1
Generated ID: 2
Generated ID: 3
*/

public class Exercise100 {
    public static void main(String[] args) {
        // Generate and print IDs using the static method from IDGenerator
        System.out.println("Generated ID: " + IDGenerator.generateID());
        System.out.println("Generated ID: " + IDGenerator.generateID());
        System.out.println("Generated ID: " + IDGenerator.generateID());
    }

    // Private static inner class IDGenerator to prevent conflicts
    private static class IDGenerator {
        // Static variable to hold the next ID value
        private static int nextID = 1;

        // Static method to generate the next ID and increment nextID
        public static int generateID() {
            return nextID++;
        }
    }
}
