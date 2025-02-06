package datatypes.Enum;

/*
Exercise 56:
Write a Java program to create an enum called "DaysOfWeek" representing the days of the week.
*/

public class Exercise56 {
    // Define the enum DaysOfWeek with all days of the week
    public enum DaysOfWeek {
        SUNDAY,
        MONDAY,
        TUESDAY,
        WEDNESDAY,
        THURSDAY,
        FRIDAY,
        SATURDAY
    }

    public static void main(String[] args) {
        // Declare a variable of type DaysOfWeek and assign it a value
        DaysOfWeek today = DaysOfWeek.MONDAY;

        // Print the current day
        System.out.println("Today is " + today);
    }
}

