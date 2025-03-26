package javaoop.abstraction;/*
Exercise 133:
Write a Java program to create an abstract class GeometricShape with abstract methods area() and perimeter().
Create subclasses Triangle and Square that extend the GeometricShape class and implement the respective methods to calculate
the area and perimeter of each shape.

Expected Output:
Triangle Area: 9.921567416492215
Triangle Perimeter: 15.0
Square Area: 36.0
Square Perimeter: 24.0
*/

public class Exercise134 {
    public static void main(String[] args) {
        // Create a Triangle object with sides 4, 5, and 6
        GeometricShape triangle = new Triangle(4, 5, 6);
        // Create a Square object with side length 6
        GeometricShape square = new Square(6);

        // Print area and perimeter for the Triangle
        System.out.println("Triangle Area: " + triangle.area());
        System.out.println("Triangle Perimeter: " + triangle.perimeter());
        System.out.println();

        // Print area and perimeter for the Square
        System.out.println("Square Area: " + square.area());
        System.out.println("Square Perimeter: " + square.perimeter());
    }

    // Private static abstract class GeometricShape to avoid conflicts
    private static abstract class GeometricShape {
        // Abstract method to calculate the area of the shape
        public abstract double area();

        // Abstract method to calculate the perimeter of the shape
        public abstract double perimeter();
    }

    // Private static inner class Triangle that extends GeometricShape
    private static class Triangle extends GeometricShape {
        private final double side1;
        private final double side2;
        private final double side3;

        // Constructor to initialize the sides of the triangle
        public Triangle(double side1, double side2, double side3) {
            this.side1 = side1;
            this.side2 = side2;
            this.side3 = side3;
        }

        // Calculate the area of the triangle using Heron's formula
        @Override
        public double area() {
            double s = (side1 + side2 + side3) / 2;
            return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
        }

        // Calculate the perimeter of the triangle
        @Override
        public double perimeter() {
            return side1 + side2 + side3;
        }
    }

    // Private static inner class Square that extends GeometricShape
    private static class Square extends GeometricShape {
        private final double side;

        // Constructor to initialize the side of the square
        public Square(double side) {
            this.side = side;
        }

        // Calculate the area of the square
        @Override
        public double area() {
            return side * side;
        }

        // Calculate the perimeter of the square
        @Override
        public double perimeter() {
            return 4 * side;
        }
    }
}
