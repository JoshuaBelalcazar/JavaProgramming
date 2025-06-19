package java_algorithms.sorting;

import java.util.*;

public class Exercise363 {

    public static void main(String[] args) {
        int[] numbers = new int[10];
        Random random = new Random();

        // Fill array with random integers between -50 and 49
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(100) - 50;
        }

        System.out.println("Original Array: " + Arrays.toString(numbers));

        bucketSort(numbers);

        System.out.println("Sorted Array:   " + Arrays.toString(numbers));
    }

    // Main Bucket Sort logic
    private static void bucketSort(int[] array) {
        if (array.length == 0) return;

        int min = findMin(array);
        int max = findMax(array);

        int bucketCount = max - min + 1;
        List<List<Integer>> buckets = new ArrayList<>(bucketCount);

        // Initialize empty buckets
        for (int i = 0; i < bucketCount; i++) {
            buckets.add(new ArrayList<>());
        }

        // Distribute elements into buckets
        for (int value : array) {
            int bucketIndex = hash(value, min, bucketCount);
            buckets.get(bucketIndex).add(value);
        }

        // Sort individual buckets
        for (List<Integer> bucket : buckets) {
            Collections.sort(bucket);
        }

        // Merge sorted buckets back into array
        int index = 0;
        for (List<Integer> bucket : buckets) {
            for (int value : bucket) {
                array[index++] = value;
            }
        }
    }

    // Calculate index of bucket for an element
    private static int hash(int value, int min, int bucketCount) {
        return (value - min) / bucketCount;
    }

    // Find maximum value in array
    private static int findMax(int[] array) {
        int max = array[0];
        for (int value : array) {
            if (value > max) max = value;
        }
        return max;
    }

    // Find minimum value in array
    private static int findMin(int[] array) {
        int min = array[0];
        for (int value : array) {
            if (value < min) min = value;
        }
        return min;
    }
}

