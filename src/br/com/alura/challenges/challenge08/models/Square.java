package br.com.alura.challenges.challenge08.models;

public class Square implements Shape{
    private double side;

    @Override
    public double calculateArea() {
        return side * side;
    }

    public void setSide(double side) {
        this.side = side;
    }
}
