package javaoop.java_interfaces;

/*
Exercise 140:
Write a Java program to create an interface Sortable with a method sort(int[] array) that sorts an array of integers in descending order.
Create two classes QuickSort and MergeSort that implement the Sortable interface and provide their own implementations of the sort() method.

Expected Output:
Quick Sort (Descending Order): 9 8 6 5 3 2 1 0
Merge Sort (Descending Order): 9 8 6 5 3 2 1 0
*/

public class Exercise140 {
    public static void main(String[] args) {
        // Create an array of integers for QuickSort
        int[] arr = {9, 5, 2, 8, 0, 3, 1, 6};

        // Create an instance of QuickSort and sort the array in descending order
        Sortable quickSort = new QuickSort();
        quickSort.sort(arr);
        System.out.print("Quick Sort (Descending Order): ");
        printArray(arr);

        // Create another array of integers for MergeSort
        int[] arr2 = {9, 5, 2, 8, 0, 3, 1, 6};

        // Create an instance of MergeSort and sort the array in descending order
        Sortable mergeSort = new MergeSort();
        mergeSort.sort(arr2);
        System.out.print("Merge Sort (Descending Order): ");
        printArray(arr2);
    }

    // Helper method to print the contents of an integer array
    private static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    // Private static interface Sortable to avoid conflicts
    private interface Sortable {
        void sort(int[] array);
    }

    // Private static inner class QuickSort that implements Sortable
    private static class QuickSort implements Sortable {
        @Override
        public void sort(int[] array) {
            quickSort(array, 0, array.length - 1);
        }

        // Recursive QuickSort algorithm to sort in descending order
        private void quickSort(int[] array, int low, int high) {
            if (low < high) {
                int partitionIndex = partition(array, low, high);
                quickSort(array, low, partitionIndex - 1);
                quickSort(array, partitionIndex + 1, high);
            }
        }

        // Partition method for QuickSort: arranges elements in descending order
        private int partition(int[] array, int low, int high) {
            int pivot = array[high];
            int i = low - 1;
            for (int j = low; j < high; j++) {
                if (array[j] >= pivot) { // For descending order, use '>='
                    i++;
                    swap(array, i, j);
                }
            }
            swap(array, i + 1, high);
            return i + 1;
        }

        // Helper method to swap two elements in the array
        private void swap(int[] array, int i, int j) {
            int temp = array[i];
            array[i] = array[j];
            array[j] = temp;
        }
    }

    // Private static inner class MergeSort that implements Sortable
    private static class MergeSort implements Sortable {
        @Override
        public void sort(int[] array) {
            mergeSort(array, 0, array.length - 1);
        }

        // Recursive MergeSort algorithm
        private void mergeSort(int[] array, int low, int high) {
            if (low < high) {
                int mid = (low + high) / 2;
                mergeSort(array, low, mid);
                mergeSort(array, mid + 1, high);
                merge(array, low, mid, high);
            }
        }

        // Merge method to merge two sorted sub-arrays into one sorted array in descending order
        private void merge(int[] array, int low, int mid, int high) {
            int leftSize = mid - low + 1;
            int rightSize = high - mid;

            int[] leftArray = new int[leftSize];
            int[] rightArray = new int[rightSize];

            System.arraycopy(array, low + 0, leftArray, 0, leftSize);
            for (int i = 0; i < rightSize; i++) {
                rightArray[i] = array[mid + 1 + i];
            }

            int i = 0, j = 0, k = low;
            while (i < leftSize && j < rightSize) {
                if (leftArray[i] >= rightArray[j]) { // For descending order, choose the larger element first
                    array[k++] = leftArray[i++];
                } else {
                    array[k++] = rightArray[j++];
                }
            }
            while (i < leftSize) {
                array[k++] = leftArray[i++];
            }
            while (j < rightSize) {
                array[k++] = rightArray[j++];
            }
        }
    }
}

