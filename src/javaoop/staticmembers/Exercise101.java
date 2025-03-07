package javaoop.staticmembers;

/*
Exercise 101:
Write a Java program to create a class called "ComplexInitializer" with a static block that initializes multiple static variables (x, y, z) using complex logic.
Print the values of these variables in the main method.

Expected Output:
Value of x: 10
Value of y: 20
Value of z: 190
*/

public class Exercise101 {
    public static void main(String[] args) {
        // Access the static variables from ComplexInitializer
        System.out.println("Value of x: " + ComplexInitializer.getX());
        System.out.println("Value of y: " + ComplexInitializer.getY());
        System.out.println("Value of z: " + ComplexInitializer.getZ());
    }

    // Private static inner class ComplexInitializer to avoid conflicts
    private static class ComplexInitializer {
        // Private static variables
        private static int x;
        private static int y;
        private static int z;

        // Static block to initialize the static variables using complex logic
        static {
            x = 10;
            y = 20;
            z = calculateZ(x, y);
        }

        // Private static method to calculate z using a formula: z = (x * y) + (x - y)
        private static int calculateZ(int a, int b) {
            return a * b + (a - b);
        }

        // Public getters for x, y, and z
        public static int getX() {
            return x;
        }

        public static int getY() {
            return y;
        }

        public static int getZ() {
            return z;
        }
    }
}
