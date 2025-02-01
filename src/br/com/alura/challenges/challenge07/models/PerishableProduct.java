package br.com.alura.challenges.challenge07.models;

public class PerishableProduct extends Product {
    String expirationDate;

    public PerishableProduct(String name, double price, int quantity, String expirationDate) {
        super(name, price, quantity);
        this.expirationDate = expirationDate;
    }
}
