package recursion;

/*
Exercise 78:
Write a Java recursive method to count the number of occurrences of a specific element in an array.

Expected Output:
The number of occurrences of 20 in the array is: 3
*/

public class Exercise78 {

    // Public method to start the recursive count
    public static <T> int countOccurrences(T[] arr, T target) {
        return countOccurrences(arr, target, 0);
    }

    // Recursive helper method that counts occurrences starting at a given index
    private static <T> int countOccurrences(T[] arr, T target, int index) {
        // Base case: if index reaches the end of the array, return 0
        if (index == arr.length) {
            return 0;
        }
        // Recursive case: count occurrences in the remainder of the array
        int count = countOccurrences(arr, target, index + 1);
        // If the current element equals the target, increment the count
        if (arr[index].equals(target)) {
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        // Test array of integers
        Integer[] numbers = { 10, 20, 30, 40, 20, 50, 20, 60 };
        int target = 20;
        int occurrences = countOccurrences(numbers, target);
        System.out.println("The number of occurrences of " + target + " in the array is: " + occurrences);
    }
}
