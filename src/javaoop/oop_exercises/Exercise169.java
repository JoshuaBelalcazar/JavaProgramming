package javaoop.oop_exercises;

/*
Exercise 169:
Write a Java program to create a class called "Movie" with attributes for title, director, actors, and reviews, and methods for adding and retrieving reviews.
*/

// Exercise169.java

// Import the ArrayList class from the Java utility package
import java.util.ArrayList;
import java.util.Arrays;

// Define the Movie class
class Movie {

    private String title;
    private String director;
    private ArrayList<String> actors;
    private ArrayList<Review> reviews;

    public Movie(String title, String director, ArrayList<String> actors) {
        this.title = title;
        this.director = director;
        this.actors = actors;
        this.reviews = new ArrayList<Review>();
    }

    public void addReview(Review review) {
        this.reviews.add(review);
    }

    public ArrayList<Review> getReviews() {
        return this.reviews;
    }

    public String getTitle() {
        return this.title;
    }

    public String getDirector() {
        return this.director;
    }

    public ArrayList<String> getActors() {
        return this.actors;
    }
}

// Define the Review class
class Review {

    private String reviewText;
    private String reviewerName;
    private double rating;

    public Review(String reviewText, String reviewerName, double rating) {
        this.reviewText = reviewText;
        this.reviewerName = reviewerName;
        this.rating = rating;
    }

    public String getReviewText() {
        return reviewText;
    }

    public String getReviewerName() {
        return reviewerName;
    }

    public double getRating() {
        return rating;
    }
}

// Define the Main class
public class Exercise169 {

    public static void main(String[] args) {

        // Create a movie object for "Titanic"
        Movie movie1 = new Movie("Titanic", "James Cameron",
                new ArrayList<>(Arrays.asList("Leonardo DiCaprio", "Kate Winslet")));

        // Create review objects
        Review review1 = new Review("Great movie!", "Irvine Rolf", 4.5);
        Review review2 = new Review("Highly recommended!", "Ashkii Karlheinz", 4.5);
        Review review3 = new Review("A classic that never gets old.", "Nele Athol", 4.0);
        Review review4 = new Review("Great movie!", "Cipactli Anselma", 4.0);
        Review review5 = new Review("Highly recommended!", "Martin Nadine", 4.0);

        // Add reviews to movie1
        movie1.addReview(review1);
        movie1.addReview(review2);
        movie1.addReview(review3);
        movie1.addReview(review4);

        // Create a movie object for "The Godfather"
        Movie movie2 = new Movie("The Godfather", "Francis Ford Coppola",
                new ArrayList<>(Arrays.asList("Marlon Brando", "Al Pacino", "James Caan")));

        // Display all the reviews for "Titanic"
        System.out.println("\nReviews for '" + movie1.getTitle() + "':");
        for (Review review : movie1.getReviews()) {
            System.out.println(review.getReviewText() + " by " + review.getReviewerName() + " - " + review.getRating());
        }

        // Add reviews to movie2
        movie2.addReview(review1);
        movie2.addReview(review4);
        movie2.addReview(review5);

        // Display all the reviews for "The Godfather"
        System.out.println("\nReviews for '" + movie2.getTitle() + "':");
        for (Review review : movie2.getReviews()) {
            System.out.println(review.getReviewText() + " by " + review.getReviewerName() + " - " + review.getRating());
        }
    }
}

