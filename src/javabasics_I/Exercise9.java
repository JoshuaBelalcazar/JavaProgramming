package javabasics_I;

public class Exercise9 {
    public static void main(String[] args) {
        /*
        Exercise 9:
        Write a Java program to print a face.
        Expected Output

         +"""""+
        [| o o |]
         |  ^  |
         | '-' |
         +-----+

         */
        // Initialize an array to hold the ASCII art lines
        String[] faceData = new String[5];

        // Populate each index with the corresponding line
        faceData[0] = " +\"\"\"\"\"+ ";
        faceData[1] = "[| o o |]";
        faceData[2] = " |  ^  |";
        faceData[3] = " | '-' |";
        faceData[4] = " +-----+";

        // Loop through the array to print each line
        for (int i = 0; i < faceData.length; i++) {
            System.out.println(faceData[i]);
        }
    }
}
