package javaoop.nestedclasses;

/*
Exercise 106:
Write a Java program to create a class called Car with a method startEngine().
Inside this method, define a local class Engine that has a method run().
The run() method should print "Engine is running".
Instantiate and call the run() method from within the startEngine() method.

Expected Output:
Engine is running
*/

public class Exercise106 {
    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.startEngine();
    }

    // Private static inner class Car to avoid conflicts
    private static class Car {
        // Method startEngine contains a local class Engine
        public void startEngine() {
            // Local class Engine defined within startEngine()
            class Engine {
                // Method run prints a message indicating the engine is running
                public void run() {
                    System.out.println("Engine is running");
                }
            }
            // Instantiate the local class Engine and call its run() method
            Engine engine = new Engine();
            engine.run();
        }
    }
}
