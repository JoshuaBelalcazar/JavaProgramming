package recursion;

/*
Exercise 77:
Write a Java recursive method to find the greatest common divisor (GCD) of two numbers.

Test Data:
number1: 16
number2: 18

Expected Output:
The GCD of 16 and 18 is: 2
*/

public class Exercise77 {
    // Recursive method to calculate the greatest common divisor (GCD) of two numbers
    public static int calculateGCD(int num1, int num2) {
        // Base case: if num2 is 0, then GCD is num1
        if (num2 == 0) {
            return num1;
        }
        // Recursive case: compute the remainder and call calculateGCD recursively
        int remainder = num1 % num2;
        return calculateGCD(num2, remainder);
    }

    public static void main(String[] args) {
        int number1 = 16;
        int number2 = 18;
        int gcd = calculateGCD(number1, number2);
        System.out.println("The GCD of " + number1 + " and " + number2 + " is: " + gcd);
    }
}
