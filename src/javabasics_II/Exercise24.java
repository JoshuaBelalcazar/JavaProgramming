package javabasics_II;

public class Exercise24 {
    /*
     Exercise 24:
     Write a Java program to print an array after changing the rows and columns of a two-dimensional array.

     Original Array:
     10 20 30
     40 50 60
     After changing the rows and columns of the said array:10 40
     20 50
     30 60
     */
    public static void main(String[] args) {

        // Define the original 2D array
        int[][] originalMatrix = {{10, 20, 30}, {40, 50, 60}};

        // Print the original array
        System.out.println("Original Array:");
        displayMatrix(originalMatrix);

        // Perform the transpose and show the result
        System.out.println("After changing the rows and columns of the said array:");
        transposeMatrix(originalMatrix);
    }

    // Transpose the given 2D array
    private static void transposeMatrix(int[][] matrix) {
        // Prepare a new 2D array where we'll store the transposed data
        int[][] transposed = new int[matrix[0].length][matrix.length];

        // Fill the transposed array by swapping rows and columns
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[0].length; col++) {
                transposed[col][row] = matrix[row][col];
            }
        }

        // Print the transposed array
        displayMatrix(transposed);
    }

    // Utility method to print a 2D array
    private static void displayMatrix(int[][] matrixData) {
        for (int i = 0; i < matrixData.length; i++) {
            for (int j = 0; j < matrixData[i].length; j++) {
                System.out.print(matrixData[i][j] + " ");
            }
            System.out.println();
        }
    }
}