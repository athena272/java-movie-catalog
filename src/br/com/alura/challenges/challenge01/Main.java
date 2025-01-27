package br.com.alura.challenges.challenge01;

public class Main {
    public static void main(String[] args) {
        Person person = new Person();
        Calculator calculator = new Calculator();
        person.greeting();
        System.out.println("calculator.doubleNumber(21): " + calculator.doubleNumber(21));
    }
}
