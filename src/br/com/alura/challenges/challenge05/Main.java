package br.com.alura.challenges.challenge05;


import br.com.alura.challenges.challenge05.models.Music;
import br.com.alura.challenges.challenge05.models.MyFavorites;
import br.com.alura.challenges.challenge05.models.Podcast;

public class Main {
    public static void main(String[] args) {
        Music music = new Music();
        music.setTitle("Forever");
        music.setSinger("Kiss");

        for (int i = 0; i < 1000; i++) {
            music.play();
        }

        for (int i = 0; i < 50; i++) {
            music.like();
        }

        Podcast podcast = new Podcast();
        podcast.setTitle("BolhaDev");
        podcast.setHost("Marcus Mendes");

        for (int i = 0; i < 5000; i++) {
            podcast.play();
        }

        for (int i = 0; i < 1000; i++) {
            podcast.like();
        }

        MyFavorites favorites = new MyFavorites();
        favorites.add(podcast);
        favorites.add(music);
    }
}
