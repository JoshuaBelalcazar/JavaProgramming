package javaoop.oop_exercises;

/*
Exercise 165:
Write a Java program to create a class called "Student" with a name, grade, and courses attributes, and methods to add and remove courses.
*/

// Exercise165.java

// Import the ArrayList class from the Java Collections Framework
import java.util.ArrayList;

// Define the Student class
class Student {
    // Declare private variables for name, grade, and courses
    private String name;
    private int grade;
    private ArrayList<String> courses;

    // Constructor for the Student class
    public Student(String name, int grade) {
        this.name = name;
        this.grade = grade;
        this.courses = new ArrayList<>();
    }

    // Getter for the name
    public String getName() {
        return name;
    }

    // Getter for the grade
    public int getGrade() {
        return grade;
    }

    // Getter for the courses
    public ArrayList<String> getCourses() {
        return courses;
    }

    // Method to add a course
    public void addCourse(String course) {
        courses.add(course);
    }

    // Method to remove a course
    public void removeCourse(String course) {
        courses.remove(course);
    }

    // Method to print the details of the student
    public void printStudentDetails() {
        System.out.println("Name: " + name);
        System.out.println("Grade: " + grade);
    }
}

// Define the Exercise165 class
public class Exercise165 {
    public static void main(String[] args) {
        // Create three students
        Student student1 = new Student("Carolus Vitali", 11);
        Student student2 = new Student("Nakeisha Uhuru", 10);
        Student student3 = new Student("Gabriella Cherice", 10);

        // Print student details
        System.out.println("Student Details:");
        student1.printStudentDetails();
        student2.printStudentDetails();
        student3.printStudentDetails();

        // Add courses to student1
        System.out.println("\nAdding courses for " + student1.getName());
        student1.addCourse("Math");
        student1.addCourse("Science");
        student1.addCourse("English");
        System.out.println(student1.getName() + "'s courses: " + student1.getCourses());

        // Add courses to student2
        System.out.println("\nAdding courses for " + student2.getName());
        student2.addCourse("History");
        student2.addCourse("Geography");
        student2.addCourse("English");
        System.out.println(student2.getName() + "'s courses: " + student2.getCourses());

        // Remove a course from student1
        System.out.println("\nRemoving 'Science' course for " + student1.getName());
        student1.removeCourse("Science");
        System.out.println(student1.getName() + "'s courses: " + student1.getCourses());
    }
}

