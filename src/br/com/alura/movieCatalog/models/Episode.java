package br.com.alura.movieCatalog.models;

import br.com.alura.movieCatalog.functions.MediaEvaluator;

public class Episode implements MediaEvaluator {
    private int number;
    private String title;
    private Serie serie;
    private int totalViews;

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Serie getSerie() {
        return serie;
    }

    public void setSerie(Serie serie) {
        this.serie = serie;
    }

    public int getTotalViews() {
        return totalViews;
    }

    public void setTotalViews(int totalViews) {
        this.totalViews = totalViews;
    }

    @Override
    public int getStars() {
        if (totalViews > 100) {
            return 4;
        }

        return 2;
    }
}
