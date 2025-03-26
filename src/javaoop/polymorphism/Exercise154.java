package javaoop.polymorphism;

// Exercise154.java

// Base class Employee
class Employee {

    // Declare private String variables name and role
    private final String name;
    private final String role;

    // Constructor for Employee class that takes name and role as parameters
    public Employee(String name, String role) {
        this.name = name;
        this.role = role;
    }

    // Public method to get the name of the employee
    public String getName() {
        return name;
    }

    // Public method to get the role of the employee
    public String getRole() {
        return role;
    }

    // Public method to calculate the salary of the employee
    public double calculateSalary() {
        return 0.0;
    }
}

// Subclass Manager
class Manager extends Employee {

    // Declare private double variables baseSalary and bonus
    private final double baseSalary;
    private final double bonus;

    // Constructor for Manager class that takes name, baseSalary, and bonus as parameters
    public Manager(String name, double baseSalary, double bonus) {
        super(name, "Manager");
        this.baseSalary = baseSalary;
        this.bonus = bonus;
    }

    // Override the calculateSalary method from the Employee class
    @Override
    public double calculateSalary() {
        return baseSalary + bonus;
    }
}

// Subclass Programmer
class Programmer extends Employee {

    // Declare private double variables baseSalary and overtimePay
    private final double baseSalary;
    private final double overtimePay;

    // Constructor for Programmer class that takes name, baseSalary, and overtimePay as parameters
    public Programmer(String name, double baseSalary, double overtimePay) {
        super(name, "Programmer");
        this.baseSalary = baseSalary;
        this.overtimePay = overtimePay;
    }

    // Override the calculateSalary method from the Employee class
    @Override
    public double calculateSalary() {
        return baseSalary + overtimePay;
    }
}

// Main class
public class Exercise154 {

    // Main method that serves as the entry point for the application
    public static void main(String[] args) {

        // Create a Manager object with name "Lilo Heidi", baseSalary 7500.0, and bonus 1500.0
        Employee emp1 = new Manager("Lilo Heidi", 7500.0, 1500.0);

        // Create a Programmer object with name "Margrit Cathrin", baseSalary 5000.0, and overtimePay 600.0
        Employee emp2 = new Programmer("Margrit Cathrin", 5000.0, 600.0);

        // Print the name, role, and salary of the Manager object
        System.out.println("Manager: " + emp1.getName() + "\nRole: " + emp1.getRole() + "\nSalary: $" + emp1.calculateSalary());

        // Print the name, role, and salary of the Programmer object
        System.out.println("\nProgrammer: " + emp2.getName() + "\nRole: " + emp2.getRole() + "\nSalary: $" + emp2.calculateSalary());
    }
}

