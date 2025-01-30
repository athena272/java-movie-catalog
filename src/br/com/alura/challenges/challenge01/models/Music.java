package br.com.alura.challenges.challenge01.models;

public class Music {
    public String title;
    public String artist;
    public int releaseYear;
    double sumOfRatings;
    int numberOfRatings;

    public void displayTechnicalSheet() {
        System.out.println("Music title: " + title);
        System.out.println("Artist: " + artist);
        System.out.println("Release year: " + releaseYear);
    }

    public void rate(double rating) {
        sumOfRatings += rating;
        numberOfRatings++;
    }

    public double getAverageRating() {
        return sumOfRatings / numberOfRatings;
    }
}
