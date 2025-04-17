package datastructures.arrays;

/*
Exercise 199:
Write a Java program to find all pairs of elements in an array whose sum is equal to a specified number.
*/

public class Exercise199 {

    // Method to print all pairs whose sum equals the target value
    public static void pairsWithSum(int[] inputArray, int targetSum) {
        System.out.println("Pairs of elements that sum to " + targetSum + ":");

        // Loop through each element and compare it with every element after it
        for (int i = 0; i < inputArray.length; i++) {
            for (int j = i + 1; j < inputArray.length; j++) {
                if (inputArray[i] + inputArray[j] == targetSum) {
                    System.out.println(inputArray[i] + " + " + inputArray[j] + " = " + targetSum);
                }
            }
        }
        System.out.println();
    }

    // Main method
    public static void main(String[] args) {
        int[] array1 = {2, 7, 4, -5, 11, 5, 20};
        int target1 = 15;

        int[] array2 = {14, -15, 9, 16, 25, 45, 12, 8};
        int target2 = 30;

        pairsWithSum(array1, target1);
        pairsWithSum(array2, target2);
    }
}
