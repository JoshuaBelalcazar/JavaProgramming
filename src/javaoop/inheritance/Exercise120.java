package javaoop.inheritance;

/*
Exercise 120:
Write a Java program to create a class known as "Person" with methods called getFirstName() and getLastName().
Create a subclass called Employee that adds a new method named getEmployeeId() and overrides the getLastName() method
to include the employee's job title.
Print the employee details.

Expected Output:
Kortney Rosalee, HR Manager (4451)
Junior Philipa, Software Manager (4452)
*/

public class Exercise120 {
    public static void main(String[] args) {
        // Create two Employee objects with different details
        Employee employee1 = new Employee("Kortney", "Rosalee", 4451, "HR Manager");
        Employee employee2 = new Employee("Junior", "Philipa", 4452, "Software Manager");

        // Print the details of each employee
        System.out.println(employee1.getFirstName() + " " + employee1.getLastName() + " (" + employee1.getEmployeeId() + ")");
        System.out.println(employee2.getFirstName() + " " + employee2.getLastName() + " (" + employee2.getEmployeeId() + ")");
    }

    // Private static inner class Person to avoid conflicts
    private static class Person {
        // Private instance variables
        private final String firstName;
        private final String lastName;

        // Constructor to initialize firstName and lastName
        public Person(String firstName, String lastName) {
            this.firstName = firstName;
            this.lastName = lastName;
        }

        // Method to get the first name
        public String getFirstName() {
            return firstName;
        }

        // Method to get the last name
        public String getLastName() {
            return lastName;
        }
    }

    // Private static inner class Employee extending Person
    private static class Employee extends Person {
        // Private instance variables for employeeId and jobTitle
        private final int employeeId;
        private final String jobTitle;

        // Constructor that initializes firstName, lastName, employeeId, and jobTitle
        public Employee(String firstName, String lastName, int employeeId, String jobTitle) {
            super(firstName, lastName);
            this.employeeId = employeeId;
            this.jobTitle = jobTitle;
        }

        // Method to get the employeeId
        public int getEmployeeId() {
            return employeeId;
        }

        // Override the getLastName method to include the job title
        @Override
        public String getLastName() {
            return super.getLastName() + ", " + jobTitle;
        }
    }
}
