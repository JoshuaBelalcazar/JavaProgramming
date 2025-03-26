package javaoop.abstraction;

/*
Exercise 130:
Write a Java program to create an abstract class Vehicle with abstract methods startEngine() and stopEngine().
Create subclasses Car and Motorcycle that extend the Vehicle class and implement the respective methods to start and stop the engines for each vehicle type.

Expected Output:
Car: Starting the engine...
Car: Stopping the engine...
Motorcycle: Starting the engine...
Motorcycle: Stopping the engine...
*/

public class Exercise130 {
    public static void main(String[] args) {
        // Create an instance of Car as a Vehicle
        Vehicle car = new Car();
        // Create an instance of Motorcycle as a Vehicle
        Vehicle motorcycle = new Motorcycle();

        // Start and stop engine for Car
        car.startEngine();
        car.stopEngine();

        // Start and stop engine for Motorcycle
        motorcycle.startEngine();
        motorcycle.stopEngine();
    }

    // Private static abstract class Vehicle to avoid conflicts
    private static abstract class Vehicle {
        // Abstract method to start the engine
        public abstract void startEngine();

        // Abstract method to stop the engine
        public abstract void stopEngine();
    }

    // Private static inner class Car that extends Vehicle
    private static class Car extends Vehicle {
        @Override
        public void startEngine() {
            System.out.println("Car: Starting the engine...");
        }

        @Override
        public void stopEngine() {
            System.out.println("Car: Stopping the engine...");
        }
    }

    // Private static inner class Motorcycle that extends Vehicle
    private static class Motorcycle extends Vehicle {
        @Override
        public void startEngine() {
            System.out.println("Motorcycle: Starting the engine...");
        }

        @Override
        public void stopEngine() {
            System.out.println("Motorcycle: Stopping the engine...");
        }
    }
}
