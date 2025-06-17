package javaunit_test;

/*
  Exercise 343:
  Write a Java program to explore strategies for testing private methods in a class.

  Strategy used:
  - Reflection is used to access and invoke a private method during testing.
  - This allows validating internal logic not exposed via public methods.

  Sample Output:
  Result from public method: 8
  Result from private method: 8
 */

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Exercise343 {

    // Private method not normally accessible
    private int addTwoNumbers(int x, int y) {
        return x + y;
    }

    // Public method used in production, delegates to private method
    public int performAddition(int x, int y) {
        return addTwoNumbers(x, y);
    }

    // Reflection-based method to test the private method
    public static int invokePrivateAddMethod(Exercise343 instance, int x, int y)
            throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {

        Class<?> clazz = instance.getClass();
        Method privateAddMethod = clazz.getDeclaredMethod("addTwoNumbers", int.class, int.class);
        privateAddMethod.setAccessible(true);
        return (int) privateAddMethod.invoke(instance, x, y);
    }

    public static void main(String[] args) {
        Exercise343 calculator = new Exercise343();

        // Test public method
        int result = calculator.performAddition(3, 5);
        System.out.println("Result from public method: " + result);

        // Test private method using reflection
        try {
            int reflectedResult = invokePrivateAddMethod(calculator, 3, 5);
            System.out.println("Result from private method: " + reflectedResult);
        } catch (NoSuchMethodException | IllegalAccessException | InvocationTargetException e) {
            e.printStackTrace();
        }
    }
}
