package javaoop.nestedclasses;

/*
Exercise 105:
Write a Java program to create an outer class called University with a static nested class Department.
The Department class should have a method "displayInfo()" that prints the department name and the number of faculty members.
Instantiate the Department class from the main method and call the "displayInfo()" method.

Expected Output:
Department: Computer Science
Number of Faculty Members: 50
*/

public class Exercise105 {
    public static void main(String[] args) {
        // Create an instance of the static nested class Department
        University.Department compSciDept = new University.Department("Computer Science", 50);

        // Call the displayInfo() method to print department details
        compSciDept.displayInfo();
    }

    // Private static outer class University to avoid conflicts
    private static class University {
        // Static nested class Department
        static class Department {
            // Instance variables for department name and faculty count
            private String departmentName;
            private int facultyCount;

            // Constructor to initialize the Department object
            public Department(String departmentName, int facultyCount) {
                this.departmentName = departmentName;
                this.facultyCount = facultyCount;
            }

            // Method to display department information
            public void displayInfo() {
                System.out.println("Department: " + departmentName);
                System.out.println("Number of Faculty Members: " + facultyCount);
            }
        }
    }
}
