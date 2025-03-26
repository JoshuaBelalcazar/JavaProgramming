package javaoop.java_interfaces;

/*
Exercise 139:
Write a Java program to create an interface Playable with a method play() that takes no arguments and returns void.
Create three classes Football, Volleyball, and Basketball that implement the Playable interface and override the play() method
to play the respective sports.

Expected Output:
Playing football
Playing volleyball
Playing basketball
*/

public class Exercise139 {
    public static void main(String[] args) {
        // Create instances of Playable objects for different sports
        Playable football = new Football();
        Playable volleyball = new Volleyball();
        Playable basketball = new Basketball();

        // Call the play() method on each object
        football.play();
        volleyball.play();
        basketball.play();
    }

    // Private static inner interface Playable to avoid conflicts
    private interface Playable {
        void play();
    }

    // Private static inner class Football that implements Playable
    private static class Football implements Playable {
        @Override
        public void play() {
            System.out.println("Playing football");
        }
    }

    // Private static inner class Volleyball that implements Playable
    private static class Volleyball implements Playable {
        @Override
        public void play() {
            System.out.println("Playing volleyball");
        }
    }

    // Private static inner class Basketball that implements Playable
    private static class Basketball implements Playable {
        @Override
        public void play() {
            System.out.println("Playing basketball");
        }
    }
}

