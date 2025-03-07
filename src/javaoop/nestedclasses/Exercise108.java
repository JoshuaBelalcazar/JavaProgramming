package javaoop.nestedclasses;

/*
Exercise 108:
Write a Java program to create an outer class called Library with an instance variable libraryName.
Create an inner class Book with a method getLibraryName() that returns the name of the library.
Instantiate the Book class and call the getLibraryName() method.

Expected Output:
Library Name: Central Library
*/

public class Exercise108 {
    public static void main(String[] args) {
        // Create an instance of Library with a given libraryName
        Library myLibrary = new Library("Central Library");
        // Create an instance of the inner class Book using the Library instance
        Library.Book myBook = myLibrary.new Book();
        // Call the getLibraryName() method and print the result
        System.out.println("Library Name: " + myBook.getLibraryName());
    }

    // Private static outer class Library to avoid conflicts
    private static class Library {
        // Private instance variable libraryName
        private String libraryName;

        // Constructor to initialize libraryName
        public Library(String libraryName) {
            this.libraryName = libraryName;
        }

        // Inner class Book
        public class Book {
            // Method to return the name of the library (accessing the outer class's variable)
            public String getLibraryName() {
                return libraryName;
            }
        }
    }
}
