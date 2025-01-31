package br.com.alura.challenges.challenge03.models;

public class Cat extends Animal {
    public void furnitureScratch() {
        System.out.println("Furniture scratch");
    }

    @Override
    public void makeSound() {
        System.out.println("Miau");
    }
}
