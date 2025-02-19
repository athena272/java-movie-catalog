package br.com.alura.movieCatalog.models;

import br.com.alura.movieCatalog.functions.MediaEvaluator;

public class Movie extends MediaType implements MediaEvaluator {
    private String director;

    public Movie(String name, int releaseYear) {
        super(name, releaseYear);
    }

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

    @Override
    public String toString() {
        return "Movie: " + this.getName() + " (" + this.getReleaseYear() + ")";
    }
}
