package javaoop.polymorphism;

/*
Exercise 151:
Write a Java program to create a base class Animal (Animal Family) with a method called makeSound().
Create two subclasses Bird and Cat.
Override the makeSound() method in each subclass to make a specific sound for each animal.

Expected Output:
The animal makes a sound
The bird chirps
The cat meows
*/

// Base class Animal
class Animal {
    // Method to print the sound the animal makes
    public void makeSound() {
        System.out.println("The animal makes a sound");
    }
}

// Subclass Bird extending Animal
class Bird extends Animal {
    // Override the makeSound method to provide a specific implementation for Bird
    @Override
    public void makeSound() {
        System.out.println("The bird chirps");
    }
}

// Subclass Cat extending Animal
class Cat extends Animal {
    // Override the makeSound method to provide a specific implementation for Cat
    @Override
    public void makeSound() {
        System.out.println("The cat meows");
    }
}

// Main class (Exercise151)
public class Exercise151 {
    // Main method: entry point of the program
    public static void main(String[] args) {
        // Create an instance of Animal
        Animal animal = new Animal();

        // Create an instance of Bird
        Animal bird = new Bird();

        // Create an instance of Cat
        Animal cat = new Cat();

        // Call the makeSound method on each instance
        animal.makeSound();  // Output: The animal makes a sound
        bird.makeSound();    // Output: The bird chirps
        cat.makeSound();     // Output: The cat meows
    }
}

