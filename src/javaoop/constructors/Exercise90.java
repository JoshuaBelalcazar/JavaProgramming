package javaoop.constructors;
/*
Exercise 90:
Write a Java program to create a class called Rectangle with instance variables length and width.
Implement a parameterized constructor and a copy constructor that initializes a new object using the values of an existing object.
Print the values of the variables.

Expected Output:
Rectangle 1 Length: 12.5
Rectangle 1 Width: 4.5
Rectangle 2 Length: 12.5
Rectangle 2 Width: 4.5
*/

public class Exercise90 {
    public static void main(String[] args) {
        // Create a new Rectangle object using the parameterized constructor
        Rectangle rect1 = new Rectangle(12.5, 4.5);
        System.out.println("Rectangle 1 Length: " + rect1.getLength());
        System.out.println("Rectangle 1 Width: " + rect1.getWidth());

        // Create a new Rectangle object using the copy constructor
        Rectangle rect2 = new Rectangle(rect1);
        System.out.println("Rectangle 2 Length: " + rect2.getLength());
        System.out.println("Rectangle 2 Width: " + rect2.getWidth());
    }

    // Private static inner class Rectangle to avoid conflicts
    private static class Rectangle {
        // Private instance variables
        private final double length;
        private final double width;

        // Parameterized constructor to initialize length and width
        public Rectangle(double length, double width) {
            this.length = length;
            this.width = width;
        }

        // Copy constructor that initializes a new Rectangle using an existing Rectangle
        public Rectangle(Rectangle rectangle) {
            this.length = rectangle.length;
            this.width = rectangle.width;
        }

        // Getter for length
        public double getLength() {
            return length;
        }

        // Getter for width
        public double getWidth() {
            return width;
        }
    }
}
