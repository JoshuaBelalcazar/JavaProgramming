package javabasics_II;

public class Exercise21 {
    /*
    Exercise 21:
    Write a Java program to find the value of a specified expression.

    a) 101 + 0) / 3
    b) 3.0e-6 * 10000000.1
    c) true && true
    d) false && true
    e) (false && false) || (true && true)
    f) (false || false) && (true && true)

    Expected Output :
    (101 + 0) / 3)-> 33
    (3.0e-6 * 10000000.1)-> 30.0000003
    (true && true)-> true
    (false && true)-> false
    ((false && false) || (true && true))-> true
    (false || false) && (true && true)-> false

     */
    public static void main(String[] args) {


        // Part a: (101 + 0) / 3
        int firstResult = (101 + 0) / 3;

        // Part b: 3.0e-6 * 10000000.1
        double secondResult = 3.0e-6 * 10000000.1;

        // Part c: true && true
        boolean thirdResult = true && true;

        // Part d: false && true
        boolean fourthResult = false && true;

        // Part e: (false && false) || (true && true)
        boolean fifthResult = (false && false) || (true && true);

        // Part f: (false || false) && (true && true)
        boolean sixthResult = (false || false) && (true && true);

        // Print out the computed values
        System.out.println("(101 + 0) / 3)-> " + firstResult);
        System.out.println("(3.0e-6 * 10000000.1)-> " + secondResult);
        System.out.println("(true && true)-> " + thirdResult);
        System.out.println("(false && true)-> " + fourthResult);
        System.out.println("((false && false) || (true && true))-> " + fifthResult);
        System.out.println("(false || false) && (true && true)-> " + sixthResult);
    }
}