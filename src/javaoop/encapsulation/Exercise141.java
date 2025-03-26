package javaoop.encapsulation;

/*
Exercise 141:
Write a Java program to create a class called Person with private instance variables name, age, and country.
Provide public getter and setter methods to access and modify these variables.

Expected Output:
Name: Arthfael Viktorija
Age: 25
Country: USA
*/

// Person.java
// Person Class
class Person {
    // Private fields to store name, age, and country of the person
    private String name;
    private int age;
    private String country;

    // Constructor to initialize the person object
    public Person(String name, int age, String country) {
        this.name = name;
        this.age = age;
        this.country = country;
    }

    // Getter method to retrieve the name
    public String getName() {
        return name;
    }

    // Setter method to update the name
    public void setName(String name) {
        this.name = name;
    }

    // Getter method to retrieve the age
    public int getAge() {
        return age;
    }

    // Setter method to update the age
    public void setAge(int age) {
        this.age = age;
    }

    // Getter method to retrieve the country
    public String getCountry() {
        return country;
    }

    // Setter method to update the country
    public void setCountry(String country) {
        this.country = country;
    }

    // Method to display person information
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Country: " + country);
    }
}

// Main.java
// Main Class
public class Exercise141 {
    public static void main(String[] args) {
        // Create an instance of Person with initial values
        Person person = new Person("Arthfael Viktorija", 25, "USA");

        // Display initial values
        person.displayInfo();

        // Update values using setter methods
        person.setName("Brian Walter");
        person.setAge(30);
        person.setCountry("Canada");

        System.out.println("\nAfter updating values:");

        // Display updated values
        person.displayInfo();
    }
}

