package recursion;

/*
Exercise 79:
Write a Java recursive method to find the sum of all odd numbers in an array.

Expected Output:
The sum of all odd numbers in the array is: 25
*/

public class Exercise79 {

    // Public method to initiate the recursive sum calculation
    public static int calculateOddNumberSum(int[] arr) {
        return calculateOddNumberSum(arr, 0);
    }

    // Private recursive helper method that sums odd numbers starting from a given index
    private static int calculateOddNumberSum(int[] arr, int index) {
        // Base case: if the index reaches the end of the array, return 0
        if (index == arr.length) {
            return 0;
        }

        // Recursive case: calculate the sum for the rest of the array
        int sum = calculateOddNumberSum(arr, index + 1);
        // If the current element is odd, add it to the sum
        if (arr[index] % 2 != 0) {
            sum += arr[index];
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] numbers = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        int sum = calculateOddNumberSum(numbers);
        System.out.println("The sum of all odd numbers in the array is: " + sum);
    }
}
