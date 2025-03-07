package javaoop.inheritance;

/*
Exercise 115:
Write a Java program to create a class called Vehicle with a method called drive().
Create a subclass called Car that overrides the drive() method to print "Repairing a car".
In the main method, create an instance of Vehicle and an instance of Car, and call the drive() method on both.

Expected Output:
Repairing a vehicle
Repairing a car
*/

public class Exercise115 {
    public static void main(String[] args) {
        // Create an instance of Vehicle
        Vehicle vehicle = new Vehicle();
        // Create an instance of Car (which extends Vehicle)
        Car car = new Car();

        // Call the drive() method on both instances
        vehicle.drive();
        car.drive();
    }

    // Private static inner class Vehicle to avoid conflicts
    private static class Vehicle {
        // Method drive prints a message for a generic vehicle
        public void drive() {
            System.out.println("Repairing a vehicle");
        }
    }

    // Private static inner class Car that extends Vehicle
    private static class Car extends Vehicle {
        // Overriding drive method to print a message specific to a car
        @Override
        public void drive() {
            System.out.println("Repairing a car");
        }
    }
}

