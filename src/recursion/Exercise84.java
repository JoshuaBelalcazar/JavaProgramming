package recursion;

/*
Exercise 84:
Write a Java recursive method to find the sum of the digits of a given integer.

Test Data:
Input number: 123456

Expected Output:
The sum of the digits of 123456 is: 21
*/

public class Exercise84 {

    // Recursive method to calculate the sum of the digits of a number
    public static int calculateDigitSum(int number) {
        // Base case: if the number is a single digit, return the number itself
        if (number < 10) {
            return number;
        }
        // Recursive case: sum the last digit with the sum of the remaining digits
        int lastDigit = number % 10;
        int remainingNumber = number / 10;
        return lastDigit + calculateDigitSum(remainingNumber);
    }

    public static void main(String[] args) {
        int number = 123456;
        int digitSum = calculateDigitSum(number);
        System.out.println("The sum of the digits of " + number + " is: " + digitSum);
    }
}
