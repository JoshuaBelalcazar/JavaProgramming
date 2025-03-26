package javaoop.constructors;/*
Exercise 87:
Write a Java program to create a class called Dog with instance variables name and color.
Implement a parameterized constructor that takes name and color as parameters and initializes the instance variables.
Print the values of the variables.

Expected Output:
Dog's Name: Bailey
Dog's Color: Black
*/

public class Exercise87 {
    public static void main(String[] args) {
        // Create a Dog object using the parameterized constructor
        Dog myDog = new Dog("Bailey", "Black");
        // Print the values using getter methods
        System.out.println("Dog's Name: " + myDog.getName());
        System.out.println("Dog's Color: " + myDog.getColor());
    }

    // Private static inner class Dog to avoid conflicts
    private static class Dog {
        // Private instance variables
        private final String name;
        private final String color;

        // Parameterized constructor to initialize the instance variables
        public Dog(String name, String color) {
            this.name = name;
            this.color = color;
        }

        // Getter method for name
        public String getName() {
            return name;
        }

        // Getter method for color
        public String getColor() {
            return color;
        }
    }
}
