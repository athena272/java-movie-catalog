package br.com.alura.challenges.challenge05.models;

public class MyFavorites {
    public void add(Audio audio) {
        if (audio.getRating() >= 9) {
            System.out.println(audio.getTitle() + " is considered an absolute success" +
                    " and a favorite for everyone!");
        } else {
            System.out.println(audio.getTitle() + " is also one that everyone is enjoying.");
        }
    }
}
