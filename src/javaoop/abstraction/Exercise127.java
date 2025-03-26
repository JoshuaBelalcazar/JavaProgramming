package javaoop.abstraction;

/*
Exercise 127:
Write a Java program to create an abstract class Animal with abstract methods eat() and sleep().
Create subclasses Lion, Tiger, and Deer that extend the Animal class and implement the eat() and sleep() methods
differently based on their specific behavior.

Expected Output:
Lion eats meat.
Lion sleeps on grassland.

Tiger eats meat and occasionally hunts in water.
Tiger sleeps in a hidden spot.

Deer grazes on grass and leaves.
Deer sleeps in open fields.
*/

public class Exercise127 {
    public static void main(String[] args) {
        // Create instances of the subclasses and invoke their methods
        Animal lion = new Lion();
        Animal tiger = new Tiger();
        Animal deer = new Deer();

        lion.eat();
        lion.sleep();
        System.out.println();

        tiger.eat();
        tiger.sleep();
        System.out.println();

        deer.eat();
        deer.sleep();
    }

    // Private static abstract class Animal to avoid conflicts
    private static abstract class Animal {
        // Abstract method to simulate eating behavior
        public abstract void eat();

        // Abstract method to simulate sleeping behavior
        public abstract void sleep();
    }

    // Private static inner class Lion that extends Animal
    private static class Lion extends Animal {
        @Override
        public void eat() {
            System.out.println("Lion eats meat.");
        }

        @Override
        public void sleep() {
            System.out.println("Lion sleeps on grassland.");
        }
    }

    // Private static inner class Tiger that extends Animal
    private static class Tiger extends Animal {
        @Override
        public void eat() {
            System.out.println("Tiger eats meat and occasionally hunts in water.");
        }

        @Override
        public void sleep() {
            System.out.println("Tiger sleeps in a hidden spot.");
        }
    }

    // Private static inner class Deer that extends Animal
    private static class Deer extends Animal {
        @Override
        public void eat() {
            System.out.println("Deer grazes on grass and leaves.");
        }

        @Override
        public void sleep() {
            System.out.println("Deer sleeps in open fields.");
        }
    }
}
