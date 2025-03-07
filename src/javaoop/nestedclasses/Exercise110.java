package javaoop.nestedclasses;

/*
Exercise 110:
Write a Java program to create a class called "House" with a method calculateArea().
Inside this method, define a local class Room with a method getArea() that calculates and returns the area of the room (length * width).
Instantiate the Room class and call the getArea() method from within calculateArea().

Expected Output:
Area of the room: 87.5
*/

public class Exercise110 {
    public static void main(String[] args) {
        // Create an instance of House and call its calculateArea() method
        House myHouse = new House();
        myHouse.calculateArea();
    }

    // Private static inner class House to avoid conflicts
    private static class House {
        // Method calculateArea to calculate and print the area of a room
        public void calculateArea() {
            // Local variables for the dimensions of the room
            final double length = 12.5;
            final double width = 7.0;

            // Local class Room defined within calculateArea()
            class Room {
                // Method getArea calculates the area of the room
                public double getArea() {
                    return length * width;
                }
            }

            // Instantiate the local class Room and call its getArea() method
            Room room = new Room();
            double area = room.getArea();
            System.out.println("Area of the room: " + area);
        }
    }
}
