package br.com.alura.challenges.challenge01.models;

public class Car {
    public String model;
    public int year;
    public String color;

    public void displayTechnicalSheet() {
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
        System.out.println("Color: " + color);
    }

    public int calculateAge() {
        return 2025 - year;
    }
}
