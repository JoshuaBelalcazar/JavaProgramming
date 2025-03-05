package recursion;

public class Exercise71 {
    /*
    Exercise 71:
    Write a Java recursive method to calculate the factorial of a given positive integer.

    Sample Output:
    Factorial of 7 is: 5040

    Factorial of 12 is: 479001600
    */


    // Recursive method to calculate factorial
    public static int calculateFactorial(int n) {
        // Base case: factorial of 0 is defined as 1
        if (n == 0) {
            return 1;
        }
        // Recursive case: n! = n * (n-1)!
        return n * calculateFactorial(n - 1);
    }

    public static void main(String[] args) {
        // Calculate and display factorial for 7
        int number = 7;
        int factorial = calculateFactorial(number);
        System.out.println("Factorial of " + number + " is: " + factorial);

        // Calculate and display factorial for 12
        number = 12;
        factorial = calculateFactorial(number);
        System.out.println("\nFactorial of " + number + " is: " + factorial);
    }
}

