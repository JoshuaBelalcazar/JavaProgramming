package javaoop.inheritance;

/*
Exercise 117:
Write a Java program to create a class called Employee with methods called work() and getSalary().
Create a subclass called HRManager that overrides the work() method and adds a new method called addEmployee().
Demonstrate the functionality by creating an Employee object and an HRManager object and calling their methods.

Expected Output:
working as an employee!
Employee salary: 40000

Managing employees
Manager salary: 70000

Adding new employee!
*/

public class Exercise117 {
    public static void main(String[] args) {
        // Create an Employee object with a salary of 40000
        Employee emp = new Employee(40000);
        // Create an HRManager object with a salary of 70000
        HRManager mgr = new HRManager(70000);

        // Call the work method on the Employee object and print salary
        emp.work();
        System.out.println("Employee salary: " + emp.getSalary());

        System.out.println();

        // Call the work method on the HRManager object and print salary
        mgr.work();
        System.out.println("Manager salary: " + mgr.getSalary());

        // Call the addEmployee method on the HRManager object
        mgr.addEmployee();
    }

    // Private static inner class Employee to avoid conflicts
    private static class Employee {
        // Private field to store the salary of the employee
        private final int salary;

        // Constructor to initialize the salary of the employee
        public Employee(int salary) {
            this.salary = salary;
        }

        // Method to simulate the employee working
        public void work() {
            System.out.println("working as an employee!");
        }

        // Getter method to retrieve the salary of the employee
        public int getSalary() {
            return salary;
        }
    }

    // Private static inner class HRManager that extends Employee
    private static class HRManager extends Employee {
        // Constructor to initialize the HRManager salary by calling the parent constructor
        public HRManager(int salary) {
            super(salary);
        }

        // Overridden method to simulate the HRManager working
        @Override
        public void work() {
            System.out.println("Managing employees");
        }

        // Method to simulate adding a new employee
        public void addEmployee() {
            System.out.println("Adding new employee!");
        }
    }
}
