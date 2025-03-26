package javaoop.abstraction;

/*
Exercise 129:
Write a Java program to create an abstract class Shape with abstract methods calculateArea() and calculatePerimeter().
Create subclasses Circle and Triangle that extend the Shape class and implement the respective methods to calculate the area
and perimeter of each shape.

Expected Output:
Radius of the Circle: 4.0
Area of the Circle: 50.26548245743669
Perimeter of the Circle: 25.132741228718345

Sides of the Triangle are: 3.0, 4.0, 5.0
Area of the Triangle: 6.0
Perimeter of the Triangle: 12.0
*/

public class Exercise129 {
    public static void main(String[] args) {
        // Create a Circle object with radius 4.0
        Circle circle = new Circle(4.0);
        System.out.println("Radius of the Circle: " + 4.0);
        System.out.println("Area of the Circle: " + circle.calculateArea());
        System.out.println("Perimeter of the Circle: " + circle.calculatePerimeter());

        System.out.println();

        // Create a Triangle object with sides 3.0, 4.0, and 5.0
        Triangle triangle = new Triangle(3.0, 4.0, 5.0);
        System.out.println("Sides of the Triangle are: 3.0, 4.0, 5.0");
        System.out.println("Area of the Triangle: " + triangle.calculateArea());
        System.out.println("Perimeter of the Triangle: " + triangle.calculatePerimeter());
    }

    // Private static abstract class Shape to avoid conflicts
    private static abstract class Shape {
        // Abstract method to calculate area
        public abstract double calculateArea();

        // Abstract method to calculate perimeter
        public abstract double calculatePerimeter();
    }

    // Private static inner class Circle that extends Shape
    private static class Circle extends Shape {
        private final double radius;

        public Circle(double radius) {
            this.radius = radius;
        }

        // Calculate area using π * r^2
        @Override
        public double calculateArea() {
            return Math.PI * radius * radius;
        }

        // Calculate perimeter using 2 * π * r
        @Override
        public double calculatePerimeter() {
            return 2 * Math.PI * radius;
        }
    }

    // Private static inner class Triangle that extends Shape
    private static class Triangle extends Shape {
        private final double side1;
        private final double side2;
        private final double side3;

        public Triangle(double side1, double side2, double side3) {
            this.side1 = side1;
            this.side2 = side2;
            this.side3 = side3;
        }

        // Calculate area using Heron's formula
        @Override
        public double calculateArea() {
            double s = (side1 + side2 + side3) / 2;
            return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
        }

        // Calculate perimeter by summing up the sides
        @Override
        public double calculatePerimeter() {
            return side1 + side2 + side3;
        }
    }
}
