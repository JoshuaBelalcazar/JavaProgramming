package javaoop.encapsulation;

/*
Exercise 145:
Write a Java program to create a class called Circle with a private instance variable radius.
Provide public getter and setter methods to access and modify the radius variable.
However, provide two methods called calculateArea() and calculatePerimeter() that return the calculated area and perimeter based on the current radius value.

Expected Output:
Circle Radius: 7.0
Circle Area: 153.93804002589985
Circle Perimeter: 43.982297150257104
*/

// Circle.java

// Circle Class
class Circle {
    // Declare a private double variable for radius
    private double radius;

    // Getter method for radius
    public double getRadius() {
        return radius;
    }

    // Setter method for radius
    public void setRadius(double radius) {
        this.radius = radius;
    }

    // Method to calculate the area of the circle
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    // Method to calculate the perimeter (circumference) of the circle
    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }
}

// Exercise145.java
// This class contains the main method for the exercise
public class Exercise145 {
    public static void main(String[] args) {
        // Create an instance of Circle
        Circle circle = new Circle();

        // Set the radius using the setter method
        circle.setRadius(7.0);

        // Get the radius using the getter method
        double radius = circle.getRadius();

        // Calculate and print the area and perimeter
        double area = circle.calculateArea();
        double perimeter = circle.calculatePerimeter();

        System.out.println("Circle Radius: " + radius);
        System.out.println("Circle Area: " + area);
        System.out.println("Circle Perimeter: " + perimeter);
    }
}

