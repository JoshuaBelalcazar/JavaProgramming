package datatypes.Enum;

/*
Exercise 58:
Write a Java program to implement an enum called "Shape" with constants representing different geometric shapes.
*/

public class Exercise58 {
    // Define the enum Shape with various geometric shapes
    public enum Shape {
        SQUARE,
        CIRCLE,
        RECTANGLE,
        TRIANGLE,
        HEXAGON
    }

    public static void main(String[] args) {
        // Create enum variables for demonstration
        Shape shape1 = Shape.CIRCLE;
        Shape shape2 = Shape.SQUARE;

        // Print the selected shapes
        System.out.println("First shape: " + shape1);
        System.out.println("Second shape: " + shape2);
    }
}
