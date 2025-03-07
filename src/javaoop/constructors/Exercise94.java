package javaoop.constructors;
/*
Exercise 94:
Write a Java program to create a class called Classroom with instance variables className and students (an array of strings).
Implement a parameterized constructor that initializes these variables.
Print the values of the variables.

Expected Output:
Class Name: Science 101
Students: Andrine Ruslan Martin
*/

public class Exercise94 {
    public static void main(String[] args) {
        // Create an array of student names
        String[] studentArray = {"Andrine", "Ruslan", "Martin"};

        // Create a Classroom object using the parameterized constructor
        Classroom classroom = new Classroom("Science 101", studentArray);

        // Print the values of className and students
        classroom.printClassroom();
    }

    // Private static inner class Classroom to avoid conflicts
    private static class Classroom {
        // Private instance variables
        private String className;
        private String[] students;

        // Parameterized constructor that initializes className and students
        public Classroom(String className, String[] students) {
            this.className = className;
            this.students = students;
        }

        // Method to print the values of className and students
        public void printClassroom() {
            System.out.println("Class Name: " + className);
            System.out.print("Students: ");
            for (String student : students) {
                System.out.print(student + " ");
            }
            System.out.println();
        }
    }
}
