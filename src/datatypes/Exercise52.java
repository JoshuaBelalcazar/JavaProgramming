package datatypes;

/*
Exercise 52:
Write a Java program to compare two signed and unsigned numbers.
*/

public class Exercise52 {
    public static void main(String[] args) {
        // Define two integers using the minimum and maximum integer values
        int num1 = Integer.MIN_VALUE;
        int num2 = Integer.MAX_VALUE;

        // Display the signed integer values
        System.out.println("Signed integers: " + num1 + ", " + num2);
        System.out.println("-----------------------------------------");

        // Compare the two numbers as signed integers
        int signedComparison = Integer.compare(num1, num2);
        System.out.println("Result of comparing signed numbers: " + signedComparison);

        // Compare the two numbers as unsigned integers
        int unsignedComparison = Integer.compareUnsigned(num1, num2);
        System.out.println("Result of comparing unsigned numbers: " + unsignedComparison);
    }
}
