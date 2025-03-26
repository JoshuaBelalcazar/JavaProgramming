package javaoop.abstraction;
/*
Exercise 124:
Write a Java program to create an abstract class Animal with an abstract method called sound().
Create subclasses Lion and Tiger that extend the Animal class and implement the sound() method to make a specific sound for each animal.

Expected Output:
Lion roars!
Tiger growls!
*/

public class Exercise124 {
    public static void main(String[] args) {
        // Create an instance of Lion and call its sound() method
        Animal lion = new Lion();
        lion.sound();

        // Create an instance of Tiger and call its sound() method
        Animal tiger = new Tiger();
        tiger.sound();
    }

    // Private static abstract class Animal to avoid conflicts
    private static abstract class Animal {
        // Abstract method sound that must be implemented by subclasses
        public abstract void sound();
    }

    // Private static inner class Lion that extends Animal
    private static class Lion extends Animal {
        @Override
        public void sound() {
            System.out.println("Lion roars!");
        }
    }

    // Private static inner class Tiger that extends Animal
    private static class Tiger extends Animal {
        @Override
        public void sound() {
            System.out.println("Tiger growls!");
        }
    }
}
