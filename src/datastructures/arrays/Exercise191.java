package datastructures.arrays;

/*
Exercise 191:
Write a Java program to sort a numeric array and a string array.
*/

import java.util.Arrays;

public class Exercise191 {
    public static void main(String[] args) {
        // Numeric array
        int[] numericArray = {
                1789, 2035, 1899, 1456, 2013,
                1458, 2458, 1254, 1472, 2365,
                1456, 2165, 1457, 2456
        };

        // String array
        String[] stringArray = {
                "Java", "Python", "PHP", "C#", "C Programming", "C++"
        };

        // Print original numeric array
        System.out.println("Original numeric array: " + Arrays.toString(numericArray));

        // Sort numeric array
        Arrays.sort(numericArray);

        // Print sorted numeric array
        System.out.println("Sorted numeric array: " + Arrays.toString(numericArray));

        // Print original string array
        System.out.println("Original string array: " + Arrays.toString(stringArray));

        // Sort string array
        Arrays.sort(stringArray);

        // Print sorted string array
        System.out.println("Sorted string array: " + Arrays.toString(stringArray));
    }
}

