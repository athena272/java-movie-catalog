package br.com.alura.movieCatalog.functions;

import br.com.alura.movieCatalog.models.MediaType;

public class TimeCalculator {
    private int totalTime;

    public int getTotalTime() {
        return totalTime;
    }

    public void calculateTotalDuration(MediaType mediaType) {
        totalTime = totalTime + mediaType.getDurationInMinutes();
    }
}
