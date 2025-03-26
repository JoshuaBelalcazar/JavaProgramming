package javaoop.inheritance;

/*
Exercise 114:
Write a Java program to create a class called Animal with a method called makeSound().
Create a subclass called Cat that overrides the makeSound() method to bark.
This exercise demonstrates inheritance by having Cat override the makeSound() method.
In the main method, create an instance of Animal and an instance of Cat, and call the makeSound() method on both.

Expected Output:
The animal makes a sound.
The cat quarrels.
*/

public class Exercise114 {
    public static void main(String[] args) {
        // Create an instance of Animal
        Animal animal = new Animal();
        // Create an instance of Cat (which extends Animal)
        Cat cat = new Cat();

        // Call the makeSound method on both instances
        animal.makeSound();
        cat.makeSound();
    }

    // Private static outer class Animal to avoid conflicts
    private static class Animal {
        // Method makeSound prints a generic message
        public void makeSound() {
            System.out.println("The animal makes a sound.");
        }
    }

    // Private static inner class Cat that extends Animal
    private static class Cat extends Animal {
        // Overriding the makeSound method to print a specific message for Cat
        @Override
        public void makeSound() {
            System.out.println("The cat quarrels.");
        }
    }
}
