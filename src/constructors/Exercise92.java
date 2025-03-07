package constructors;
/*
Exercise 92:
Write a Java program to create a class called Car with instance variables make, model, and year.
Implement a parameterized constructor that initializes these variables and assigns default values if not provided.
Print the values of the variables.

Expected Output:
Car 1 Make: Toyota
Car 1 Model: Corolla
Car 1 Year: 2021
Car 2 Make: Unknown Make
Car 2 Model: Unknown Model
Car 2 Year: 2000
*/

public class Exercise92 {
    public static void main(String[] args) {
        // Create a Car object with valid data using the parameterized constructor
        Car car1 = new Car("Toyota", "Corolla", 2021);
        System.out.println("Car 1 Make: " + car1.getMake());
        System.out.println("Car 1 Model: " + car1.getModel());
        System.out.println("Car 1 Year: " + car1.getYear());
        System.out.println();

        // Create a Car object with invalid data to trigger default values
        Car car2 = new Car("", "", -1);
        System.out.println("Car 2 Make: " + car2.getMake());
        System.out.println("Car 2 Model: " + car2.getModel());
        System.out.println("Car 2 Year: " + car2.getYear());
    }

    // Private static inner class Car to avoid conflicts with other classes
    private static class Car {
        // Private instance variables
        private String make;
        private String model;
        private int year;

        // Parameterized constructor with default value assignment if invalid values are provided
        public Car(String make, String model, int year) {
            // Use default values if make or model are null or empty, or if year is not positive
            this.make = (make == null || make.isEmpty()) ? "Unknown Make" : make;
            this.model = (model == null || model.isEmpty()) ? "Unknown Model" : model;
            this.year = (year <= 0) ? 2000 : year;
        }

        // Getter for make
        public String getMake() {
            return make;
        }

        // Getter for model
        public String getModel() {
            return model;
        }

        // Getter for year
        public int getYear() {
            return year;
        }
    }
}
