package javaoop.encapsulation;

/*
Exercise 150:
Write a Java program to create a class called Desktop with private instance variables brand, processor, and ramSize.
Provide public getter and setter methods to access and modify these variables.
Add a method called upgradeRam() that takes an integer value and increases the ramSize by that value.

Expected Output:
Brand: ComputeMaster
Processor: Intel Core i7
RAM Size: 64GB
*/

// Desktop Class (No longer public)
class Desktop {
    // Private instance variables
    private String brand;
    private String processor;
    private int ramSize;

    // Public getter for the brand variable
    public String getBrand() {
        return brand;
    }

    // Public setter for the brand variable
    public void setBrand(String brand) {
        this.brand = brand;
    }

    // Public getter for the processor variable
    public String getProcessor() {
        return processor;
    }

    // Public setter for the processor variable
    public void setProcessor(String processor) {
        this.processor = processor;
    }

    // Public getter for the ramSize variable
    public int getRamSize() {
        return ramSize;
    }

    // Public setter for the ramSize variable
    public void setRamSize(int ramSize) {
        if (ramSize > 0) {
            this.ramSize = ramSize;
        } else {
            System.out.println("RAM size must be positive.");
        }
    }

    // Method to upgrade the RAM size by a given value
    public void upgradeRam(int additionalRam) {
        if (additionalRam > 0) {
            this.ramSize += additionalRam;
        } else {
            System.out.println("Additional RAM must be positive.");
        }
    }
}

// Main Class (Exercise151)
public class Exercise150 {
    // Main method to test the Desktop class
    public static void main(String[] args) {
        // Create a new Desktop object
        Desktop desktop = new Desktop();

        // Set the brand, processor, and initial RAM size of the desktop
        desktop.setBrand("ComputeMaster");
        desktop.setProcessor("Intel Core i7");
        desktop.setRamSize(32);

        // Upgrade the RAM size by 32 GB
        desktop.upgradeRam(32);

        // Print the details of the desktop
        System.out.println("Brand: " + desktop.getBrand());
        System.out.println("Processor: " + desktop.getProcessor());
        System.out.println("RAM Size: " + desktop.getRamSize() + "GB");
    }
}

