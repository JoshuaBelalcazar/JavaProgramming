package javaoop.nestedclasses;

/*
Exercise 113:
Write a Java program to create an outer class called School with a static nested class Student.
The Student class should have a non-static method displayStudentInfo() that prints the student's name and grade.
Instantiate the Student class from the main method and call the displayStudentInfo() method.

Expected Output:
Student Name: Julius Helga
Grade: A
*/

public class Exercise113 {
    public static void main(String[] args) {
        // Instantiate the static nested class Student from School
        School.Student student = new School.Student("Julius Helga", "A");
        // Call the method to display student information
        student.displayStudentInfo();
    }

    // Private static outer class School to avoid conflicts
    private static class School {
        // Static nested class Student
        public static class Student {
            // Instance variables for student's name and grade
            private String name;
            private String grade;

            // Constructor for Student class
            public Student(String name, String grade) {
                this.name = name;
                this.grade = grade;
            }

            // Non-static method to display student information
            public void displayStudentInfo() {
                System.out.println("Student Name: " + name);
                System.out.println("Grade: " + grade);
            }
        }
    }
}
