package br.com.alura.challenges.challenge01;

public class Music {
    String title;
    String artist;
    int releaseYear;
    double sumOfRatings;
    int numberOfRatings;

    void displayTechnicalSheet() {
        System.out.println("Music title: " + title);
        System.out.println("Artist: " + artist);
        System.out.println("Release year: " + releaseYear);
    }

    void rate(double rating) {
        sumOfRatings += rating;
        numberOfRatings++;
    }

    double getAverageRating() {
        return sumOfRatings / numberOfRatings;
    }
}
