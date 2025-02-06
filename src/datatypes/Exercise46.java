package datatypes;

/*
Exercise 46:
Write a Java program to compute the body mass index (BMI).

Test Data:
Input weight in pounds: 452
Input height in inches: 72

Expected Output:
Body Mass Index is 61.30159143458721
*/

import java.util.Scanner;

public class Exercise46 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Prompt the user for weight in pounds
        System.out.print("Input weight in pounds: ");
        double weight = input.nextDouble();

        // Prompt the user for height in inches
        System.out.print("Input height in inches: ");
        double height = input.nextDouble();

        // Convert weight to kilograms and height to meters, then compute BMI
        double BMI = weight * 0.45359237 / (height * 0.0254 * height * 0.0254);

        // Display the Body Mass Index
        System.out.println("Body Mass Index is " + BMI);
    }
}

