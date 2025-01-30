package br.com.alura.challenges.challenge01;

import br.com.alura.challenges.challenge01.models.*;

public class Main {
    public static void main(String[] args) {
        Person person = new Person();
        Calculator calculator = new Calculator();
        Music myMusic = new Music();
        Car car = new Car();
        Student student = new Student();

        person.greeting();
        System.out.println("---------------------");
        System.out.println("calculator.doubleNumber(21): " + calculator.doubleNumber(21));
        System.out.println("---------------------");
        myMusic.title = "Nome da Música";
        myMusic.artist = "Nome do Artista";
        myMusic.releaseYear = 2024;
        myMusic.displayTechnicalSheet();
        myMusic.rate(4.5);
        myMusic.rate(3.8);
        myMusic.rate(5);
        double averageRates = myMusic.getAverageRating();
        System.out.println("average rates: " + averageRates);
        System.out.println("---------------------");
        car.model = "Gol";
        car.year = 2020;
        car.color = "Black";
        car.displayTechnicalSheet();
        System.out.println("Car age: " + car.calculateAge() + " years old");
        System.out.println("---------------------");
        student.name = "Akemi";
        student.age = 18;
        student.displayInformation();
    }
}
