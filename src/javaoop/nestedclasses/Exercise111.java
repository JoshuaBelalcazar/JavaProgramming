package javaoop.nestedclasses;

/*
Exercise 111:
Write a Java program to create an abstract class called Animal with an abstract method makeSound().
In the main method, create an anonymous class that extends Animal and override the makeSound() method to print "Meow" for a cat.
Call the makeSound() method.

Expected Output:
Meow
*/

public class Exercise111 {
    public static void main(String[] args) {
        // Create an anonymous class that extends Animal and overrides the makeSound() method
        Animal cat = new Animal() {
            @Override
            void makeSound() {
                System.out.println("Meow");
            }
        };

        // Call the sayHello method (in this case, makeSound()) on the anonymous class instance
        cat.makeSound();
    }

    // Private static abstract class Animal to avoid conflicts
    private static abstract class Animal {
        // Abstract method makeSound()
        abstract void makeSound();
    }
}
