import br.com.alura.movieCatalog.models.Movie;

public class Main {
    public static void main(String[] args) {
        Movie myMovie = new Movie();
        myMovie.name = "The Godfather";
        myMovie.releaseYear = 1970;
        myMovie.durationInMinutes = 180;

        myMovie.displayTechnicalSheet();
        myMovie.rate(8);
        myMovie.rate(5);
        myMovie.rate(10);
        System.out.println(myMovie.sumOfRatings);
        System.out.println(myMovie.totalRatings);
        System.out.println(myMovie.getAverageRating());
    }
}
