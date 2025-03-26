package javaoop.encapsulation;

/*
Exercise 148:
Write a Java program to create a class called “Book” with private instance variables title, author, and price.
Provide public getter and setter methods to access and modify these variables.
Add a method called applyDiscount() that takes a percentage as a parameter and reduces the price by that percentage.

Expected Output:
Title: Java Programming
Author: Imani Matey
Price: $31.5
*/

// Book.java

// Define the Book class
class Book {
    // Private instance variables
    private String title;
    private String author;
    private double price;

    // Public getter for the title variable
    public String getTitle() {
        return title;
    }

    // Public setter for the title variable
    public void setTitle(String title) {
        this.title = title;
    }

    // Public getter for the author variable
    public String getAuthor() {
        return author;
    }

    // Public setter for the author variable
    public void setAuthor(String author) {
        this.author = author;
    }

    // Public getter for the price variable
    public double getPrice() {
        return price;
    }

    // Public setter for the price variable
    public void setPrice(double price) {
        if (price > 0) {
            this.price = price;
        } else {
            System.out.println("Invalid price. Must be greater than zero.");
        }
    }

    // Method to apply a discount to the price
    public void applyDiscount(double percentage) {
        if (percentage > 0 && percentage <= 100) {
            this.price -= this.price * (percentage / 100);
        } else {
            System.out.println("Invalid discount percentage. Must be between 0 and 100.");
        }
    }
}

// Exercise148.java

// Main method to test the Book class
public class Exercise148 {
    public static void main(String[] args) {
        // Create a new Book object
        Book book = new Book();

        // Set the title, author, and price of the book
        book.setTitle("Java Programming");
        book.setAuthor("Imani Matey");
        book.setPrice(35.0);

        // Apply a 10% discount to the book price
        book.applyDiscount(10);

        // Print the details of the book
        System.out.println("Title: " + book.getTitle());
        System.out.println("Author: " + book.getAuthor());
        System.out.println("Price: $" + book.getPrice());
    }
}
