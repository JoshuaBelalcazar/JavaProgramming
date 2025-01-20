package javabasics;

public class Exercise6 {
    private static final double RADIUS_VAL = 7.5;
    public static void main(String[] args) {
        /*
        Exercise 6:
        Write a Java program to print the area and perimeter of a circle.
        Test Data:
        Radius = 7.5
        Expected Output
        Perimeter is = 47.12388980384689
        Area is = 176.71458676442586
         */

        // Define a fixed radius
        // Compute perimeter using the fixed radius
        double circlePerimeter = 2 * Math.PI * RADIUS_VAL;

        // Compute area using the fixed radius
        double circleArea = Math.PI * (RADIUS_VAL * RADIUS_VAL);

        // Display perimeter and area results
        System.out.println("Perimeter is = " + circlePerimeter);
        System.out.println("Area is = " + circleArea);
    }
}