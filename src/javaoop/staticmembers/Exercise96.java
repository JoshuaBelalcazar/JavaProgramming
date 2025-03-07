package javaoop.staticmembers;

/*
Exercise 96:
Write a Java program to create a class called "Counter" with a static variable count.
Implement a constructor that increments count every time an object is created.
Print the value of count after creating several objects.

Expected Output:
Count: 3
*/

public class Exercise96 {
    public static void main(String[] args) {
        // Create several Counter objects
        Counter c1 = new Counter();
        Counter c2 = new Counter();
        Counter c3 = new Counter();

        // Print the value of count
        System.out.println("Count: " + Counter.getCount());
    }

    // Private static inner class Counter to avoid conflicts
    private static class Counter {
        // Static variable to keep track of the number of instances created
        private static int count = 0;

        // Constructor that increments the count each time an object is created
        public Counter() {
            count++;
        }

        // Static method to retrieve the current count
        public static int getCount() {
            return count;
        }
    }
}
