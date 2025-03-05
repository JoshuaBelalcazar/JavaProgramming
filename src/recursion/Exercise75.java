package recursion;

/*
Exercise 75:
Write a Java recursive method to calculate the exponentiation of a number (base) raised to a power (exponent).

Test Data:
Base: 3.5
Exponent: 4

Expected Output:
3.5 raised to the power of 4 is: 150.0625
*/

public class Exercise75 {
    // Recursive method to calculate exponentiation
    public static double calculateExponentiation(double base, int exponent) {
        // Base case: any number raised to the power of 0 is 1
        if (exponent == 0) {
            return 1;
        }
        // Recursive case: multiply base with the exponentiation of (base, exponent-1)
        return base * calculateExponentiation(base, exponent - 1);
    }

    public static void main(String[] args) {
        double base = 3.5;
        int exponent = 4;
        double result = calculateExponentiation(base, exponent);
        System.out.println(base + " raised to the power of " + exponent + " is: " + result);
    }
}
