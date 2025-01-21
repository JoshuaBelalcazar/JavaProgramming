package javabasics_I;

public class Exercise16 {
    public static void main(String[] args) {
        /*
        Exercise 16:
        Write a Java program to print numbers between 1 and 100 divisible by 3, 5 and both.
        Sample Output:

        Divided by 3:
        3, 6, 9, 12, 15, 18, 21, 24, 27, 30, 33, 36, 39, 42, 45, 48, 51, 54, 57
        , 60, 63, 66, 69, 72, 75, 78, 81, 84, 87, 90, 93, 96, 99,

        Divided by 5:
        5, 10, 15, 20, 25, 30, 35, 40, 45, 50, 55, 60, 65, 70, 75, 80, 85, 90,
        95,

        Divided by 3 & 5:
        15, 30, 45, 60, 75, 90,
         */

        // Print numbers that are divisible by 3
        System.out.println("\nDivided by 3: ");
        for (int num = 1; num < 100; num++) {
            if (num % 3 == 0) {
                System.out.print(num + ", ");
            }
        }

        // Print numbers that are divisible by 5
        System.out.println("\n\nDivided by 5: ");
        for (int num = 1; num < 100; num++) {
            if (num % 5 == 0) {
                System.out.print(num + ", ");
            }
        }

        // Print numbers that are divisible by both 3 and 5
        System.out.println("\n\nDivided by 3 & 5: ");
        for (int num = 1; num < 100; num++) {
            if (num % 3 == 0 && num % 5 == 0) {
                System.out.print(num + ", ");
            }
        }
        System.out.println("\n");
    }
}