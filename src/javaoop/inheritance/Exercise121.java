package javaoop.inheritance;

/*
Exercise 116:
Write a Java program to create a class called Shape with methods called getPerimeter() and getArea().
Create a subclass called Circle that overrides the getPerimeter() and getArea() methods to calculate the area and perimeter of a circle.
Demonstrate the functionality by creating Circle objects and printing their details.

Expected Output:
Radius of the circle=8.0
Perimeter: 50.26548245743669
Area: 201.06192982974676

Radius of the circle=3.2
Perimeter: 20.106192982974676
Area: 32.169908772759484
*/

public class Exercise121 {
    public static void main(String[] args) {
        // Create a Circle object with radius 8.0
        double r = 8.0;
        Circle c1 = new Circle(r);
        System.out.println("Radius of the circle=" + r);
        System.out.println("Perimeter: " + c1.getPerimeter());
        System.out.println("Area: " + c1.getArea());

        // Create a Circle object with radius 3.2
        r = 3.2;
        Circle c2 = new Circle(r);
        System.out.println("\nRadius of the circle=" + r);
        System.out.println("Perimeter: " + c2.getPerimeter());
        System.out.println("Area: " + c2.getArea());
    }

    // Private static inner class Shape to avoid conflicts
    private static class Shape {
        // Method to get the perimeter; default implementation returns 0.0
        public double getPerimeter() {
            return 0.0;
        }

        // Method to get the area; default implementation returns 0.0
        public double getArea() {
            return 0.0;
        }
    }

    // Private static inner class Circle that extends Shape
    private static class Circle extends Shape {
        private final double radius;

        // Constructor to initialize the radius
        public Circle(double radius) {
            this.radius = radius;
        }

        // Override the getPerimeter method to calculate the perimeter of the circle
        @Override
        public double getPerimeter() {
            return 2 * Math.PI * radius;
        }

        // Override the getArea method to calculate the area of the circle
        @Override
        public double getArea() {
            return Math.PI * radius * radius;
        }
    }
}

