/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.movie;

/**
 *
 * @author hp
 */
public class Movie {
    private String title;
    private String genre;
    private String leadActor;
    private String director;
    private int releaseYear;
    private double rating;
    private String review;

    public Movie(String title, String genre, String leadActor, String director, int releaseYear, double rating) {
        this.title = title;
        this.genre = genre;
        this.leadActor = leadActor;
        this.director = director;
        this.releaseYear = releaseYear;
        this.rating = rating;
        if (rating < 5) {
            this.review = "Not Good";
        } else {
            this.review = "Good";
        }
    }

    public String getTitle() {
        return title;
    }

    public String getGenre() {
        return genre;
    }

    public String getLeadActor() {
        return leadActor;
    }

    public String getDirector() {
        return director;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public double getRating() {
        return rating;
    }

    public String getReview() {
        return review;
    }

    public static void main(String[] args) {
        Movie movie1 = new Movie("The Shawshank Redemption", "Drama", "Tim Robbins", "Frank Darabont", 1994, 9.2);
        System.out.println("Movie 1:");
        System.out.println("Title: " + movie1.getTitle());
        System.out.println("Genre: " + movie1.getGenre());
        System.out.println("Lead Actor: " + movie1.getLeadActor());
        System.out.println("Director: " + movie1.getDirector());
        System.out.println("Release Year: " + movie1.getReleaseYear());
        System.out.println("Rating: " + movie1.getRating());
        System.out.println("Review: " + movie1.getReview());

        Movie movie2 = new Movie("The Room", "Drama", "Tommy Wiseau", "Tommy Wiseau", 2003, 3.5);
        System.out.println("Movie 2:");
        System.out.println("Title: " + movie2.getTitle());
        System.out.println("Genre: " + movie2.getGenre());
        System.out.println("Lead Actor: " + movie2.getLeadActor());
        System.out.println("Director: " + movie2.getDirector());
        System.out.println("Release Year: " + movie2.getReleaseYear());
        System.out.println("Rating: " + movie2.getRating());
        System.out.println("Review: " + movie2.getReview());
    }
}
