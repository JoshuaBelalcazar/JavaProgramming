package exceptionhandling;

/*
Exercise 180:
Write a Java program to create a method that takes a string as input and throws an exception if the string does not contain vowels.
*/

// Exercise180.java

// Main class
public class Exercise180 {
    public static void main(String[] args) {
        try {
            String text = "Java handling and managing exceptions";
            // String text = "Typy gyps fly."; // Uncomment this line to test a string with no vowels

            System.out.println("Original string: " + text);
            checkVowels(text);  // Check if the string contains vowels
            System.out.println("String contains vowels.");

        } catch (NoVowelsException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    // Method to check if a string contains vowels
    public static void checkVowels(String text) throws NoVowelsException {
        boolean containsVowels = false;
        String vowels = "aeiouAEIOU";

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (vowels.indexOf(ch) != -1) { // Check if character is a vowel
                containsVowels = true;
                break;
            }
        }

        if (!containsVowels) {
            throw new NoVowelsException("String does not contain any vowels.");
        }
    }
}

// Custom exception class for handling no-vowels error
class NoVowelsException extends Exception {
    public NoVowelsException(String message) {
        super(message);  // Pass the error message to the superclass constructor
    }
}
