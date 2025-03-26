package javaoop.abstraction;

/*
Exercise 125:
Write a Java program to create an abstract class Shape3D with abstract methods calculateVolume() and calculateSurfaceArea().
Create subclasses Sphere and Cube that extend the Shape3D class and implement the respective methods to calculate the volume and surface area of each shape.

Expected Output:
Sphere Volume: 1436.7550402417319
Sphere Surface Area: 615.7521601035994
Cube Volume: 216.0
Cube Surface Area: 216.0
*/

public class Exercise125 {
    public static void main(String[] args) {
        // Create an instance of Sphere with radius 7.0
        Shape3D sphere = new Sphere(7.0);
        // Create an instance of Cube with side length 6.0
        Shape3D cube = new Cube(6.0);

        // Print the volume and surface area of the sphere
        System.out.println("Sphere Volume: " + sphere.calculateVolume());
        System.out.println("Sphere Surface Area: " + sphere.calculateSurfaceArea());
        System.out.println();

        // Print the volume and surface area of the cube
        System.out.println("Cube Volume: " + cube.calculateVolume());
        System.out.println("Cube Surface Area: " + cube.calculateSurfaceArea());
    }

    // Private static abstract inner class Shape3D to avoid conflicts
    private static abstract class Shape3D {
        // Abstract method to calculate the volume of the shape
        public abstract double calculateVolume();

        // Abstract method to calculate the surface area of the shape
        public abstract double calculateSurfaceArea();
    }

    // Private static inner class Sphere that extends Shape3D
    private static class Sphere extends Shape3D {
        private final double radius;

        // Constructor to initialize the radius
        public Sphere(double radius) {
            this.radius = radius;
        }

        // Calculate the volume of the sphere using the formula (4/3) * π * radius^3
        @Override
        public double calculateVolume() {
            return (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
        }

        // Calculate the surface area of the sphere using the formula 4 * π * radius^2
        @Override
        public double calculateSurfaceArea() {
            return 4 * Math.PI * Math.pow(radius, 2);
        }
    }

    // Private static inner class Cube that extends Shape3D
    private static class Cube extends Shape3D {
        private final double sideLength;

        // Constructor to initialize the side length
        public Cube(double sideLength) {
            this.sideLength = sideLength;
        }

        // Calculate the volume of the cube using the formula sideLength^3
        @Override
        public double calculateVolume() {
            return Math.pow(sideLength, 3);
        }

        // Calculate the surface area of the cube using the formula 6 * sideLength^2
        @Override
        public double calculateSurfaceArea() {
            return 6 * Math.pow(sideLength, 2);
        }
    }
}
