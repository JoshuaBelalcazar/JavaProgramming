package javaoop.polymorphism;

// Exercise153.java

// Base class Shape
public class Shape {
    // Method to calculate the area of the shape
    // Default implementation returns 0
    public double calculateArea() {
        return 0;
    }
}

// Subclass Circle
class Circle extends Shape {

    // Declare a private double variable radius
    private final double radius;

    // Constructor for Circle class that takes radius as a parameter
    public Circle(double radius) {
        this.radius = radius;
    }

    // Override the calculateArea method from the Shape class
    @Override
    public double calculateArea() {
        // Calculate and return the area of the circle using the formula πr²
        return Math.PI * radius * radius;
    }
}

// Subclass Rectangle
class Rectangle extends Shape {

    // Declare private double variables width and height
    private final double width;
    private final double height;

    // Constructor for Rectangle class that takes width and height as parameters
    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    // Override the calculateArea method from the Shape class
    @Override
    public double calculateArea() {
        // Calculate and return the area of the rectangle using the formula width * height
        return width * height;
    }
}

// Subclass Triangle
class Triangle extends Shape {

    // Declare private double variables base and height
    private final double base;
    private final double height;

    // Constructor for Triangle class that takes base and height as parameters
    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    // Override the calculateArea method from the Shape class
    @Override
    public double calculateArea() {
        // Calculate and return the area of the triangle using the formula 0.5 * base * height
        return 0.5 * base * height;
    }
}

// Main class
public class Exercise153 {

    // Main method that serves as the entry point for the application
    public static void main(String[] args) {

        // Create a Circle object with radius 4
        Circle circle = new Circle(4);
        // Print the area of the Circle object
        System.out.println("Area of Circle: " + circle.calculateArea());

        // Create a Rectangle object with width 12 and height 34
        Rectangle rectangle = new Rectangle(12, 34);
        // Print the area of the Rectangle object
        System.out.println("\nArea of Rectangle: " + rectangle.calculateArea());

        // Create a Triangle object with base 5 and height 9
        Triangle triangle = new Triangle(5, 9);
        // Print the area of the Triangle object
        System.out.println("\nArea of Triangle: " + triangle.calculateArea());
    }
}

