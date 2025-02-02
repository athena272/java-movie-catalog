package br.com.alura.challenges.challenge09.models;

public class Title implements Comparable<Title> {
    String name;

    public Title(String name) {
        this.name = name;
    }

    @Override
    public int compareTo(Title otherTitle) {
        return this.name.compareTo(otherTitle.name);
    }

    public String getName() {
        return name;
    }
}
