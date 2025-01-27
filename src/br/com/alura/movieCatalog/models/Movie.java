package br.com.alura.movieCatalog.models;

public class Movie {
    public String name;
    public int releaseYear;
    public boolean includedInPlan;
    public double sumOfRatings;
    public int totalRatings;
    public int durationInMinutes;

    public void displayTechnicalSheet() {
        System.out.println("Movie name: " + name);
        System.out.println("Release year: " + releaseYear);
    }

    public void rate(double rating) {
        sumOfRatings += rating;
        totalRatings++;
    }

    public double getAverageRating() {
        return sumOfRatings / totalRatings;
    }
}
