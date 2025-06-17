package javaunit_test;

/*
  Exercise 344:
  Write a Java program that tests a singleton class, ensuring it behaves as expected
  in a multi-threaded environment.

  Sample Output:
  JUnit version 4.10
  .
  Time: 0.114

  OK (1 test)
 */

// Singleton implementation
class SingletonInstance {

    private static volatile SingletonInstance instance;

    private SingletonInstance() {
        // Prevent external instantiation
    }

    public static SingletonInstance getInstance() {
        if (instance == null) {
            synchronized (SingletonInstance.class) {
                if (instance == null) {
                    instance = new SingletonInstance();
                }
            }
        }
        return instance;
    }
}

// Test class
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class Exercise344 {

    @Test
    public void testSingletonMultiThreadedAccess() throws InterruptedException {

        Thread threadOne = new Thread(() -> {
            SingletonInstance instanceA = SingletonInstance.getInstance();
            try {
                Thread.sleep(100); // Simulate processing delay
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            SingletonInstance instanceB = SingletonInstance.getInstance();
            assertEquals(instanceA, instanceB);
        });

        Thread threadTwo = new Thread(() -> {
            SingletonInstance instanceC = SingletonInstance.getInstance();
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            SingletonInstance instanceD = SingletonInstance.getInstance();
            assertEquals(instanceC, instanceD);
        });

        threadOne.start();
        threadTwo.start();

        threadOne.join();
        threadTwo.join();
    }

    public static void main(String[] args) {
        // Run JUnit test from main
        org.junit.runner.JUnitCore.main("Exercise344");
    }
}

