package javabasics_I;

public class Exercise15 {
    public static void main(String[] args) {
        /*
        Exercise 15:
        Write a Java program to print odd numbers from 1 to 99. Prints one number per line.
        Sample Output:

        1
        3
        5
        7
        9
        11
        ....

        91
        93
        95
        97
        99
         */
        // Iterate from 1 up to 99
        for (int number = 1; number < 100; number++) {
            // Check if 'number' is odd
            if (number % 2 != 0) {
                // Output the odd value
                System.out.println(number);
            }
        }
    }
}