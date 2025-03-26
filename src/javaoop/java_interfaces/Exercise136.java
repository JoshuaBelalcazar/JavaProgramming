package javaoop.java_interfaces;

/*
Exercise 136:
Write a Java program to create an interface Shape with the getArea() method.
Create three classes Rectangle, Circle, and Triangle that implement the Shape interface.
Implement the getArea() method for each of the three classes.

Expected Output:
Area of the Rectangle: 120.0
Area of the Circle: 28.274333882308138
Area of the Triangle: 12.0
*/

public class Exercise136 {
    public static void main(String[] args) {
        // Create a Rectangle object with length 10 and width 12
        Rectangle rectangle = new Rectangle(10, 12);
        // Create a Circle object with radius 3
        Circle circle = new Circle(3);
        // Create a Triangle object with base 4 and height 6
        Triangle triangle = new Triangle(4, 6);

        // Print the area of each shape
        System.out.println("Area of the Rectangle: " + rectangle.getArea());
        System.out.println("Area of the Circle: " + circle.getArea());
        System.out.println("Area of the Triangle: " + triangle.getArea());
    }

    // Private static interface Shape to avoid conflicts
    private interface Shape {
        double getArea();
    }

    // Private static inner class Rectangle that implements Shape
    private static class Rectangle implements Shape {
        private final double length;
        private final double width;

        public Rectangle(double length, double width) {
            this.length = length;
            this.width = width;
        }

        @Override
        public double getArea() {
            return length * width;
        }
    }

    // Private static inner class Circle that implements Shape
    private static class Circle implements Shape {
        private final double radius;

        public Circle(double radius) {
            this.radius = radius;
        }

        @Override
        public double getArea() {
            return Math.PI * radius * radius;
        }
    }

    // Private static inner class Triangle that implements Shape
    private static class Triangle implements Shape {
        private final double base;
        private final double height;

        public Triangle(double base, double height) {
            this.base = base;
            this.height = height;
        }

        @Override
        public double getArea() {
            return 0.5 * base * height;
        }
    }
}
