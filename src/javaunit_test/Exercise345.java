package javaunit_test;

/*
  Exercise 345:
  Write a Java program that creates tests to verify the interaction
  between different components or modules in your application.

  Sample Output:
  All tests passed successfully.
 */

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

import static org.junit.Assert.assertEquals;

// Component responsible for user information
class UserService {
    public String getUserFullName(int userId) {
        // Simulated user retrieval (normally from a database)
        return "Carl Mays";
    }
}

// Component responsible for order handling, interacts with UserService
class OrderService {
    private final UserService userService;

    public OrderService(UserService userService) {
        this.userService = userService;
    }

    public String getOrderDetails(int orderId) {
        int userId = 1; // Simulated user lookup
        String userName = userService.getUserFullName(userId);
        return "Order #" + orderId + " for User: " + userName;
    }
}

// Integration test for UserService and OrderService
public class Exercise345 {

    private UserService userService;
    private OrderService orderService;

    @Before
    public void initializeComponents() {
        userService = new UserService();
        orderService = new OrderService(userService);
    }

    @Test
    public void testOrderDetailsIntegration() {
        String details = orderService.getOrderDetails(123);
        assertEquals("Order #123 for User: Carl Mays", details);
    }

    public static void main(String[] args) {
        Result result = JUnitCore.runClasses(Exercise345.class);

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
