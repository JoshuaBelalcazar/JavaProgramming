package javaoop.abstraction;

/*
Exercise 132:
Write a Java program to create an abstract class Instrument with abstract methods play() and tune().
Create subclasses for Glockenspiel and Violin that extend the Instrument class and implement the respective methods
to play and tune each instrument.

Expected Output:
Glockenspiel: Playing the notes on the metal bars.
Glockenspiel: Tuning the metal bars to the correct pitch.
Violin: Playing the strings with a bow or fingers.
Violin: Tuning the strings to the correct pitch.
*/

public class Exercise132 {
    public static void main(String[] args) {
        // Create an instance of Glockenspiel as an Instrument
        Instrument glockenspiel = new Glockenspiel();
        // Create an instance of Violin as an Instrument
        Instrument violin = new Violin();

        // Call play and tune methods on Glockenspiel
        glockenspiel.play();
        glockenspiel.tune();
        System.out.println();

        // Call play and tune methods on Violin
        violin.play();
        violin.tune();
    }

    // Private static abstract inner class Instrument to avoid conflicts
    private static abstract class Instrument {
        // Abstract method play, to be implemented by subclasses
        public abstract void play();

        // Abstract method tune, to be implemented by subclasses
        public abstract void tune();
    }

    // Private static inner class Glockenspiel that extends Instrument
    private static class Glockenspiel extends Instrument {
        @Override
        public void play() {
            System.out.println("Glockenspiel: Playing the notes on the metal bars.");
        }

        @Override
        public void tune() {
            System.out.println("Glockenspiel: Tuning the metal bars to the correct pitch.");
        }
    }

    // Private static inner class Violin that extends Instrument
    private static class Violin extends Instrument {
        @Override
        public void play() {
            System.out.println("Violin: Playing the strings with a bow or fingers.");
        }

        @Override
        public void tune() {
            System.out.println("Violin: Tuning the strings to the correct pitch.");
        }
    }
}
