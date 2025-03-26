package javaoop.abstraction;
/*
Exercise 128:
Write a Java program to create an abstract class Employee with abstract methods calculateSalary() and displayInfo().
Create subclasses Manager and Programmer that extend the Employee class and implement the respective methods to calculate salary
and display information for each role.

Expected Output:
Manager Name: Corona Cadogan
Base Salary: $6000.0
Bonus: $1000.0
Total Salary: $7000.0
---------------------
Programmer Name: Antal Nuka
Base Salary: $5000.0
Overtime Hours: 20
Hourly Rate: $25.0
Total Salary: $5500.0
*/

public class Exercise128 {
    public static void main(String[] args) {
        // Create a Manager object with sample data
        Manager manager = new Manager("Corona Cadogan", "123 Main St", 6000.0, "Manager", 1000.0);
        // Create a Programmer object with sample data
        Programmer programmer = new Programmer("Antal Nuka", "456 Park Ave", 5000.0, "Programmer", 20, 25.0);

        // Display information for the Manager
        manager.displayInfo();
        System.out.println("---------------------");
        // Display information for the Programmer
        programmer.displayInfo();
    }

    // Private static abstract inner class Employee to avoid conflicts
    private static abstract class Employee {
        protected String name;
        protected String address;
        protected double baseSalary;
        protected String jobTitle;

        public Employee(String name, String address, double baseSalary, String jobTitle) {
            this.name = name;
            this.address = address;
            this.baseSalary = baseSalary;
            this.jobTitle = jobTitle;
        }

        // Abstract method to calculate total salary
        public abstract double calculateSalary();

        // Abstract method to display employee information
        public abstract void displayInfo();
    }

    // Private static inner class Manager that extends Employee
    private static class Manager extends Employee {
        private final double bonus;

        public Manager(String name, String address, double baseSalary, String jobTitle, double bonus) {
            super(name, address, baseSalary, jobTitle);
            this.bonus = bonus;
        }

        @Override
        public double calculateSalary() {
            return baseSalary + bonus;
        }

        @Override
        public void displayInfo() {
            System.out.println("Manager Name: " + name);
            System.out.println("Base Salary: $" + baseSalary);
            System.out.println("Bonus: $" + bonus);
            System.out.println("Total Salary: $" + calculateSalary());
        }
    }

    // Private static inner class Programmer that extends Employee
    private static class Programmer extends Employee {
        private final int overtimeHours;
        private final double hourlyRate;

        public Programmer(String name, String address, double baseSalary, String jobTitle, int overtimeHours, double hourlyRate) {
            super(name, address, baseSalary, jobTitle);
            this.overtimeHours = overtimeHours;
            this.hourlyRate = hourlyRate;
        }

        @Override
        public double calculateSalary() {
            return baseSalary + (overtimeHours * hourlyRate);
        }

        @Override
        public void displayInfo() {
            System.out.println("Programmer Name: " + name);
            System.out.println("Base Salary: $" + baseSalary);
            System.out.println("Overtime Hours: " + overtimeHours);
            System.out.println("Hourly Rate: $" + hourlyRate);
            System.out.println("Total Salary: $" + calculateSalary());
        }
    }
}
