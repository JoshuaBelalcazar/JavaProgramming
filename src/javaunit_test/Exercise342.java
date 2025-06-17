package javaunit_test;

/*
  Exercise 342:
  Write a Java program that uses assertions with custom error messages
  to provide meaningful feedback when a test fails.

  Sample Output:
  All tests passed successfully.
 */

import org.junit.Test;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class Exercise342 {

    @Test
    public void testAdditionOperation() {
        int sum = add(2, 3);
        assertWithMessage("Addition failed: Expected 5 but got " + sum, sum == 5);
    }

    @Test
    public void testMultiplicationOperation() {
        int product = multiply(2, 3);
        assertWithMessage("Multiplication failed: Expected 6 but got " + product, product == 6);
    }

    private int add(int a, int b) {
        return a + b;
    }

    private int multiply(int a, int b) {
        return a * b;
    }

    private static void assertWithMessage(String message, boolean condition) {
        assert condition : message;
    }

    public static void main(String[] args) {
        Result result = JUnitCore.runClasses(Exercise342.class);

        if (result.getFailureCount() > 0) {
            System.out.println("Test failed:");
            for (Failure failure : result.getFailures()) {
                System.out.println(failure.toString());
            }
        } else {
            System.out.println("All tests passed successfully.");
        }
    }
}

