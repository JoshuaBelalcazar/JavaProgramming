package javaunit_test;

/*
  Exercise 339:
  Write a Java program that implements a parameterized test to verify
  that a method behaves correctly for different input values.

  Sample Output:
  All tests passed successfully.
 */

import org.junit.Test;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runner.RunWith;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

public class Exercise339 {

    // Class under test with a multiplication method
    public static class Multiplier {
        public int multiply(int a, int b) {
            return a * b;
        }
    }

    // Parameterized test class for multiplication method
    @RunWith(Parameterized.class)
    public static class MultiplicationTest {

        private final int factor1;
        private final int factor2;
        private final int expectedProduct;

        // Constructor to receive parameters
        public MultiplicationTest(int factor1, int factor2, int expectedProduct) {
            this.factor1 = factor1;
            this.factor2 = factor2;
            this.expectedProduct = expectedProduct;
        }

        // Define test parameters
        @Parameters
        public static Collection<Object[]> testData() {
            return Arrays.asList(new Object[][]{
                    {2, 3, 6},
                    {5, 5, 25},
                    {-1, 4, -4},
                    {0, 8, 0}
            });
        }

        // Test method using parameterized inputs
        @Test
        public void testMultiplicationResult() {
            Multiplier multiplier = new Multiplier();
            int result = multiplier.multiply(factor1, factor2);
            assertEquals(expectedProduct, result);
        }
    }

    // Main method to run parameterized tests
    public static void main(String[] args) {
        Result result = JUnitCore.runClasses(MultiplicationTest.class);

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

