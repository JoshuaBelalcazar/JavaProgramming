package lambdaexpressions;

/*
Exercise 188:
Write a Java program to implement a lambda expression to sort a list of objects based on a specific attribute.
*/

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Exercise188 {
    public static void main(String[] args) {
        // Create a list of Student objects
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student("Adriana Jamie", 15, "X"));
        studentList.add(new Student("Felix Uisdean", 15, "X"));
        studentList.add(new Student("Conceicao Palmira", 14, "X"));
        studentList.add(new Student("Jair Camila", 14, "X"));
        studentList.add(new Student("Micaela Rosana", 15, "X"));

        // Print original list
        System.out.println("Student details:");
        for (Student s : studentList) {
            System.out.println(s.getName() + " - " + s.getAge() + " - " + s.getSClass());
        }

        // Sort list by student name using lambda
        studentList.sort(Comparator.comparing(Student::getName));

        // Print sorted list
        System.out.println("\nSorted list based on Student Name:");
        for (Student s : studentList) {
            System.out.println(s.getName() + " - " + s.getAge() + " - " + s.getSClass());
        }
    }
}

// Student class with name, age, and class attributes
class Student {
    private String name, sClass;
    private int age;

    public Student(String name, int age, String sClass) {
        this.name = name;
        this.age = age;
        this.sClass = sClass;
    }

    public String getName() {
        return name;
    }

    public String getSClass() {
        return sClass;
    }

    public int getAge() {
        return age;
    }
}
