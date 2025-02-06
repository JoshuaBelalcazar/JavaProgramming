package datatypes;

import java.util.Scanner;

public class Exercise41 {
    public static void main(String[] args) {
    /*
   Exercise 41:
   Write a Java program to convert temperature from Fahrenheit to Celsius degrees.
   Test Data
   Input a degree in Fahrenheit: 212
   Expected Output:
   212.0 degree Fahrenheit is equal to 100.0 in Celsius
    */
        Scanner reader = new Scanner(System.in);

        System.out.print("Input a degree in Fahrenheit: ");
        double fahrenValue = reader.nextDouble();

        double celsiusValue = (5 * (fahrenValue - 32.0)) / 9.0;
        System.out.println(fahrenValue + " degree Fahrenheit is equal to "
                + celsiusValue + " in Celsius");
    }
}
