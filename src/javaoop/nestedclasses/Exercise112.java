package javaoop.nestedclasses;

/*
Exercise 112:
Write a Java program to create an outer class called Person with an inner class Address.
The Address class should have a constructor that takes parameters city and state.
Create an instance of Address from the Person class and print the address details.

Expected Output:
City: New Delhi, State: ND
*/

public class Exercise112 {
    public static void main(String[] args) {
        // Create an instance of Person
        Person person = new Person();

        // Create an instance of the inner class Address from the Person instance
        Person.Address address = person.new Address("New Delhi", "ND");

        // Call the displayAddress method to print address details
        address.displayAddress();
    }

    // Private static inner class Person to avoid conflicts
    private static class Person {
        // Inner class Address
        class Address {
            // Private instance variables for city and state
            private String city;
            private String state;

            // Constructor for Address that takes city and state as parameters
            public Address(String city, String state) {
                this.city = city;
                this.state = state;
            }

            // Method to display the address details
            public void displayAddress() {
                System.out.println("City: " + city + ", State: " + state);
            }
        }
    }
}

