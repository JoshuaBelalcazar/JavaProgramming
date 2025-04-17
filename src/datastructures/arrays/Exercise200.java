package datastructures.arrays;

/*
Exercise 200:
Write a Java program to find a missing number in an array.
*/

public class Exercise200 {

    // Main method
    public static void main(String[] args) {
        // Given array with one number missing from the sequence 1 to 7
        int[] numbers = {1, 2, 3, 4, 6, 7};
        int totalNum = 7;  // The last number in the expected complete sequence

        // Calculate expected sum using arithmetic formula for sum of first N natural numbers
        int expectedSum = totalNum * (totalNum + 1) / 2;

        // Calculate actual sum of the given array
        int actualSum = 0;
        for (int num : numbers) {
            actualSum += num;
        }

        // The missing number is the difference between expected and actual sum
        int missingNumber = expectedSum - actualSum;

        // Output the result
        System.out.println("The missing number is: " + missingNumber);
    }
}
