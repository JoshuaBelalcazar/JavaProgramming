package javaunit_test;

/*
  Exercise 337:
  Write a Java test case to verify that a specific exception is thrown
  when a method is called with invalid input.

  Sample Output:
  All tests passed successfully.
 */

import org.junit.Test;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

import static org.junit.Assert.*;

public class Exercise337 {

    // Class with a method that may throw an exception
    public static class Divider {
        public int divide(int numerator, int denominator) {
            if (denominator == 0) {
                throw new ArithmeticException("Cannot divide by zero");
            }
            return numerator / denominator;
        }
    }

    // Test to verify ArithmeticException is thrown when dividing by zero
    @Test(expected = ArithmeticException.class)
    public void testDivideByZeroThrowsException() {
        Divider divider = new Divider();
        divider.divide(10, 0);  // Should throw ArithmeticException
    }

    // Main method to run the test
    public static void main(String[] args) {
        Result testResult = JUnitCore.runClasses(Exercise337.class);

        if (testResult.getFailureCount() > 0) {
            System.out.println("Test failed:");
            for (Failure failure : testResult.getFailures()) {
                System.out.println(failure.toString());
            }
        } else {
            System.out.println("All tests passed successfully.");
        }
    }
}
