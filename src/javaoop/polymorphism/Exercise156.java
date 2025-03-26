package javaoop.polymorphism;

// Exercise156.java

// Base class Shape
abstract class Shape {
    public abstract double getArea();

    public abstract double getPerimeter();
}

// Subclass Circle
class Circle extends Shape {
    private final double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }
}

// Subclass Rectangle
class Rectangle extends Shape {
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

    @Override
    public double getPerimeter() {
        return 2 * (length + width);
    }
}

// Subclass Triangle
class Triangle extends Shape {
    private final double side1;
    private final double side2;
    private final double side3;

    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    @Override
    public double getArea() {
        double s = (side1 + side2 + side3) / 2;
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }

    @Override
    public double getPerimeter() {
        return side1 + side2 + side3;
    }
}

// Main class
public class Exercise156 {
    public static void main(String[] args) {
        double r = 4.0;
        Circle circle = new Circle(r);

        double rs1 = 4.0, rs2 = 6.0;
        double ts1 = 3.0, ts2 = 4.0, ts3 = 5.0;

        Rectangle rectangle = new Rectangle(rs1, rs2);
        Triangle triangle = new Triangle(ts1, ts2, ts3);

        System.out.println("Radius of the Circle: " + r);
        System.out.println("Area of the Circle: " + circle.getArea());
        System.out.println("Perimeter of the Circle: " + circle.getPerimeter());

        System.out.println("\nSides of the Rectangle are: " + rs1 + ',' + rs2);
        System.out.println("Area of the Rectangle: " + rectangle.getArea());
        System.out.println("Perimeter of the Rectangle: " + rectangle.getPerimeter());

        System.out.println("\nSides of the Triangle are: " + ts1 + ',' + ts2 + ',' + ts3);
        System.out.println("Area of the Triangle: " + triangle.getArea());
        System.out.println("Perimeter of the Triangle: " + triangle.getPerimeter());
    }
}

