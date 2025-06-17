package javaunit_test;

/**
 * Exercise 336:
 * Write a Java unit test case to assert that a given method returns the expected value.
 *
 * Sample Output:
 * All tests passed successfully.
 */
public class Exercise336 {
    // Calculator.java
    public class Calculator {
        /**
         * Returns the sum of a and b.
         */
        public int add(int a, int b) {
            return a + b;
        }
    }


// CalculatorTest.java

import org.junit.Test;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

import static org.junit.Assert.assertEquals;

    public class CalculatorTest {

        /**
         * Test that Calculator.add(3, 5) returns 8.
         */
        @Test
        public void testAdd() {
            // Arrange
            Calculator calculator = new Calculator();

            // Act
            int result = calculator.add(3, 5);

            // Assert
            assertEquals("3 + 5 should equal 8", 8, result);
        }

        /**
         * Entry point to run the test from the command line.
         */
        public static void main(String[] args) {
            Result result = JUnitCore.runClasses(CalculatorTest.class);

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
}
