package datatypes.Enum;

/*
Exercise 59:
Write a Java program to implement an enum called "Direction" with constants representing the cardinal directions (North, South, East, West).
*/

public class Exercise59 {
    // Define the enum Direction with constants for the four cardinal directions
    public enum Direction {
        NORTH,
        SOUTH,
        EAST,
        WEST
    }

    public static void main(String[] args) {
        // Create enum variables for demonstration
        Direction direction1 = Direction.NORTH;
        Direction direction2 = Direction.WEST;

        // Print the selected directions
        System.out.println("First direction: " + direction1);
        System.out.println("Second direction: " + direction2);
    }
}
