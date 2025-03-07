
/*
Exercise 86:
Write a Java program that demonstrates the use of a default constructor in a class.
The program creates a Cat object using the default constructor and prints the Cat's name and age using getter methods.

Expected Output:
Cat's Name: Unknown
Cat's Age: 0
*/

package constructors;

// The public class must match the file name (Exercise86.java)
public class Exercise86 {
    public static void main(String[] args) {
        // Create a new Cat object using the default constructor
        Cat myCat = new Cat();

        // Print the values using the getter methods
        System.out.println("Cat's Name: " + myCat.getName());
        System.out.println("Cat's Age: " + myCat.getAge());
    }
}

// Package-private Cat class (not declared public)
class Cat {
    // Private instance variables
    private String name;
    private int age;

    // Default constructor that initializes name and age
    public Cat() {
        this.name = "Unknown";
        this.age = 0;
    }

    // Getter method for name
    public String getName() {
        return name;
    }

    // Getter method for age
    public int getAge() {
        return age;
    }
}
