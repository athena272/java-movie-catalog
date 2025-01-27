package br.com.alura.challenges.challenge01;

public class Car {
    String model;
    int year;
    String color;

    void displayTechnicalSheet() {
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
        System.out.println("Color: " + color);
    }

    int calculateAge() {
        return 2025 - year;
    }
}
