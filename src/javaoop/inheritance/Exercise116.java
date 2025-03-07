package javaoop.inheritance;

/*
Exercise 116:
Write a Java program to create a class called "Shape" with a method called getArea().
Create a subclass called "Rectangle" that overrides the getArea() method to calculate the area of a rectangle.
Print the area of the rectangle.

Expected Output:
The area of the rectangle is: 30.0
*/

public class Exercise116 {
    public static void main(String[] args) {
        // Create an instance of Rectangle with length 3.0 and width 10.0
        Rectangle rectangle = new Rectangle(3.0, 10.0);
        // Calculate the area using the getArea() method
        double area = rectangle.getArea();
        // Print the area of the rectangle
        System.out.println("The area of the rectangle is: " + area);
    }

    // Private static inner class Shape to avoid conflicts
    private static class Shape {
        // Method getArea returns 0.0 as default
        public double getArea() {
            return 0.0;
        }
    }

    // Private static inner class Rectangle that extends Shape
    private static class Rectangle extends Shape {
        private final double length;
        private final double width;

        // Parameterized constructor to initialize length and width
        public Rectangle(double length, double width) {
            this.length = length;
            this.width = width;
        }

        // Override the getArea() method to calculate the area of a rectangle
        @Override
        public double getArea() {
            return length * width;
        }
    }
}
