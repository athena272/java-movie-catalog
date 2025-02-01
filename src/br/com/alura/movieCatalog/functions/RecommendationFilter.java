package br.com.alura.movieCatalog.functions;

public class RecommendationFilter {
    private String recommendation;

    public void isRecommended(MediaEvaluator mediaEvaluator) {
        if (mediaEvaluator.getStars() >= 4) {
            System.out.println("It is among the recommendations");
        } else if (mediaEvaluator.getStars() >= 2) {
            System.out.println("It is very well evaluated");
        } else {
            System.out.println("Consider consuming");
        }
    }
}
