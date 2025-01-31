package br.com.alura.challenges.challenge03.models;

public class Car {
    private String model;
    private double priceYear1;
    private double priceYear2;
    private double priceYear3;

    public void setModel(String model) {
        this.model = model;
    }

    public void setPrices(double priceYear1, double priceYear2, double priceYear3) {
        this.priceYear1 = priceYear1;
        this.priceYear2 = priceYear2;
        this.priceYear3 = priceYear3;
    }

    public void displayInfo() {
        System.out.println("Model: " + model);
        System.out.println("Price Year 1: " + priceYear1);
        System.out.println("Price Year 2: " + priceYear2);
        System.out.println("Price Year 3: " + priceYear3);
        System.out.println("Lowest Price: " + calculateLowestPrice());
        System.out.println("Highest Price: " + calculateHighestPrice());
    }

    private double calculateLowestPrice() {
        double lowestPrice = priceYear1;

        if (priceYear2 < lowestPrice) {
            lowestPrice = priceYear2;
        }

        if (priceYear3 < lowestPrice) {
            lowestPrice = priceYear3;
        }

        return lowestPrice;
    }

    private double calculateHighestPrice() {
        double highestPrice = priceYear1;

        if (priceYear2 > highestPrice) {
            highestPrice = priceYear2;
        }

        if (priceYear3 > highestPrice) {
            highestPrice = priceYear3;
        }

        return highestPrice;
    }
}
