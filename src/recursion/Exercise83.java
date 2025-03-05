package recursion;

/*
Exercise 83:
Write a Java recursive method to calculate the product of all numbers in an array.

Test Data:
Array: {1, 3, 5, 7}

Expected Output:
The product of all numbers in the array is: 105
*/

public class Exercise83 {

    // Public method that initiates the recursive calculation of the product
    public static int calculateProduct(int[] arr) {
        return calculateProduct(arr, 0, arr.length - 1);
    }

    // Private recursive helper method to compute the product between indices left and right
    private static int calculateProduct(int[] arr, int left, int right) {
        // Base case: if there is only one element in the segment, return that element
        if (left == right) {
            return arr[left];
        }

        // Divide the array segment into two halves
        int mid = (left + right) / 2;
        int productLeft = calculateProduct(arr, left, mid);
        int productRight = calculateProduct(arr, mid + 1, right);

        // Combine the results of the two halves
        return productLeft * productRight;
    }

    public static void main(String[] args) {
        // Define the test array
        int[] array = {1, 3, 5, 7};

        // Calculate the product of all elements in the array
        int product = calculateProduct(array);

        // Display the result
        System.out.println("The product of all numbers in the array is: " + product);
    }
}
