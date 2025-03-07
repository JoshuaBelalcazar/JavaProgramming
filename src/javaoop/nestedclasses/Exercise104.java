package javaoop.nestedclasses;

/*
Exercise 104:
Write a Java program to create a class called "Computer" with an inner class "Processor". The Processor class should have a method
"displayDetails()" that prints the details of the processor (e.g., brand and speed). Create an instance of Processor from the Computer
class and call the "displayDetails()" method.

Expected Output:
Processor Brand: Intel
Processor Speed: 3.5 GHz
*/

public class Exercise104 {
    public static void main(String[] args) {
        // Create an instance of Computer and display processor details.
        Computer computer = new Computer();
        computer.showProcessorDetails();
    }

    // Private static inner class Computer to avoid conflicts
    private static class Computer {
        // Inner class Processor
        class Processor {
            // Method to display the details of the processor
            void displayDetails() {
                System.out.println("Processor Brand: Intel");
                System.out.println("Processor Speed: 3.5 GHz");
            }
        }

        // Method to create an instance of Processor and call its displayDetails method
        void showProcessorDetails() {
            Processor processor = new Processor();
            processor.displayDetails();
        }
    }
}
