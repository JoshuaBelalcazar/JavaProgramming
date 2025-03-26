package javaoop.abstraction;

/*
Exercise 131:
Write a Java program to create an abstract class Person with abstract methods eat() and exercise().
Create subclasses Athlete and LazyPerson that extend the Person class and implement the respective methods
to describe how each person eats and exercises.

Expected Output:
Athlete: Include foods full of calcium, iron, potassium, and fiber.
Athlete: Training allows the body to gradually build up strength and endurance, improve skill levels and build motivation, ambition and confidence.
Couch Potato: Eating while watching TV also prolongs the time period that we're eating.
Couch Potato: Rarely exercising or being physically active.
*/

public class Exercise131 {
    public static void main(String[] args) {
        // Create an instance of Athlete as a Person
        Person athlete = new Athlete();
        // Create an instance of LazyPerson as a Person
        Person lazyPerson = new LazyPerson();

        // Call the eat and exercise methods on the Athlete instance
        athlete.eat();
        athlete.exercise();

        System.out.println();

        // Call the eat and exercise methods on the LazyPerson instance
        lazyPerson.eat();
        lazyPerson.exercise();
    }

    // Private static abstract inner class Person to avoid conflicts
    private static abstract class Person {
        // Abstract method to simulate eating behavior
        public abstract void eat();

        // Abstract method to simulate exercise behavior
        public abstract void exercise();
    }

    // Private static inner class Athlete that extends Person
    private static class Athlete extends Person {
        @Override
        public void eat() {
            System.out.println("Athlete: Include foods full of calcium, iron, potassium, and fiber.");
        }

        @Override
        public void exercise() {
            System.out.println("Athlete: Training allows the body to gradually build up strength and endurance, improve skill levels and build motivation, ambition and confidence.");
        }
    }

    // Private static inner class LazyPerson that extends Person
    private static class LazyPerson extends Person {
        @Override
        public void eat() {
            System.out.println("Couch Potato: Eating while watching TV also prolongs the time period that we're eating.");
        }

        @Override
        public void exercise() {
            System.out.println("Couch Potato: Rarely exercising or being physically active.");
        }
    }
}
