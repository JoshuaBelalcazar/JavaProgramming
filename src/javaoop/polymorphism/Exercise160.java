package javaoop.polymorphism;

// Exercise160.java

// Define the Animal class
class Animal {
    public void eat() {  // Method for animal to eat
        System.out.println("Animal eats.");
    }

    public void sound() {  // Method for animal to make a sound
        System.out.println("Animal makes a sound.");
    }
}

// Define the Lion class that extends Animal
class Lion extends Animal {
    @Override
    public void eat() {  // Override the eat method
        System.out.println("Lion eats meat.");
    }

    @Override
    public void sound() {  // Override the sound method
        System.out.println("Lion roars.");
    }
}

// Define the Tiger class that extends Animal
class Tiger extends Animal {
    @Override
    public void eat() {  // Override the eat method
        System.out.println("Tiger eats meat and sometimes fish.");
    }

    @Override
    public void sound() {  // Override the sound method
        System.out.println("Tiger growls.");
    }
}

// Define the Panther class that extends Animal
class Panther extends Animal {
    @Override
    public void eat() {  // Override the eat method
        System.out.println("Panther eats meat and small mammals.");
    }

    @Override
    public void sound() {  // Override the sound method
        System.out.println("Panther purrs and sometimes hisses.");
    }
}

// Define the Main class
public class Exercise160 {
    public static void main(String[] args) {
        Animal lion = new Lion();  // Create an Animal reference to a Lion object
        Animal tiger = new Tiger();  // Create an Animal reference to a Tiger object
        Animal panther = new Panther();  // Create an Animal reference to a Panther object

        lion.eat();
        lion.sound();

        tiger.eat();
        tiger.sound();

        panther.eat();
        panther.sound();
    }
}
