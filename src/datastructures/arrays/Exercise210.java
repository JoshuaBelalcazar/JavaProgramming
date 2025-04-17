package datastructures.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// Define a class to solve the permutation problem
public class Exercise210 {

    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 4};
        System.out.println("\nOriginal array 1: " + Arrays.toString(nums1));
        List<List<Integer>> result1 = new Exercise210().permute(nums1);
        System.out.println("\nPossible permutations of the first array:");
        result1.forEach(System.out::println);

        int[] nums2 = {1, 2, 3};
        System.out.println("\nOriginal array 2: " + Arrays.toString(nums2));
        List<List<Integer>> result2 = new Exercise210().permute(nums2);
        System.out.println("\nPossible permutations of the second array:");
        result2.forEach(System.out::println);
    }

    // Generates all permutations
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        generatePermutations(0, nums, result);
        return result;
    }

    // Recursive helper function to build permutations
    private void generatePermutations(int start, int[] nums, List<List<Integer>> result) {
        if (start == nums.length - 1) {
            List<Integer> permutation = new ArrayList<>();
            for (int num : nums) {
                permutation.add(num);
            }
            result.add(permutation);
        } else {
            for (int i = start; i < nums.length; i++) {
                swap(nums, start, i);  // Choose
                generatePermutations(start + 1, nums, result); // Explore
                swap(nums, start, i);  // Un-choose (backtrack)
            }
        }
    }

    // Swaps two elements in the array
    private void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
