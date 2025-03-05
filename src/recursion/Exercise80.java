package recursion;

/*
Exercise 80:
Write a Java recursive method to find the length of a given string.

Test Data:
Input string: "Java Exercises!"

Expected Output:
The length of the string "Java Exercises!" is: 15
*/

public class Exercise80 {
    // Recursive method to calculate the length of a string
    public static int calculateStringLength(String str) {
        // Base case: if the string is empty, its length is 0
        if (str.isEmpty()) {
            return 0;
        }
        // Recursive case: add 1 for the first character and compute the length of the remaining substring
        return 1 + calculateStringLength(str.substring(1));
    }

    public static void main(String[] args) {
        String input = "Java Exercises!";
        int length = calculateStringLength(input);
        System.out.println("The length of the string \"" + input + "\" is: " + length);
    }
}
