package javaoop.constructors;
/*
Exercise 93:
Write a Java program to create a class called Point with instance variables x and y.
Implement overloaded constructors:
    - One constructor takes int parameters.
    - Another constructor takes double parameters.
Print the values of the variables for each constructor.

Expected Output:
Point (x, y): (4, 5)
Point (x, y): (4, 5)
*/

public class Exercise93 {
    public static void main(String[] args) {
        // Create a Point object using the int constructor
        Point point1 = new Point(4, 5);
        point1.printPoint();

        // Create a Point object using the double constructor
        Point point2 = new Point(4.5, 5.5);
        point2.printPoint();
    }

    // Private static inner class Point to avoid conflicts
    private static class Point {
        // Private instance variables
        private int x;
        private int y;

        // Constructor that takes int parameters
        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }

        // Constructor that takes double parameters, casting them to int
        public Point(double x, double y) {
            this.x = (int) x;
            this.y = (int) y;
        }

        // Method to print the values of x and y
        public void printPoint() {
            System.out.println("Point (x, y): (" + x + ", " + y + ")");
        }
    }
}
