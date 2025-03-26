package javaoop.polymorphism;

// Exercise155.java

// Base class Sports
class Sports {

    // Public method play that prints a message to the console
    public void play() {
        System.out.println("Playing a sport...\n");
    }
}

// Subclass Football
class Football extends Sports {

    // Override the play method from the Sports class
    @Override
    public void play() {
        System.out.println("Playing football...");
    }
}

// Subclass Basketball
class Basketball extends Sports {

    // Override the play method from the Sports class
    @Override
    public void play() {
        System.out.println("Playing basketball...");
    }
}

// Subclass Rugby
class Rugby extends Sports {

    // Override the play method from the Sports class
    @Override
    public void play() {
        System.out.println("Playing rugby...");
    }
}

// Main class
public class Exercise155 {

    // Main method that serves as the entry point for the application
    public static void main(String[] args) {

        // Create instances of the classes
        Sports sports = new Sports();
        Football football = new Football();
        Basketball basketball = new Basketball();
        Rugby rugby = new Rugby();

        // Call the play method on each instance
        sports.play();
        football.play();
        basketball.play();
        rugby.play();
    }
}

