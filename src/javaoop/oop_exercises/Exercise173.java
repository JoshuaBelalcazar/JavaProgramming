package javaoop.oop_exercises;

/*
Exercise 173:
Write a Java program to create a class called "Course" with attributes for course name, instructor, and credits.
Create a subclass "OnlineCourse" that adds attributes for platform and duration.
Implement methods to display course details and check if the course is eligible for a certificate based on duration.
*/

// Exercise173.java

// Define the Course class
class Course {
    private String courseName;
    private String instructor;
    private int credits;

    // Constructor to initialize the Course object
    public Course(String courseName, String instructor, int credits) {
        this.courseName = courseName;
        this.instructor = instructor;
        this.credits = credits;
    }

    // Method to display course details
    public void displayCourseDetails() {
        System.out.println("Course Name: " + courseName);
        System.out.println("Instructor: " + instructor);
        System.out.println("Credits: " + credits);
    }

    // Getter methods
    public String getCourseName() {
        return courseName;
    }

    public String getInstructor() {
        return instructor;
    }

    public int getCredits() {
        return credits;
    }
}

// Define the OnlineCourse subclass that extends the Course class
class OnlineCourse extends Course {
    private String platform;
    private int duration; // Duration in hours

    // Constructor to initialize the OnlineCourse object
    public OnlineCourse(String courseName, String instructor, int credits, String platform, int duration) {
        super(courseName, instructor, credits); // Call the superclass constructor
        this.platform = platform;
        this.duration = duration;
    }

    // Override the displayCourseDetails method to include platform and duration
    @Override
    public void displayCourseDetails() {
        super.displayCourseDetails();
        System.out.println("Platform: " + platform);
        System.out.println("Duration: " + duration + " hours");
    }

    // Method to check if the course is eligible for a certificate
    public boolean isEligibleForCertificate() {
        return duration >= 10; // Eligible if the course duration is at least 10 hours
    }

    // Getter methods for platform and duration
    public String getPlatform() {
        return platform;
    }

    public int getDuration() {
        return duration;
    }
}

// Main class to test the Course and OnlineCourse classes
public class Exercise173 {
    public static void main(String[] args) {

        // Create a Course object
        Course course = new Course("Java Programming", "Dr. Timaios Pliny", 4);
        course.displayCourseDetails();
        System.out.println();

        // Create an OnlineCourse object
        OnlineCourse onlineCourse = new OnlineCourse("Advanced Java", "Prof. Isacco Lyuba", 4, "Google", 10);
        onlineCourse.displayCourseDetails();
        System.out.println("Eligible for Certificate: " + onlineCourse.isEligibleForCertificate());
    }
}

