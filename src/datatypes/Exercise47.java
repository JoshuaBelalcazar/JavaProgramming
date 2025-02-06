package datatypes;

/*
Exercise 47:
Write a Java program to take the user for a distance (in meters) and the time taken (as three numbers: hours, minutes, seconds), and display the speed, in meters per second, kilometers per hour and miles per hour (hint: 1 mile = 1609 meters).

Test Data:
Input distance in meters: 2500
Input hour: 5
Input minutes: 56
Input seconds: 23

Expected Output:
Your speed in meters/second is 0.11691531
Your speed in km/h is 0.42089513
Your speed in miles/h is 0.26158804
*/

import java.util.Scanner;

public class Exercise47 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Prompt for the distance in meters
        System.out.print("Input distance in meters: ");
        double distance = scanner.nextDouble();

        // Prompt for time components: hours, minutes, and seconds
        System.out.print("Input hour: ");
        double hours = scanner.nextDouble();

        System.out.print("Input minutes: ");
        double minutes = scanner.nextDouble();

        System.out.print("Input seconds: ");
        double seconds = scanner.nextDouble();

        // Convert the total time into seconds
        double totalSeconds = hours * 3600 + minutes * 60 + seconds;

        // Compute the speeds in various units
        double speedMetersPerSecond = distance / totalSeconds;
        double speedKmPerHour = (distance / 1000.0) / (totalSeconds / 3600.0);
        double speedMilesPerHour = speedKmPerHour / 1.609; // 1 mile = 1.609 km

        // Display the results
        System.out.println("Your speed in meters/second is " + speedMetersPerSecond);
        System.out.println("Your speed in km/h is " + speedKmPerHour);
        System.out.println("Your speed in miles/h is " + speedMilesPerHour);
    }
}

