package exceptionhandling;

/*
Exercise 179:
Write a Java program that reads a file and throws an exception if the file is empty.
*/

// Exercise179.java

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

// Main class
public class Exercise179 {
    public static void main(String[] args) {
        try {
            checkFileNotEmpty("test1.txt");  // Attempt to read and check if the file is empty
            System.out.println("File is not empty.");
        } catch (FileNotFoundException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (EmptyFileException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    // Method to check if the file is empty
    public static void checkFileNotEmpty(String fileName) throws FileNotFoundException, EmptyFileException {
        File file = new File(fileName);  // Create a File object
        Scanner scanner = new Scanner(file);  // Create a Scanner object to read the file

        if (!scanner.hasNextLine()) {  // Check if the file has no content
            scanner.close();
            throw new EmptyFileException("File is empty.");  // Throw custom exception if file is empty
        }

        scanner.close();  // Close the scanner if the file is not empty
    }
}

// Custom exception class for handling empty file error
class EmptyFileException extends Exception {
    public EmptyFileException(String message) {
        super(message);  // Pass the error message to the superclass constructor
    }
}

