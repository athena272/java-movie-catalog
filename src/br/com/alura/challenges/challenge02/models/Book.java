package br.com.alura.challenges.challenge02.models;

public class Book {
    private String title;
    private String author;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void showDetails() {
        System.out.println("Title: " + this.getTitle());
        System.out.println("Author: " + this.getAuthor());
    }
}
