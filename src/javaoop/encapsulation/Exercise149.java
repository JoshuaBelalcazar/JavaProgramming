package javaoop.encapsulation;

/*
Exercise 149:
Write a Java program to create a class called Smartphone with private instance variables brand, model, and storageCapacity.
Provide public getter and setter methods to access and modify these variables.
Add a method called increaseStorage() that takes an integer value and increases the storageCapacity by that value.

Expected Output:
Brand: SmartMobile
Model: W1000
Storage Capacity: 90GB
*/

// Smartphone Class (No longer public)
class Smartphone {
    // Private instance variables
    private String brand;
    private String model;
    private int storageCapacity;

    // Public getter for the brand variable
    public String getBrand() {
        return brand;
    }

    // Public setter for the brand variable
    public void setBrand(String brand) {
        this.brand = brand;
    }

    // Public getter for the model variable
    public String getModel() {
        return model;
    }

    // Public setter for the model variable
    public void setModel(String model) {
        this.model = model;
    }

    // Public getter for the storageCapacity variable
    public int getStorageCapacity() {
        return storageCapacity;
    }

    // Public setter for the storageCapacity variable
    public void setStorageCapacity(int storageCapacity) {
        if (storageCapacity > 0) {
            this.storageCapacity = storageCapacity;
        } else {
            System.out.println("Storage capacity must be positive.");
        }
    }

    // Method to increase the storage capacity by a given value
    public void increaseStorage(int additionalStorage) {
        if (additionalStorage > 0) {
            this.storageCapacity += additionalStorage;
        } else {
            System.out.println("Additional storage must be positive.");
        }
    }
}

// Main Class (Exercise149)
public class Exercise149 {
    // Main method to test the Smartphone class
    public static void main(String[] args) {
        // Create a new Smartphone object
        Smartphone phone = new Smartphone();

        // Set the brand, model, and initial storage capacity of the phone
        phone.setBrand("SmartMobile");
        phone.setModel("W1000");
        phone.setStorageCapacity(60);

        // Increase the storage capacity by 30
        phone.increaseStorage(30);

        // Print the details of the phone
        System.out.println("Brand: " + phone.getBrand());
        System.out.println("Model: " + phone.getModel());
        System.out.println("Storage Capacity: " + phone.getStorageCapacity() + "GB");
    }
}

