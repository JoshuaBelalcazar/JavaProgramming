package javabasics_I;

public class Exercise3 {
    public static void main(String[] args) {
        /*
        Exercise 3:
        Write a Java program to print the results of the following operations.
        Test Data:
        a. -5 + 8 * 6
        b. (55+9) % 9
        c. 20 + -3*5 / 8
        d. 5 + 15 / 3 * 2 - 8 % 3

        Expected Output :
        43
        1
        19
        13

        */

        // Expression A: (-5) + (8 * 6)
        int valueA = -5 + 8 * 6;
        System.out.println(valueA);

        // Expression B: (55 + 9) % 9
        int valueB = (55 + 9) % 9;
        System.out.println(valueB);

        // Expression C: 20 + (-3 * 5 / 8)
        int valueC = 20 + -3 * 5 / 8;
        System.out.println(valueC);

        // Expression D: 5 + (15 / 3 * 2) - (8 % 3)
        int valueD = 5 + 15 / 3 * 2 - 8 % 3;
        System.out.println(valueD);
    }
}
