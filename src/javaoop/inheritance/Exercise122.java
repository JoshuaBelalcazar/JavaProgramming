package javaoop.inheritance;

/*
Exercise 121:
Write a Java program to create a vehicle class hierarchy. The base class should be Vehicle, with subclasses Truck, Car and Motorcycle.
Each subclass should have properties such as make, model, year, and fuel type. Implement methods for calculating fuel efficiency,
distance traveled, and maximum speed.

Expected Output:

Truck Model: Tatra 810 4x4
Fuel Efficiency: 8.075659532105526 mpg
Distance Traveled: 65.50975012444003 miles
Max Speed: 80.0 mph

Car Model: Virtus
Fuel Efficiency: 2.355 mpg
Distance Traveled: 14.419665 miles
Max Speed: 120.0 mph

Motorcycle Model: Warrior200
Fuel Efficiency: 2.1 mpg
Distance Traveled: 4.41 miles
Max Speed: 80.0 mph
*/

public class Exercise122 {
    public static void main(String[] args) {
        // Create instances of each vehicle type with sample data

        // Truck with cargoCapacity of 4.5
        Truck truck = new Truck("Tatra", "Tatra 810 4x4", 2020, "GASOLINE", 8.112, 4.5);

        // Car with 8 seats
        Car car = new Car("Volkswagen", "Virtus", 2019, "HYBRID", 6.123, 8);

        // Motorcycle with engineDisplacement defaulted to 0 (as not provided)
        Motorcycle motorcycle = new Motorcycle("Massimo Motor", "Warrior200", 2018, "GASOLINE", 2.1);

        // Print details for Truck
        System.out.println("Truck Model: " + truck.getModel());
        System.out.println("Fuel Efficiency: " + truck.calculateFuelEfficiency() + " mpg");
        System.out.println("Distance Traveled: " + truck.calculateDistanceTraveled() + " miles");
        System.out.println("Max Speed: " + truck.getMaxSpeed() + " mph\n");

        // Print details for Car
        System.out.println("Car Model: " + car.getModel());
        System.out.println("Fuel Efficiency: " + car.calculateFuelEfficiency() + " mpg");
        System.out.println("Distance Traveled: " + car.calculateDistanceTraveled() + " miles");
        System.out.println("Max Speed: " + car.getMaxSpeed() + " mph\n");

        // Print details for Motorcycle
        System.out.println("Motorcycle Model: " + motorcycle.getModel());
        System.out.println("Fuel Efficiency: " + motorcycle.calculateFuelEfficiency() + " mpg");
        System.out.println("Distance Traveled: " + motorcycle.calculateDistanceTraveled() + " miles");
        System.out.println("Max Speed: " + motorcycle.getMaxSpeed() + " mph");
    }

    // Private static abstract class Vehicle to avoid conflicts
    private static abstract class Vehicle {
        private String make;
        private String model;
        private int year;
        private String fuelType;
        private double fuelEfficiency; // base fuel efficiency

        public Vehicle(String make, String model, int year, String fuelType, double fuelEfficiency) {
            this.make = make;
            this.model = model;
            this.year = year;
            this.fuelType = fuelType;
            this.fuelEfficiency = fuelEfficiency;
        }

        // Getter for model
        public String getModel() {
            return model;
        }

        // Getter for fuelEfficiency
        public double getFuelEfficiency() {
            return fuelEfficiency;
        }

        // Abstract methods to be implemented by subclasses
        public abstract double calculateFuelEfficiency();

        public abstract double calculateDistanceTraveled();

        public abstract double getMaxSpeed();
    }

    // Private static inner class Truck extending Vehicle
    private static class Truck extends Vehicle {
        private double cargoCapacity; // in tons or some unit (sample uses 4.5)

        public Truck(String make, String model, int year, String fuelType, double fuelEfficiency, double cargoCapacity) {
            super(make, model, year, fuelType, fuelEfficiency);
            this.cargoCapacity = cargoCapacity;
        }

        // Getter for cargoCapacity
        public double getCargoCapacity() {
            return cargoCapacity;
        }

        @Override
        public double calculateFuelEfficiency() {
            // Calculation: base fuel efficiency adjusted by cargo capacity factor
            return getFuelEfficiency() * (1.0 / (1.0 + (getCargoCapacity() / 1000.0)));
        }

        @Override
        public double calculateDistanceTraveled() {
            // Example calculation: product of adjusted fuel efficiency and base fuel efficiency
            return calculateFuelEfficiency() * getFuelEfficiency();
        }

        @Override
        public double getMaxSpeed() {
            return 80.0;
        }
    }

    // Private static inner class Car extending Vehicle
    private static class Car extends Vehicle {
        private int numSeats;

        public Car(String make, String model, int year, String fuelType, double fuelEfficiency, int numSeats) {
            super(make, model, year, fuelType, fuelEfficiency);
            this.numSeats = numSeats;
        }

        // Getter for numSeats
        public int getNumSeats() {
            return numSeats;
        }

        @Override
        public double calculateFuelEfficiency() {
            // Calculation: base fuel efficiency adjusted by seating factor
            return getFuelEfficiency() * (1.0 / (1.0 + (getNumSeats() / 5.0)));
        }

        @Override
        public double calculateDistanceTraveled() {
            return calculateFuelEfficiency() * getFuelEfficiency();
        }

        @Override
        public double getMaxSpeed() {
            return 120.0;
        }
    }

    // Private static inner class Motorcycle extending Vehicle
    private static class Motorcycle extends Vehicle {
        private double engineDisplacement; // in cc, default value 0

        public Motorcycle(String make, String model, int year, String fuelType, double fuelEfficiency) {
            super(make, model, year, fuelType, fuelEfficiency);
            // engineDisplacement not provided; assume 0
            this.engineDisplacement = 0;
        }

        // Getter for engineDisplacement
        public double getEngineDisplacement() {
            return engineDisplacement;
        }

        @Override
        public double calculateFuelEfficiency() {
            // Calculation: if engineDisplacement is 0, factor becomes 1.0
            return getFuelEfficiency() * (1.0 / (1.0 + (getEngineDisplacement() / 1000.0)));
        }

        @Override
        public double calculateDistanceTraveled() {
            return calculateFuelEfficiency() * getFuelEfficiency();
        }

        @Override
        public double getMaxSpeed() {
            return 80.0;
        }
    }
}
