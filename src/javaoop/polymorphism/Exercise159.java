package javaoop.polymorphism;

// Exercise159.java

// Define the abstract Vehicle class
abstract class Vehicle {
    public abstract void startEngine();  // Abstract method to start the engine

    public abstract void stopEngine();  // Abstract method to stop the engine
}

// Define the Car class that extends Vehicle
class Car extends Vehicle {
    @Override
    public void startEngine() {  // Override the startEngine method
        System.out.println("Car engine started with a key.");
    }

    @Override
    public void stopEngine() {  // Override the stopEngine method
        System.out.println("Car engine stopped when the key was turned off.");
    }
}

// Define the Motorcycle class that extends Vehicle
class Motorcycle extends Vehicle {
    @Override
    public void startEngine() {  // Override the startEngine method
        System.out.println("Motorcycle engine started with a kick-start.");
    }

    @Override
    public void stopEngine() {  // Override the stopEngine method
        System.out.println("Motorcycle engine stopped when ignition was turned off.");
    }
}

// Define the Main class
public class Exercise159 {
    public static void main(String[] args) {
        Vehicle car = new Car();  // Create a Vehicle reference to a Car object
        Vehicle motorcycle = new Motorcycle();  // Create a Vehicle reference to a Motorcycle object

        startAndStopEngine(car);  // Start and stop the engine for the car
        startAndStopEngine(motorcycle);  // Start and stop the engine for the motorcycle
    }

    // Method to start and stop the engine of a given vehicle
    public static void startAndStopEngine(Vehicle vehicle) {
        vehicle.startEngine();
        vehicle.stopEngine();
    }
}

