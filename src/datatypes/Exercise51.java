package datatypes;

/*
Exercise 51:
Write a Java program to test whether a given double/float value is a finite floating-point value or not.
*/

public class Exercise51 {
    public static void main(String[] args) {
        // Testing with double values
        Double dn1 = 0.000213456321d;
        boolean d1Finite = Double.isFinite(dn1);

        Double dn2 = dn1 / 0;  // This will yield Infinity
        boolean d2Finite = Double.isFinite(dn2);

        Double dn3 = Double.POSITIVE_INFINITY * 0;  // This results in NaN
        boolean d3Finite = Double.isFinite(dn3);

        System.out.println("\nFinite doubles\n--------------");
        System.out.println("Is " + dn1 + " finite? " + d1Finite);
        System.out.println("Is " + dn2 + " (dn1/0) finite? " + d2Finite);
        System.out.println("Is " + dn3 + " (POSITIVE_INFINITY * 0) finite? " + d3Finite);

        // Testing with float values
        Float fn1 = 5.3f;
        boolean f1Finite = Float.isFinite(fn1);

        Float fn2 = fn1 / 0;  // This will yield Infinity
        boolean f2Finite = Float.isFinite(fn2);

        Float fn3 = 0f / 0f;  // This results in NaN
        boolean f3Finite = Float.isFinite(fn3);

        System.out.println("\nFinite floats\n-------------");
        System.out.println("Is " + fn1 + " finite? " + f1Finite);
        System.out.println("Is " + fn2 + " (fn1/0) finite? " + f2Finite);
        System.out.println("Is " + fn3 + " (0f/0f) finite? " + f3Finite);
    }
}
