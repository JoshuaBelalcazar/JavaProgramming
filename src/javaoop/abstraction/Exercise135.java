package javaoop.abstraction;

/*
Exercise 135:
Write a Java program to create an abstract class Shape2D with abstract methods draw() and resize().
Create subclasses Rectangle and Circle that extend the Shape2D class and implement the respective methods to draw and resize each shape.

Expected Output:
Rectangle: Drawing a rectangle.
Rectangle: Resizing the rectangle.
Circle: Drawing a circle.
Circle: Resizing the circle.
*/

public class Exercise135 {
    public static void main(String[] args) {
        // Create an instance of Rectangle and assign it to a Shape2D reference
        Shape2D rectangle = new Rectangle();
        // Create an instance of Circle and assign it to a Shape2D reference
        Shape2D circle = new Circle();

        // Call the draw and resize methods on the rectangle object
        rectangle.draw();
        rectangle.resize();

        // Call the draw and resize methods on the circle object
        circle.draw();
        circle.resize();
    }

    // Private static abstract inner class Shape2D to avoid conflicts
    private static abstract class Shape2D {
        // Abstract method to draw the shape
        public abstract void draw();

        // Abstract method to resize the shape
        public abstract void resize();
    }

    // Private static inner class Rectangle that extends Shape2D
    private static class Rectangle extends Shape2D {
        @Override
        public void draw() {
            System.out.println("Rectangle: Drawing a rectangle.");
        }

        @Override
        public void resize() {
            System.out.println("Rectangle: Resizing the rectangle.");
        }
    }

    // Private static inner class Circle that extends Shape2D
    private static class Circle extends Shape2D {
        @Override
        public void draw() {
            System.out.println("Circle: Drawing a circle.");
        }

        @Override
        public void resize() {
            System.out.println("Circle: Resizing the circle.");
        }
    }
}
