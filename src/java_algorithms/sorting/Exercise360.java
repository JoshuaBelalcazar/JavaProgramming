package java_algorithms.sorting;
import java.util.Random;

/*
  Exercise 360:
  Write a Java program to sort an array of positive integers using the Bead Sort Algorithm.

  Sample Output:
  Unsorted: 8 2 2 3 4 6 7 8 4 0 8

  * * * * * * * *
  * * * * * * * *
  * * * * * * * *
  * * * * * * * _
  * * * * * * _ _
  * * * * _ _ _ _
  * * * * _ _ _ _
  * * * _ _ _ _ _
  * * _ _ _ _ _ _
  * * _ _ _ _ _ _
  _ _ _ _ _ _ _ _

  Sorted: 0 2 2 3 4 4 6 7 8 8 8
 */


public class Exercise360 {

    public static void main(String[] args) {
        Exercise360 sorter = new Exercise360();

        int[] array = new int[new Random().nextInt(11) + 5];
        for (int i = 0; i < array.length; i++) {
            array[i] = new Random().nextInt(10); // Random integers from 0 to 9
        }

        System.out.print("Unsorted: ");
        sorter.display1D(array);

        int[] sorted = sorter.beadSort(array);
        System.out.print("Sorted: ");
        sorter.display1D(sorted);
    }

    // Bead sort implementation
    public int[] beadSort(int[] array) {
        if (array.length == 0) return new int[0];

        int max = 0;
        for (int value : array) {
            if (value > max) max = value;
        }

        char[][] grid = new char[array.length][max];
        int[] levelCount = new int[max];

        // Initialize grid with '_'
        for (int col = 0; col < max; col++) {
            levelCount[col] = 0;
            for (int row = 0; row < array.length; row++) {
                grid[row][col] = '_';
            }
        }

        // Drop the beads
        for (int row = 0; row < array.length; row++) {
            int beads = array[row];
            for (int col = 0; beads > 0; col++) {
                grid[levelCount[col]++][col] = '*';
                beads--;
            }
        }

        System.out.println("\n");
        display2D(grid);

        // Count the beads in each row from bottom up
        int[] sorted = new int[array.length];
        for (int row = 0; row < array.length; row++) {
            int count = 0;
            for (int col = 0; col < max && grid[array.length - 1 - row][col] == '*'; col++) {
                count++;
            }
            sorted[row] = count;
        }

        return sorted;
    }

    // Utility to print 1D integer array
    public void display1D(int[] array) {
        for (int value : array) {
            System.out.print(value + " ");
        }
        System.out.println();
    }

    // Utility to print 1D character array
    public void display1D(char[] array) {
        for (char ch : array) {
            System.out.print(ch + " ");
        }
        System.out.println();
    }

    // Utility to print 2D character grid
    public void display2D(char[][] grid) {
        for (char[] row : grid) {
            display1D(row);
        }
        System.out.println();
    }
}

