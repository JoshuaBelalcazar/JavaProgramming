package javaoop.staticmembers;

/*
Exercise 99:
Write a Java program to create a class called Configuration with a static block that initializes a static variable 'configValue'
from a configuration file (simulated with a default value). Print the value of 'configValue' in the main method.

Expected Output:
Static block executed: configValue initialized
Config Value: Default Config Value
*/

public class Exercise99 {
    public static void main(String[] args) {
        // Access the configValue to trigger the static block execution
        System.out.println("Config Value: " + Configuration.configValue);
    }

    // Private static inner class Configuration to avoid conflicts
    private static class Configuration {
        // Declare a static variable configValue
        public static String configValue;

        // Static block to initialize configValue (simulating reading from a configuration file)
        static {
            configValue = "Default Config Value";
            System.out.println("Static block executed: configValue initialized");
        }
    }
}
