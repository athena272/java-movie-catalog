package br.com.alura;

import br.com.alura.movieCatalog.models.MediaType;
import br.com.alura.movieCatalog.models.Movie;
import br.com.alura.movieCatalog.models.Serie;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class MainWithLists {
    public static void main(String[] args) {
        Movie theGodfather = new Movie("The Godfather", 1970);
        Movie avatar = new Movie("Avatar", 2010);
        Movie snowWhite = new Movie("Snow White", 2003);
        Serie lost = new Serie("Lost", 2000);

        ArrayList<MediaType> watched = new ArrayList<>();
        watched.add(snowWhite);
        watched.add(theGodfather);
        watched.add(avatar);
        watched.add(lost);

        for (MediaType mediaType : watched) {
            System.out.println(mediaType);
            if(mediaType instanceof Movie) {
                Movie movie = (Movie) mediaType;
                System.out.println("Stars: " + movie.getStars());
            }
            System.out.println("-----------------");
        }
        //watched.forEach(media -> System.out.println(media));
        Collections.sort(watched);
        for (MediaType mediaType : watched) {
            System.out.println(mediaType);
        }
        System.out.println("-----------------");
        watched.sort(Comparator.comparing(MediaType::getReleaseYear));
        for (MediaType mediaType : watched) {
            System.out.println(mediaType);
        }
    }
}
