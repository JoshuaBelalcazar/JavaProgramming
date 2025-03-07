package javaoop.constructors;

/*
Exercise 95:
Write a Java program to create a class called Singleton that ensures only one instance of the class can be created.
Implement a private constructor and a public static method to get the single instance of the class.
Print a message indicating the creation of the instance.

Expected Output:
Singleton instance created.
Both instances are the same.
*/

public class Exercise95 {
    public static void main(String[] args) {
        // Get the single instance of Singleton
        Singleton instance1 = Singleton.getInstance();
        // Try to get another instance of Singleton
        Singleton instance2 = Singleton.getInstance();

        // Check if both instances are the same
        if (instance1 == instance2) {
            System.out.println("Both instances are the same.");
        } else {
            System.out.println("Instances are different.");
        }
    }

    // Private static inner class Singleton to prevent conflicts
    private static class Singleton {
        // Private static variable to hold the single instance
        private static Singleton singleInstance = null;

        // Private constructor to prevent instantiation from outside
        private Singleton() {
            // Print a message indicating the creation of the instance
            System.out.println("Singleton instance created.");
        }

        // Public static method to get the single instance of the class
        public static Singleton getInstance() {
            if (singleInstance == null) {
                singleInstance = new Singleton();
            }
            return singleInstance;
        }
    }
}
