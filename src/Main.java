import br.com.alura.movieCatalog.models.Movie;

public class Main {
    public static void main(String[] args) {
        Movie myMovie = new Movie();
        myMovie.setName("The Godfather");
        myMovie.setReleaseYear(1970);
        myMovie.setDurationInMinutes(180);

        myMovie.displayTechnicalSheet();
        myMovie.rate(8);
        myMovie.rate(5);
        myMovie.rate(10);
        System.out.println(myMovie.getSumOfRatings());
        System.out.println(myMovie.getTotalRatings());
        System.out.println(myMovie.getAverageRating());
    }
}
