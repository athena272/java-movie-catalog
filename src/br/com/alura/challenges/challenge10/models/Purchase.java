package br.com.alura.challenges.challenge10.models;

public class Purchase implements Comparable<Purchase> {
    private String description;
    private double value;

    public Purchase(String description, double value) {
        this.description = description;
        this.value = value;
    }

    public String getDescription() {
        return description;
    }

    public double getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "Purchase: description = " + description +
                " value = " + value;
    }

    @Override
    public int compareTo(Purchase otherPurchase) {
        return Double.valueOf(this.value).compareTo(Double.valueOf(otherPurchase.value));
    }
}