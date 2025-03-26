package javaoop.encapsulation;

/*
Exercise 144:
Write a Java program to create a class called Employee with private instance variables employee_id, employee_name, and employee_salary.
Provide public getter and setter methods to access and modify the id and name variables, but provide a getter method for the salary variable that returns a formatted string.

Expected Output:
Employee Details:
ID: 15
Name: Caelius Dathan
Salary: $4900.00
*/

// Employee.java

// Employee Class
class Employee {
    // Private instance variables for employee_id, employee_name, and employee_salary
    private int employee_id;
    private String employee_name;
    private double employee_salary;

    // Getter method for employee_id
    public int getEmployeeId() {
        return employee_id;
    }

    // Setter method for employee_id
    public void setEmployeeId(int employeeId) {
        this.employee_id = employeeId;
    }

    // Getter method for employee_name
    public String getEmployeeName() {
        return employee_name;
    }

    // Setter method for employee_name
    public void setEmployeeName(String employeeName) {
        this.employee_name = employeeName;
    }

    // Setter method for employee_salary
    public void setEmployeeSalary(double employeeSalary) {
        this.employee_salary = employeeSalary;
    }

    // Method to get formatted salary as a String
    public String getFormattedSalary() {
        return String.format("$%.2f", employee_salary);
    }
}

// Exercise144.java
// This class contains the main method for the exercise
public class Exercise144 {
    public static void main(String[] args) {
        // Create an instance of Employee
        Employee employee = new Employee();

        // Set values using setter methods
        employee.setEmployeeId(15);
        employee.setEmployeeName("Caelius Dathan");
        employee.setEmployeeSalary(4900.0);

        // Print employee details
        System.out.println("Employee Details:");
        System.out.println("ID: " + employee.getEmployeeId());
        System.out.println("Name: " + employee.getEmployeeName());
        System.out.println("Salary: " + employee.getFormattedSalary());
    }
}

