package javaoop.staticmembers;

/*
Exercise 98:
Write a Java program to create a class called Constants with a static final variable 'PI' initialized to 3.14159.
Create a method to calculate the area of a circle given its radius, using the 'PI' constant.
Demonstrate the method in the main method.

Expected Output:
Radius: 5.0
Area: 78.53975
*/

public class Exercise98 {
    public static void main(String[] args) {
        // Define a radius
        double radius = 5.0;
        // Calculate the area of the circle using the static method from Constants
        double area = Constants.calculateArea(radius);

        // Print the radius and the calculated area
        System.out.println("Radius: " + radius);
        System.out.println("Area: " + area);
    }

    // Private static inner class Constants to avoid conflicts
    private static class Constants {
        // Declare a static final variable PI initialized to 3.14159
        public static final double PI = 3.14159;

        // Static method to calculate the area of a circle given its radius
        public static double calculateArea(double radius) {
            return PI * radius * radius;
        }
    }
}
