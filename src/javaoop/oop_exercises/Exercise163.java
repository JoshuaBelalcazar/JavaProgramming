package javaoop.oop_exercises;

/*
Exercise 163:
Write a Java program to create a class called "Book" with attributes for title, author, and ISBN, and methods to add and remove books from a collection.

Sample Solution:
*/

// Exercise163.java

// Import the ArrayList class from the java.util package
import java.util.ArrayList;

// Define the Book class
class Book {
    // Declare private variables for title, author, and ISBN
    private String title;
    private String author;
    private String ISBN;
    // Declare a static ArrayList to store the collection of Book objects
    private static ArrayList<Book> bookCollection = new ArrayList<Book>();

    // Constructor to initialize Book attributes
    public Book(String title, String author, String ISBN) {
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
    }

    // Getter for book title
    public String get_Title() {
        return title;
    }

    // Setter for book title
    public void set_Title(String title) {
        this.title = title;
    }

    // Getter for book author
    public String get_Author() {
        return author;
    }

    // Setter for book author
    public void set_Author(String author) {
        this.author = author;
    }

    // Getter for book ISBN
    public String get_ISBN() {
        return ISBN;
    }

    // Setter for book ISBN
    public void set_ISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    // Static method to add a book to the collection
    public static void add_Book(Book book) {
        bookCollection.add(book);
    }

    // Static method to remove a book from the collection
    public static void remove_Book(Book book) {
        bookCollection.remove(book);
    }

    // Static method to retrieve the entire book collection
    public static ArrayList<Book> get_BookCollection() {
        return bookCollection;
    }
}

// Define the Exercise163 class
public class Exercise163 {
    public static void main(String[] args) {
        // Create two books
        Book book1 = new Book("The C Programming Language", "Dennis Ritchie, Brian Kernighan", "9780131101630");
        Book book2 = new Book("An Introduction to Python", "Guido van Rossum", "9355423489");

        // Add books to the collection
        Book.add_Book(book1);
        Book.add_Book(book2);

        // Retrieve the collection of books
        ArrayList<Book> bookCollection = Book.get_BookCollection();

        // Print all books in the collection
        System.out.println("List of books:");
        for (Book book : bookCollection) {
            System.out.println(book.get_Title() + " by " + book.get_Author() + ", ISBN: " + book.get_ISBN());
        }

        // Remove the first book from the collection
        Book.remove_Book(book1);

        // Print the collection after removal
        System.out.println("\nAfter removing " + book1.get_Title() + ":");
        System.out.println("List of books:");
        for (Book book : bookCollection) {
            System.out.println(book.get_Title() + " by " + book.get_Author() + ", ISBN: " + book.get_ISBN());
        }
    }
}

