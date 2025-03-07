package javaoop.nestedclasses;

/*
Exercise 107:
Write a Java program to create an interface called Greeting with a method sayHello().
In the main method, create an anonymous class that implements the Greeting interface and override the sayHello() method
to print "Hello, World!". Call the sayHello() method.

Expected Output:
Hello, World!
*/

public class Exercise107 {
    public static void main(String[] args) {
        // Create an anonymous class that implements the Greeting interface
        Greeting greeting = new Greeting() {
            @Override
            public void sayHello() {
                System.out.println("Hello, World!");
            }
        };

        // Call the sayHello() method
        greeting.sayHello();
    }

    // Private static inner interface Greeting to avoid conflicts
    private static interface Greeting {
        void sayHello();
    }
}
