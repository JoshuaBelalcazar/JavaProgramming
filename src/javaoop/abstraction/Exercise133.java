package javaoop.abstraction;

/*
Exercise 133:
Write a Java program to create an abstract class Bird with abstract methods fly() and makeSound().
Create subclasses Eagle and Hawk that extend the Bird class and implement the respective methods to describe how each bird flies and makes a sound.

Expected Output:
Eagle: Flying high in the sky.
Eagle: Screech! Screech!
Hawk: Soaring through the air.
Hawk: Caw! Caw!
*/

public class Exercise133 {
    public static void main(String[] args) {
        // Create an instance of Eagle and assign it to a Bird reference
        Bird eagle = new Eagle();
        // Create an instance of Hawk and assign it to a Bird reference
        Bird hawk = new Hawk();

        // Call the fly and makeSound methods on the eagle instance
        eagle.fly();
        eagle.makeSound();

        // Call the fly and makeSound methods on the hawk instance
        hawk.fly();
        hawk.makeSound();
    }

    // Private static abstract inner class Bird to avoid conflicts
    private static abstract class Bird {
        // Abstract method to simulate flying
        public abstract void fly();

        // Abstract method to simulate making a sound
        public abstract void makeSound();
    }

    // Private static inner class Eagle that extends Bird
    private static class Eagle extends Bird {
        @Override
        public void fly() {
            System.out.println("Eagle: Flying high in the sky.");
        }

        @Override
        public void makeSound() {
            System.out.println("Eagle: Screech! Screech!");
        }
    }

    // Private static inner class Hawk that extends Bird
    private static class Hawk extends Bird {
        @Override
        public void fly() {
            System.out.println("Hawk: Soaring through the air.");
        }

        @Override
        public void makeSound() {
            System.out.println("Hawk: Caw! Caw!");
        }
    }
}
