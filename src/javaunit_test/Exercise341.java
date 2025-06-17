package javaunit_test;

/*
  Exercise 341:
  Write a Java test case that is intentionally ignored, and explain the scenarios
  where test skipping might be useful.

  Scenarios where skipping tests is useful:
  - The test depends on an unimplemented feature.
  - The test is flaky or unstable and needs fixing.
  - External dependencies (e.g., a database or API) are temporarily unavailable.

  Sample Output:
  All tests passed successfully.
 */

import org.junit.Test;
import org.junit.Ignore;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class Exercise341 {

    @Test
    public void testWithValidInput() {
        // Simulate test for valid input scenario
        System.out.println("Running testWithValidInput...");
    }

    @Ignore("Test is ignored intentionally — feature not implemented yet.")
    @Test
    public void testWithInvalidInput() {
        // This test is intentionally skipped
        System.out.println("This test should be ignored.");
    }

    public static void main(String[] args) {
        Result result = JUnitCore.runClasses(Exercise341.class);

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
