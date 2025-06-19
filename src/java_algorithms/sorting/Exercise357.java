package java_algorithms.sorting;

/*
  Exercise 357:
  Write a Java program to sort an array of given integers using the Heap Sort algorithm.

  Sample Output:
  Sorted array:
  -5 0 1 2 3 7 45
 */

public class Exercise357 {

    // Public method to perform heap sort
    public static void heapSort(int[] array) {
        int size = array.length;

        // Step 1: Build max heap
        buildMaxHeap(array, size);

        // Step 2: Extract elements from heap one by one
        for (int end = size - 1; end > 0; end--) {
            swap(array, 0, end);         // Move current root to end
            siftDown(array, 0, end - 1); // Restore heap property
        }
    }

    // Build max heap from the input array
    private static void buildMaxHeap(int[] array, int size) {
        int start = (size - 2) / 2; // Last parent node

        while (start >= 0) {
            siftDown(array, start, size - 1);
            start--;
        }
    }

    // Sift down the node at index 'start' to restore heap property
    private static void siftDown(int[] array, int start, int end) {
        int root = start;

        while ((root * 2 + 1) <= end) {
            int child = root * 2 + 1;

            // If right child exists and is greater than left child
            if (child + 1 <= end && array[child] < array[child + 1]) {
                child++;
            }

            // If child is greater than root, swap them
            if (array[root] < array[child]) {
                swap(array, root, child);
                root = child; // Continue sifting down the child
            } else {
                return;
            }
        }
    }

    // Swap elements at indices i and j
    private static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    // Driver method to test heap sort
    public static void main(String[] args) {
        int[] numbers = {7, -5, 3, 2, 1, 0, 45};

        System.out.println("Original Array:");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println();

        heapSort(numbers);

        System.out.println("Sorted Array:");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
    }
}

