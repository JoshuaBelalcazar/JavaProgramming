package datastructures.arrays;

/*
Exercise 203:
Write a Java program to find all the distinct triplets such that the sum of all the three elements [x, y, z (x ≤ y ≤ z)] equal to a specified number.
Sample array: [1, -2, 0, 5, -1, -4]
Target value: 2
*/

import java.util.*;

public class Exercise203 {
    public static void main(String[] args) {
        int[] input = {1, -2, 0, 5, -1, -4};
        int target = 2;

        List<List<Integer>> result = findTripletsWithSum(input, target);
        System.out.println("Distinct triplets that sum to " + target + ":");
        for (List<Integer> triplet : result) {
            System.out.println(triplet);
        }
    }

    // Method to find all unique triplets that sum to a given target
    public static List<List<Integer>> findTripletsWithSum(int[] nums, int target) {
        Set<List<Integer>> uniqueTriplets = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                for (int k = j + 1; k < nums.length; k++) {
                    if (nums[i] + nums[j] + nums[k] == target) {
                        int[] triplet = {nums[i], nums[j], nums[k]};
                        Arrays.sort(triplet);
                        uniqueTriplets.add(Arrays.asList(triplet[0], triplet[1], triplet[2]));
                    }
                }
            }
        }

        return new ArrayList<>(uniqueTriplets);
    }
}
