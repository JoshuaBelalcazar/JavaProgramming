package javaoop.encapsulation;

/*
Exercise 143:
Write a Java program to create a class called Rectangle with private instance variables length and width.
Provide public getter and setter methods to access and modify these variables.

Expected Output:
Length: 6.7
Width: 12.0
Area: 80.4
Perimeter: 37.4
*/

// Rectangle.java
// Rectangle Class
class Rectangle {
    // Private instance variables for length and width
    private double length;
    private double width;

    // Constructor to initialize length and width
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    // Getter method for length
    public double getLength() {
        return length;
    }

    // Setter method for length
    public void setLength(double length) {
        this.length = length;
    }

    // Getter method for width
    public double getWidth() {
        return width;
    }

    // Setter method for width
    public void setWidth(double width) {
        this.width = width;
    }

    // Method to calculate area
    public double getArea() {
        return length * width;
    }

    // Method to calculate perimeter
    public double getPerimeter() {
        return 2 * (length + width);
    }

    // Method to display rectangle details
    public void displayDetails() {
        System.out.println("Length: " + length);
        System.out.println("Width: " + width);
        System.out.println("Area: " + getArea());
        System.out.println("Perimeter: " + getPerimeter());
    }
}

// Exercise143.java
// This class contains the main method for the exercise
public class Exercise143 {
    public static void main(String[] args) {
        // Create a Rectangle instance with initial length and width
        Rectangle rectangle = new Rectangle(6.7, 12.0);

        // Display initial details of the rectangle
        rectangle.displayDetails();

        System.out.println("\nUpdating Rectangle dimensions...");

        // Update rectangle dimensions using setter methods
        rectangle.setLength(10.5);
        rectangle.setWidth(15.3);

        // Display updated details of the rectangle
        rectangle.displayDetails();
    }
}

