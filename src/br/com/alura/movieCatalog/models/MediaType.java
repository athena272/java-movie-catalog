package br.com.alura.movieCatalog.models;

import com.google.gson.annotations.SerializedName;

public class MediaType implements Comparable<MediaType> {
    @SerializedName("Title")
    private String name;
    @SerializedName("Year")
    private int releaseYear;
    private boolean includedInPlan;
    private double sumOfRatings;
    private int totalRatings;
    private int durationInMinutes;

    public MediaType(String name, int releaseYear) {
        this.releaseYear = releaseYear;
        this.name = name;
    }

    public MediaType(OmdbMedia mediaOmdb) {
        this.name = mediaOmdb.title();
        this.releaseYear = Integer.valueOf(mediaOmdb.year());
        this.durationInMinutes = Integer.valueOf(mediaOmdb.runtime().substring(0, 3).trim());
    }

    public void displayTechnicalSheet() {
        System.out.println("Media name: " + name);
        System.out.println("Media release year: " + releaseYear);
    }

    public void rate(double rating) {
        sumOfRatings += rating;
        totalRatings++;
    }

    public double getAverageRating() {
        return sumOfRatings / totalRatings;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    public boolean isIncludedInPlan() {
        return includedInPlan;
    }

    public void setIncludedInPlan(boolean includedInPlan) {
        this.includedInPlan = includedInPlan;
    }

    public double getSumOfRatings() {
        return sumOfRatings;
    }

    public void setSumOfRatings(double sumOfRatings) {
        this.sumOfRatings = sumOfRatings;
    }

    public int getTotalRatings() {
        return totalRatings;
    }

    public void setTotalRatings(int totalRatings) {
        this.totalRatings = totalRatings;
    }

    public int getDurationInMinutes() {
        return durationInMinutes;
    }

    public void setDurationInMinutes(int durationInMinutes) {
        this.durationInMinutes = durationInMinutes;
    }

    public double getMedia() {
        return sumOfRatings / totalRatings;
    }

    @Override
    public int compareTo(MediaType anotherMediaType) {
        return this.getName().compareTo(anotherMediaType.getName());
    }

    @Override
    public String toString() {
        return "MediaType{" +
                "name='" + name + '\'' +
                ", releaseYear=" + releaseYear +
                ", durationInMinutes=" + durationInMinutes +
                '}';
    }
}
