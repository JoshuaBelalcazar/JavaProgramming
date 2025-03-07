package javaoop.inheritance;

/*
Exercise 119:
Write a Java program to create a class called Animal with a method named move().
Create a subclass called Cheetah that overrides the move() method to run.
In the main method, create an instance of Animal and an instance of Cheetah, and call the move() method on both.

Expected Output:
Animal moves
This cheetah is running!
*/

public class Exercise119 {
    public static void main(String[] args) {
        // Create an instance of Animal and call move()
        Animal animal = new Animal();
        animal.move();

        // Create an instance of Cheetah and call move()
        Cheetah cheetah = new Cheetah();
        cheetah.move();
    }

    // Private static inner class Animal to avoid conflicts
    private static class Animal {
        // Method move prints a generic message
        public void move() {
            System.out.println("Animal moves");
        }
    }

    // Private static inner class Cheetah that extends Animal
    private static class Cheetah extends Animal {
        // Overriding the move method to print a cheetah-specific message
        @Override
        public void move() {
            System.out.println("This cheetah is running!");
        }
    }
}
