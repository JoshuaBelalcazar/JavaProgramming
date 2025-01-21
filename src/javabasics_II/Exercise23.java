package javabasics_II;

public class Exercise23 {
          /*
          Exercise 23:
          Write a Java program to print the contents of a two-dimensional Boolean array where t represents true and f represents false.

          Sample array:
          array = {{true, false, true},
          {false, true, false}};
          Expected Output :
          t f t
          f t f
           */
    public static void main(String[] args) {


        // Define a 2D boolean array
        boolean[][] boolGrid = {
                {true, false, true},
                {false, true, false}
        };

        // Determine row and column counts
        int rowCount = boolGrid.length;
        int colCount = boolGrid[0].length;

        // Iterate over each cell in the 2D array
        for (int row = 0; row < rowCount; row++) {
            for (int col = 0; col < colCount; col++) {
                if (boolGrid[row][col]) {
                    // Print 't' if the cell is true
                    System.out.print(" t ");
                } else {
                    // Print 'f' if the cell is false
                    System.out.print(" f ");
                }
            }
            // Move to a new line after finishing a row
            System.out.println();
        }
    }
}