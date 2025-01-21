package javabasics_II;

public class Exercise25 {
    /*
    Exercise 25:
    Write a Java program to prove that Euclid’s algorithm computes the greatest common divisor of two
    integers that have positive values.

    Expected Output:
    result: 24
    result: 1
     */


    // Method to determine the GCD via the Euclidean algorithm
    public static int gcdEuclid(int a, int b) {

        // If one of the values is zero, return 1 as a fallback
        if (a == 0 || b == 0) {
            return 1;
        }

        // Ensure 'a' is the larger number, swapping if necessary
        if (a < b) {
            int swapHolder = a;
            a = b;
            b = swapHolder;
        }

        // If 'a' is exactly divisible by 'b', 'b' is the GCD
        if (a % b == 0) {
            return b;
        } else {
            // Otherwise, recurse with 'b' and the remainder
            return gcdEuclid(b, a % b);
        }
    }

    public static void main(String[] args) {
        // Demonstrate the GCD results for different pairs of integers
        System.out.println("result: " + gcdEuclid(48, 24));
        System.out.println("result: " + gcdEuclid(125463, 9658));
    }
}


