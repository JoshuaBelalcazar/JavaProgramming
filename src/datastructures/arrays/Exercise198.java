package datastructures.arrays;

/*
Exercise 198:
Write a Java program to add two matrices of the same size.
*/

import java.util.Scanner;

public class Exercise198 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input matrix dimensions
        System.out.print("Input number of rows of the matrix: ");
        int rows = scanner.nextInt();

        System.out.print("Input number of columns of the matrix: ");
        int cols = scanner.nextInt();

        // Initialize matrices
        int[][] matrix1 = new int[rows][cols];
        int[][] matrix2 = new int[rows][cols];
        int[][] sum = new int[rows][cols];

        // Input elements of the first matrix
        System.out.println("Input elements of the first matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix1[i][j] = scanner.nextInt();
            }
        }

        // Input elements of the second matrix
        System.out.println("Input elements of the second matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix2[i][j] = scanner.nextInt();
            }
        }

        // Compute sum of the matrices
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                sum[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }

        // Output the result
        System.out.println("Sum of the matrices:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(sum[i][j] + "\t");
            }
            System.out.println();
        }

        scanner.close();
    }
}
