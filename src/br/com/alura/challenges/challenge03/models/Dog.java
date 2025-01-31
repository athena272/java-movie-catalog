package br.com.alura.challenges.challenge03.models;

public class Dog extends Animal {
    public void tailWag() {
        System.out.println("Dog tail wagging");
    }

    @Override
    public void makeSound() {
        System.out.println("Dog barking");
    }
}
