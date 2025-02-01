import br.com.alura.movieCatalog.functions.RecommendationFilter;
import br.com.alura.movieCatalog.functions.TimeCalculator;
import br.com.alura.movieCatalog.models.Episode;
import br.com.alura.movieCatalog.models.Movie;
import br.com.alura.movieCatalog.models.Serie;

public class Main {
    public static void main(String[] args) {
        Movie theGodfather = new Movie();
        theGodfather.setName("The Godfather");
        theGodfather.setReleaseYear(1970);
        theGodfather.setDurationInMinutes(180);

        theGodfather.displayTechnicalSheet();
        theGodfather.rate(8);
        theGodfather.rate(5);
        theGodfather.rate(10);
        System.out.println(theGodfather.getSumOfRatings());
        System.out.println(theGodfather.getTotalRatings());
        System.out.println(theGodfather.getAverageRating());

        Serie lost = new Serie();
        lost.setName("Lost");
        lost.setReleaseYear(2000);
        lost.displayTechnicalSheet();
        lost.setSeasons(10);
        lost.setEpisodesPerSeason(10);
        lost.setMinutesPerEpisode(50);
        System.out.println("Duration to binge-watch Lost: " + lost.getDurationInMinutes() + " minutes");
        Movie avatar = new Movie();
        avatar.setName("Avatar");
        avatar.setReleaseYear(2010);
        avatar.setDurationInMinutes(200);

        TimeCalculator calculator = new TimeCalculator();
        calculator.calculateTotalDuration(theGodfather);
        calculator.calculateTotalDuration(avatar);
        calculator.calculateTotalDuration(lost);
        System.out.println("Current total time calculated: " + calculator.getTotalTime());

        RecommendationFilter filter = new RecommendationFilter();
        filter.isRecommended(theGodfather);

        Episode episode = new Episode();
        episode.setNumber(1);
        episode.setSerie(lost);
        episode.setTotalViews(99);
        filter.isRecommended(episode);
    }
}
