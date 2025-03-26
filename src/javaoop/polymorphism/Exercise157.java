package javaoop.polymorphism;

// Exercise157.java

// Base class Animal
class Animal {
    public void move() {
        System.out.println("Animal moves");
    }

    public void makeSound() {
        System.out.println("Animal makes a sound");
    }
}

// Subclass Bird
class Bird extends Animal {
    @Override
    public void move() {
        System.out.println("Bird flies");
    }

    @Override
    public void makeSound() {
        System.out.println("Bird chirps");
    }
}

// Subclass Panthera
class Panthera extends Animal {
    @Override
    public void move() {
        System.out.println("Panthera walks");
    }

    @Override
    public void makeSound() {
        System.out.println("Panthera roars");
    }
}

// Main class
public class Exercise157 {

    public static void main(String[] args) {
        Animal bird = new Bird();
        Animal panthera = new Panthera();

        performAction(bird);
        performAction(panthera);
    }

    public static void performAction(Animal animal) {
        animal.move();
        animal.makeSound();
    }
}

