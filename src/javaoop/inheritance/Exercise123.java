package javaoop.inheritance;

/*
Exercise 122:
Write a Java program to create a class hierarchy for employees of a company.
The base class should be Employee, with subclasses Manager, Developer, and Programmer.
Each subclass should have properties such as name, address, salary, and job title.
Implement methods for calculating bonuses, generating performance reports, and managing projects.

Expected Output:
Manager's Bonus: $12000.0
Developer's Bonus: $7200.0
Programmer's Bonus: $9120.0
Performance report for Manager Avril Aroldo: Excellent
Performance report for Developer Iver Dipali: Good
Performance report for Programmer Yaron Gabriel: Excellent
Manager Avril Aroldo is managing a project.
Developer Iver Dipali is writing code in Java
Programmer Yaron Gabriel is debugging code in Python
*/

public class Exercise123 {
    public static void main(String[] args) {
        // Create instances of Manager, Developer, and Programmer with sample data
        Manager manager = new Manager("Avril Aroldo", "1 ABC St", 80000.0, "Manager", 5);
        Developer developer = new Developer("Iver Dipali", "2 PQR St", 72000.0, "Developer", "Java");
        Programmer programmer = new Programmer("Yaron Gabriel", "3 ABC St", 76000.0, "Python");

        // Print bonuses
        System.out.println("Manager's Bonus: $" + manager.calculateBonus());
        System.out.println("Developer's Bonus: $" + developer.calculateBonus());
        System.out.println("Programmer's Bonus: $" + programmer.calculateBonus());
        System.out.println();

        // Print performance reports
        System.out.println(manager.generatePerformanceReport());
        System.out.println(developer.generatePerformanceReport());
        System.out.println(programmer.generatePerformanceReport());
        System.out.println();

        // Call custom methods specific to each subclass
        manager.manageProject();
        developer.writeCode();
        programmer.debugCode();
    }

    // Private static abstract class Employee to avoid conflicts
    private static abstract class Employee {
        private final String name;
        private final String address;
        private final double salary;
        private final String jobTitle;

        public Employee(String name, String address, double salary, String jobTitle) {
            this.name = name;
            this.address = address;
            this.salary = salary;
            this.jobTitle = jobTitle;
        }

        public String getName() {
            return name;
        }

        public String getAddress() {
            return address;
        }

        public double getSalary() {
            return salary;
        }

        public String getJobTitle() {
            return jobTitle;
        }

        // Default bonus calculation; to be overridden by subclasses
        public abstract double calculateBonus();

        // Default performance report; to be overridden by subclasses
        public abstract String generatePerformanceReport();
    }

    // Private static inner class Manager extends Employee
    private static class Manager extends Employee {
        private final int numberOfSubordinates;

        public Manager(String name, String address, double salary, String jobTitle, int numberOfSubordinates) {
            super(name, address, salary, jobTitle);
            this.numberOfSubordinates = numberOfSubordinates;
        }

        public int getNumberOfSubordinates() {
            return numberOfSubordinates;
        }

        @Override
        public double calculateBonus() {
            // Manager bonus is 15% of salary
            return getSalary() * 0.15;
        }

        @Override
        public String generatePerformanceReport() {
            return "Performance report for Manager " + getName() + ": Excellent";
        }

        // Custom method for managing projects
        public void manageProject() {
            System.out.println("Manager " + getName() + " is managing a project.");
        }
    }

    // Private static inner class Developer extends Employee
    private static class Developer extends Employee {
        private final String programmingLanguage;

        public Developer(String name, String address, double salary, String jobTitle, String programmingLanguage) {
            super(name, address, salary, jobTitle);
            this.programmingLanguage = programmingLanguage;
        }

        public String getProgrammingLanguage() {
            return programmingLanguage;
        }

        @Override
        public double calculateBonus() {
            // Developer bonus is 10% of salary
            return getSalary() * 0.10;
        }

        @Override
        public String generatePerformanceReport() {
            return "Performance report for Developer " + getName() + ": Good";
        }

        // Custom method for writing code
        public void writeCode() {
            System.out.println("Developer " + getName() + " is writing code in " + programmingLanguage);
        }
    }

    // Private static inner class Programmer extends Developer
    private static class Programmer extends Developer {
        public Programmer(String name, String address, double salary, String programmingLanguage) {
            // Job title is set to "Programmer" automatically
            super(name, address, salary, "Programmer", programmingLanguage);
        }

        @Override
        public double calculateBonus() {
            // Programmer bonus is 12% of salary
            return getSalary() * 0.12;
        }

        @Override
        public String generatePerformanceReport() {
            return "Performance report for Programmer " + getName() + ": Excellent";
        }

        // Custom method for debugging code
        public void debugCode() {
            System.out.println("Programmer " + getName() + " is debugging code in " + getProgrammingLanguage());
        }
    }
}
