package recursion;

/*
Exercise 81:
Write a Java recursive method to generate all possible permutations of a given string.

Test Data:
Input string: "abc"

Expected Output:
Permutations of "abc":
abc
acb
bac
bca
cab
cba
*/

import java.util.ArrayList;
import java.util.List;

public class Exercise81 {

    // Public method to generate all permutations of the given string
    public static List<String> generatePermutations(String str) {
        List<String> permutations = new ArrayList<>();
        generatePermutationsHelper(str, "", permutations);
        return permutations;
    }

    // Recursive helper method to generate permutations
    private static void generatePermutationsHelper(String str, String current, List<String> permutations) {
        // Base case: if the string is empty, add the current permutation to the list
        if (str.isEmpty()) {
            permutations.add(current);
            return;
        }

        // Recursive case: for each character in the string, generate permutations
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            String remaining = str.substring(0, i) + str.substring(i + 1);
            generatePermutationsHelper(remaining, current + ch, permutations);
        }
    }

    public static void main(String[] args) {
        String input = "abc";
        List<String> permutations = generatePermutations(input);
        System.out.println("Permutations of \"" + input + "\":");
        for (String permutation : permutations) {
            System.out.println(permutation);
        }
    }
}
