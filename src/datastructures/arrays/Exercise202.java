package datastructures.arrays;

/*
Exercise 202:
Write a Java program to find the length of the longest consecutive elements sequence from an unsorted array of integers.
Sample array: [49, 1, 3, 200, 2, 4, 70, 5]
The longest consecutive elements sequence is [1, 2, 3, 4, 5], therefore the program will return its length 5.
*/

import java.util.HashSet;
import java.util.Arrays;

public class Exercise202 {
    public static void main(String[] args) {
        int[] nums = {49, 1, 3, 200, 2, 4, 70, 5};

        System.out.println("Original array length: " + nums.length);
        System.out.println("Array elements are: " + Arrays.toString(nums));

        int longest = findLongestConsecutiveSequence(nums);
        System.out.println("The new length of the array is: " + longest);
    }

    // Method to find the longest consecutive sequence length
    public static int findLongestConsecutiveSequence(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }

        int maxLen = 0;

        for (int num : nums) {
            // Only begin checking if this number is the start of a sequence
            if (!set.contains(num - 1)) {
                int currentNum = num;
                int currentStreak = 1;

                while (set.contains(currentNum + 1)) {
                    currentNum++;
                    currentStreak++;
                }

                maxLen = Math.max(maxLen, currentStreak);
            }
        }

        return maxLen;
    }
}

