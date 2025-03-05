package recursion;

/*
Exercise 76:
Write a Java recursive method to reverse a given string.

Test Data:
Input string: Java, World!

Expected Output:
Original string: Java, World!
Reversed string: !dlroW ,avaJ
*/

public class Exercise76 {
    // Recursive method to reverse a string
    public static String reverseString(String str) {
        // Base case: a string that is empty or has a single character is its own reverse
        if (str == null || str.length() <= 1) {
            return str;
        }
        // Recursive case: reverse the substring (excluding the first character) and append the first character at the end
        return reverseString(str.substring(1)) + str.charAt(0);
    }

    public static void main(String[] args) {
        String input = "Java, World!";
        String reversed = reverseString(input);
        System.out.println("Original string: " + input);
        System.out.println("Reversed string: " + reversed);
    }
}
