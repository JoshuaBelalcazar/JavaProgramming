package datatypes.Enum;

/*
Exercise 60:
Write a Java program that defines an enum called "Months" with constants representing the months of the year.
*/

public class Exercise60 {
    // Define the enum Months with constants for all months in a year
    public enum Months {
        JANUARY,
        FEBRUARY,
        MARCH,
        APRIL,
        MAY,
        JUNE,
        JULY,
        AUGUST,
        SEPTEMBER,
        OCTOBER,
        NOVEMBER,
        DECEMBER
    }

    public static void main(String[] args) {
        // Create an enum variable for the current month
        Months currentMonth = Months.MAY;
        // Print the current month
        System.out.println("Current month: " + currentMonth);
    }
}
