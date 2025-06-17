package javaunit_test;

/*
  Exercise 338:
  Write a Java test case that implements a JUnit test with setup and teardown methods
  to prepare and clean up resources for multiple test cases.

  Sample Output:
  Setting up resources...
  Cleaning up resources...
  Setting up resources...
  Cleaning up resources...
  All tests passed successfully.
 */

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

import static org.junit.Assert.*;

public class Exercise338 {

    private ResourceHandler resourceHandler;

    // Setup - runs before each test
    @Before
    public void setUp() {
        System.out.println("Setting up resources...");
        resourceHandler = new ResourceHandler();
        resourceHandler.initialize();
    }

    // Teardown - runs after each test
    @After
    public void tearDown() {
        System.out.println("Cleaning up resources...");
        resourceHandler.cleanup();
        resourceHandler = null;
    }

    // Test to ensure resource is initialized correctly
    @Test
    public void testResourceIsInitialized() {
        String result = resourceHandler.getResource();
        assertEquals("Initialized Resource", result);
    }

    // Test to ensure cleanup sets resource to null
    @Test
    public void tes
