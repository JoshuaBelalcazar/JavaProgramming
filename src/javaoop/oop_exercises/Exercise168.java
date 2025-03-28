package javaoop.oop_exercises;

/*
Exercise 168:
Write a Java program to create a class called "Shape" with abstract methods for calculating area and perimeter, and subclasses for "Rectangle", "Circle", and "Triangle".
*/

// Exercise168.java

// Define the Shape class as an abstract class
abstract class Shape {

    // Abstract method to get the area of the shape
    public abstract double getArea();

    // Abstract method to get the perimeter of the shape
    public abstract double getPerimeter();
}

// Define the Rectangle class, which extends the Shape class
class Rectangle extends Shape {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double getArea() {
        return length * width;
    }

    @Override
    public double getPerimeter() {
        return 2 * (length + width);
    }
}

// Define the Circle class, which extends the Shape class
class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }
}

// Define the Triangle class, which extends the Shape class
class Triangle extends Shape {
    private double side1;
    private double side2;
    private double side3;

    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    @Override
    public double getArea() {
        double s = (side1 + side2 + side3) / 2;
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }

    @Override
    public double getPerimeter() {
        return side1 + side2 + side3;
    }
}

// Define the Exercise168 class
public class Exercise168 {

    public static void main(String[] args) {

        // Create a rectangle shape with length 10 and width 12
        Shape rectangle = new Rectangle(10, 12);

        // Create a circle shape with radius 5
        Shape circle = new Circle(5);

        // Create a triangle shape with sides 7, 8, and 6
        Shape triangle = new Triangle(7, 8, 6);

        System.out.println("Area and perimeter of various shapes:");

        // Rectangle calculations
        System.out.println("\nRectangle: Length-10, Width-12");
        System.out.println("Area: " + rectangle.getArea());
        System.out.println("Perimeter: " + rectangle.getPerimeter());

        // Circle calculations
        System.out.println("\nCircle: Radius-5");
        System.out.println("Area: " + circle.getArea());
        System.out.println("Perimeter: " + circle.getPerimeter());

        // Triangle calculations
        System.out.println("\nTriangle: Side1-7, Side2-8, Side3-6");
        System.out.println("Area: " + triangle.getArea());
        System.out.println("Perimeter: " + triangle.getPerimeter());
    }
}

