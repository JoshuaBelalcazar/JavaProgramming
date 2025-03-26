package javaoop.java_interfaces;

/*
Exercise 137:
Write a Java program to create an interface called Animal with a method called bark() that takes no arguments and returns void.
Create a Dog class that implements Animal and overrides the bark() method to print "Dog is barking!".

Expected Output:
Dog is barking!
*/

public class Exercise137 {
    public static void main(String[] args) {
        // Create an instance of Dog via the Animal interface reference
        Animal dog = new Dog();
        // Invoke the bark() method on the Dog instance
        dog.bark();
    }

    // Private static inner interface Animal to avoid conflicts
    private interface Animal {
        void bark();
    }

    // Private static inner class Dog that implements the Animal interface
    private static class Dog implements Animal {
        @Override
        public void bark() {
            System.out.println("Dog is barking!");
        }
    }
}

