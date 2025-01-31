package br.com.alura.movieCatalog.models;

public class Movie extends MediaType {
    private String director;

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }
}
