package javaunit_test;

/*
  Exercise 340:
  Write a Java program that implements a JUnit test with a timeout rule
  to verify that a method completes within the specified time limit.

  Sample Output:
  Test failed:
  testLongRunningMethod(Exercise340): test timed out after 2000 milliseconds
 */

import org.junit.Test;
import org.junit.Rule;
import org.junit.rules.Timeout;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class Exercise340 {

    // Set a timeout rule for all test methods in this class (optional if using per-method timeout)
    @Rule
    public Timeout globalTimeout = Timeout.seconds(2); // Timeout in seconds

    // Class containing a time-consuming method
    public static class TaskRunner {
        public void simulateLongTask() {
            try {
                Thread.sleep(3000); // Simulate long-running task (3 seconds)
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    // JUnit test with a method-level timeout (2000 milliseconds = 2 seconds)
    @Test(timeout = 2000)
    public void testLongRunningMethod() {
        TaskRunner runner = new TaskRunner();
        runner.simulateLongTask(); // This should timeout
    }

    // Main method to run the test class
    public static void main(String[] args) {
        Result result = JUnitCore.runClasses(Exercise340.class);

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
