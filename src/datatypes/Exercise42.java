package datatypes;

import java.util.Scanner;
    /*
Exercise 42:
Write a Java program that reads a number in inches and converts it to meters.

The inch is a unit of length in the (British) imperial and United States customary systems of measurement now formally equal to 1/36 yard but usually understood as 1/12 of a foot.
The meter is the base unit of length in some metric systems, including the International System of Units (SI). The SI unit symbol is m.

Note: One inch is 0.0254 meter.

Test Data:
Input a value for inch: 1000
Expected output:

Input a value for inch: 1000
1000.0 inch is 25.4 meters
*/

public class Exercise42 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Input a value for inch: ");
        double inchValue = input.nextDouble();

        double meters = inchValue * 0.0254;
        System.out.println(inchValue + " inch is " + meters + " meters");
    }
}


