package constructors;
/*
Exercise 89:
Write a Java program to create a class called "Student" with instance variables studentId, studentName, and grade.
Implement a default constructor and a parameterized constructor that takes all three instance variables.
Use constructor chaining to initialize the variables. Print the values of the variables.

Expected Output:
Student1 ID: 0
Student1 Name: Unknown
Student1 Grade: None
Student2 ID: 101
Student2 Name: Cullen
Student2 Grade: A
*/

public class Exercise89 {
    public static void main(String[] args) {
        // Create a Student object using the default constructor
        Student student1 = new Student();
        System.out.println("Student1 ID: " + student1.getStudentId());
        System.out.println("Student1 Name: " + student1.getStudentName());
        System.out.println("Student1 Grade: " + student1.getGrade());
        System.out.println();

        // Create a Student object using the parameterized constructor
        Student student2 = new Student(101, "Cullen", "A");
        System.out.println("Student2 ID: " + student2.getStudentId());
        System.out.println("Student2 Name: " + student2.getStudentName());
        System.out.println("Student2 Grade: " + student2.getGrade());
    }

    // Private inner class Student to avoid conflicts
    private static class Student {
        // Private instance variables
        private int studentId;
        private String studentName;
        private String grade;

        // Default constructor using constructor chaining
        public Student() {
            this(0, "Unknown", "None");
        }

        // Parameterized constructor that initializes all instance variables
        public Student(int studentId, String studentName, String grade) {
            this.studentId = studentId;
            this.studentName = studentName;
            this.grade = grade;
        }

        // Getter method for studentId
        public int getStudentId() {
            return studentId;
        }

        // Getter method for studentName
        public String getStudentName() {
            return studentName;
        }

        // Getter method for grade
        public String getGrade() {
            return grade;
        }
    }
}
