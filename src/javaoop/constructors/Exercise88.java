package javaoop.constructors;
/*
Exercise 88:
Write a Java program to create a class called "Book" with instance variables title, author, and price.
Implement a default constructor and two parameterized constructors:
    - One constructor takes title and author as parameters.
    - The other constructor takes title, author, and price as parameters.
Print the values of the variables for each constructor.

Expected Output:
Book1 Title: Unknown
Book1 Author: Unknown
Book1 Price: 0.0
Book2 Title: Amatka
Book2 Author: Karin Tidbeck
Book2 Price: 0.0
Book3 Title: Altered Carbon
Book3 Author: Richard K. Morgan
Book3 Price: 18.99
*/

public class Exercise88 {
    public static void main(String[] args) {
        // Create a Book object using the default constructor
        Book book1 = new Book();
        System.out.println("Book1 Title: " + book1.getTitle());
        System.out.println("Book1 Author: " + book1.getAuthor());
        System.out.println("Book1 Price: " + book1.getPrice());
        System.out.println();

        // Create a Book object using the parameterized constructor (title, author)
        Book book2 = new Book("Amatka", "Karin Tidbeck");
        System.out.println("Book2 Title: " + book2.getTitle());
        System.out.println("Book2 Author: " + book2.getAuthor());
        System.out.println("Book2 Price: " + book2.getPrice());
        System.out.println();

        // Create a Book object using the parameterized constructor (title, author, price)
        Book book3 = new Book("Altered Carbon", "Richard K. Morgan", 18.99);
        System.out.println("Book3 Title: " + book3.getTitle());
        System.out.println("Book3 Author: " + book3.getAuthor());
        System.out.println("Book3 Price: " + book3.getPrice());
    }

    // Private static inner class Book to avoid conflicts
    private static class Book {
        // Private instance variables
        private String title;
        private String author;
        private double price;

        // Default constructor
        public Book() {
            this.title = "Unknown";
            this.author = "Unknown";
            this.price = 0.0;
        }

        // Parameterized constructor (title, author)
        public Book(String title, String author) {
            this.title = title;
            this.author = author;
            this.price = 0.0;
        }

        // Parameterized constructor (title, author, price)
        public Book(String title, String author, double price) {
            this.title = title;
            this.author = author;
            this.price = price;
        }

        // Getter methods for accessing private instance variables
        public String getTitle() {
            return title;
        }

        public String getAuthor() {
            return author;
        }

        public double getPrice() {
            return price;
        }
    }
}
