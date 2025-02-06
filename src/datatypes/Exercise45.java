package datatypes;

/*
Exercise 45:
Write a Java program that prints the current time in GMT.

Test Data:
Input the time zone offset to GMT: 256

Expected Output:
Current time is 23:40:24
*/

import java.util.Scanner;

public class Exercise45 {
    public static void main(String[] args) {

        // Create a Scanner object to read the GMT offset
        Scanner input = new Scanner(System.in);
        System.out.print("Input the time zone offset to GMT: ");
        long timeZoneChange = input.nextLong();

        // Get total milliseconds since January 1, 1970
        long totalMilliseconds = System.currentTimeMillis();
        // Convert milliseconds to total seconds
        long totalSeconds = totalMilliseconds / 1000;

        // Calculate current seconds, minutes, and hours
        long currentSecond = totalSeconds % 60;
        long totalMinutes = totalSeconds / 60;
        long currentMinute = totalMinutes % 60;
        long totalHours = totalMinutes / 60;

        // Adjust the current hour based on the time zone offset
        long currentHour = (totalHours + timeZoneChange) % 24;

        // Display the current time in GMT after applying the offset
        System.out.println("Current time is " + currentHour + ":" + currentMinute + ":" + currentSecond);
    }
}
