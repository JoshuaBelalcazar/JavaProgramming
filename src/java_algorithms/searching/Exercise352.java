package java_algorithms.searching;

/*
  Exercise 352:
  Write a Java program to find the row and column position of a specified number
  in a given 2-dimensional array. Each row and column in the array is sorted in ascending order.

  Sample Output:
  Position of 39 in the matrix is (3,2)
 */

public class Exercise352 {

    public static void main(String[] args) {
        int[][] matrix = {
                {12, 20, 30, 40},
                {15, 25, 35, 45},
                {24, 29, 39, 51},
                {35, 30, 39, 50},
                {50, 60, 75, 72}
        };

        int target = 39;
        int[] position = searchInSortedMatrix(matrix, matrix.length - 1, 0, target);

        System.out.println("Position of " + target + " in the matrix is (" + position[0] + "," + position[1] + ")");
    }

    /**
     * Recursively searches for the target value in a row-column sorted matrix
     *
     * @param matrix The 2D array to search
     * @param row    The starting row index (typically last row)
     * @param col    The starting column index (typically first column)
     * @param target The value to search for
     * @return An array containing the row and column of the target if found, or {-1, -1} otherwise
     */
    private static int[] searchInSortedMatrix(int[][] matrix, int row, int col, int target) {
        int[] position = {-1, -1};

        if (row < 0 || col >= matrix[0].length) {
            return position;
        }

        if (matrix[row][col] == target) {
            position[0] = row;
            position[1] = col;
            return position;
        } else if (matrix[row][col] > target) {
            return searchInSortedMatrix(matrix, row - 1, col, target);
        } else {
            return searchInSortedMatrix(matrix, row, col + 1, target);
        }
    }
}

