package br.com.alura.movieCatalog.models;

import br.com.alura.movieCatalog.functions.MediaEvaluator;

public class Movie extends MediaType implements MediaEvaluator {
    private String director;

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    @Override
    public int getStars() {
        return (int) getMedia();
    }
}
