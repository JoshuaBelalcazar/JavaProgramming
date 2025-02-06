package datatypes;

/*
Exercise 55:
Write a Java program to get the next floating-point adjacent to positive and negative infinity from a given floating/double number.
*/

public class Exercise55 {
    public static void main(String[] args) {
        // For float values
        float floatValue = 0.2f;
        System.out.println("\nInitial floating number: " + floatValue);
        float nextDownFloat = Math.nextDown(floatValue);
        float nextUpFloat = Math.nextUp(floatValue);
        System.out.println("Float " + floatValue + " next down is " + nextDownFloat);
        System.out.println("Float " + floatValue + " next up is " + nextUpFloat);

        // For double values
        double doubleValue = 0.2d;
        System.out.println("\nInitial double number: " + doubleValue);
        double nextDownDouble = Math.nextDown(doubleValue);
        double nextUpDouble = Math.nextUp(doubleValue);
        System.out.println("Double " + doubleValue + " next down is " + nextDownDouble);
        System.out.println("Double " + doubleValue + " next up is " + nextUpDouble);
    }
}
