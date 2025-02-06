package datatypes.Enum;

/*
Exercise 57:
Write a Java program to create an enum called "Weekend" with constants representing the days of the weekend.
*/

public class Exercise57 {
    // Define the enum Weekend with constants for the weekend days
    public enum Weekend {
        SATURDAY,
        SUNDAY
    }

    public static void main(String[] args) {
        // Create variables for each day of the weekend
        Weekend day1 = Weekend.SATURDAY;
        Weekend day2 = Weekend.SUNDAY;

        // Display the weekend days
        System.out.println("First day of the weekend: " + day1);
        System.out.println("Second day of the weekend: " + day2);
    }
}

