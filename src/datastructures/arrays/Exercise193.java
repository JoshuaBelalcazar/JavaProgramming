package datastructures.arrays;

/*
Exercise 193:
Write a Java program to print the following grid.

Expected Output :
- - - - - - - - - -
- - - - - - - - - -
- - - - - - - - - -
- - - - - - - - - -
- - - - - - - - - -
- - - - - - - - - -
- - - - - - - - - -
- - - - - - - - - -
- - - - - - - - - -
- - - - - - - - - -
*/

public class Exercise193 {
    public static void main(String[] args) {
        // Loop over 10 rows
        for (int i = 0; i < 10; i++) {
            // Loop over 10 columns
            for (int j = 0; j < 10; j++) {
                System.out.print("- ");
            }
            // Move to the next line after each row
            System.out.println();
        }
    }
}

