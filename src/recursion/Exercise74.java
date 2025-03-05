package recursion;

/*
Exercise 74:
Write a Java recursive method to check if a given string is a palindrome.

Sample Output:
madam is a palindrome: true
level is a palindrome: true
java is a palindrome: false
*/

public class Exercise74 {
    // Recursive method to check if a string is a palindrome
    public static boolean isPalindrome(String str) {
        // Base case: a string with length 0 or 1 is a palindrome
        if (str.length() <= 1) {
            return true;
        }

        // Check if the first and last characters are equal
        if (str.charAt(0) != str.charAt(str.length() - 1)) {
            return false;
        }

        // Recursively check the substring excluding the first and last characters
        return isPalindrome(str.substring(1, str.length() - 1));
    }

    public static void main(String[] args) {
        String palindrome1 = "madam";
        System.out.println(palindrome1 + " is a palindrome: " + isPalindrome(palindrome1));

        String palindrome2 = "level";
        System.out.println(palindrome2 + " is a palindrome: " + isPalindrome(palindrome2));

        String notPalindrome = "java";
        System.out.println(notPalindrome + " is a palindrome: " + isPalindrome(notPalindrome));
    }
}
