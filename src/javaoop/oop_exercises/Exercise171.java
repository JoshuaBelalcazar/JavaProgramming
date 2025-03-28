package javaoop.oop_exercises;

/*
Exercise 171:
Write a Java program to create a class called "Vehicle" with attributes for make, model, and year.
Create subclasses "Car" and "Truck" that add specific attributes like trunk size for cars and payload capacity for trucks.
Implement a method to display vehicle details in each subclass.
*/

// Exercise171.java

// Define the Vehicle class
class Vehicle {

    private String make;
    private String model;
    private int year;

    // Constructor to initialize Vehicle object
    public Vehicle(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    // Method to display vehicle details
    public void displayDetails() {
        System.out.println("\nVehicle Details:");
        System.out.println("Make: " + make);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
    }

    // Getter method for make
    public String getMake() {
        return make;
    }

    // Getter method for model
    public String getModel() {
        return model;
    }

    // Getter method for year
    public int getYear() {
        return year;
    }
}

// Define the Car subclass that extends Vehicle
class Car extends Vehicle {

    private double trunkSize;

    // Constructor to initialize Car object
    public Car(String make, String model, int year, double trunkSize) {
        super(make, model, year); // Call the constructor of the superclass
        this.trunkSize = trunkSize;
    }

    // Override the displayDetails method to include trunk size
    @Override
    public void displayDetails() {
        super.displayDetails(); // Call the superclass method
        System.out.println("Trunk Size: " + trunkSize + " cubic feet");
    }

    // Getter method for trunk size
    public double getTrunkSize() {
        return trunkSize;
    }

    // Setter method for trunk size
    public void setTrunkSize(double trunkSize) {
        if (trunkSize > 0) {
            this.trunkSize = trunkSize;
        } else {
            System.out.println("Trunk size must be positive.");
        }
    }
}

// Define the Truck subclass that extends Vehicle
class Truck extends Vehicle {

    private double payloadCapacity;

    // Constructor to initialize Truck object
    public Truck(String make, String model, int year, double payloadCapacity) {
        super(make, model, year); // Call the constructor of the superclass
        this.payloadCapacity = payloadCapacity;
    }

    // Override the displayDetails method to include payload capacity
    @Override
    public void displayDetails() {
        super.displayDetails(); // Call the superclass method
        System.out.println("Payload Capacity: " + payloadCapacity + " tons");
    }

    // Getter method for payload capacity
    public double getPayloadCapacity() {
        return payloadCapacity;
    }

    // Setter method for payload capacity
    public void setPayloadCapacity(double payloadCapacity) {
        if (payloadCapacity > 0) {
            this.payloadCapacity = payloadCapacity;
        } else {
            System.out.println("Payload capacity must be positive.");
        }
    }
}

// Define the Main class
public class Exercise171 {
    public static void main(String[] args) {

        // Create a Car object
        Car car = new Car("Suzuki", "Swift", 2015, 15.1);
        car.displayDetails(); // Display car details

        // Create a Truck object
        Truck truck = new Truck("Ford", "F-150", 2016, 3.5);
        truck.displayDetails(); // Display truck details
    }
}

