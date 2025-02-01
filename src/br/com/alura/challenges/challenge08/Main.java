package br.com.alura.challenges.challenge08;

import br.com.alura.challenges.challenge08.models.*;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<>();
        strings.add("Java");
        strings.add("Python");
        strings.add("C++");
        for (String string : strings) {
            System.out.println(string);
        }

        Animal animal = new Dog();

        if (animal instanceof Dog) {
            Dog dog = (Dog) animal;
        } else {
            System.out.println("The object is not a dog");
        }

        Product product1 = new Product("Air Conditioner", 2000.0);
        Product product2 = new Product("Heater", 800.0);
        Product product3 = new Product("Fan", 150.0);

        ArrayList<Product> productList = new ArrayList<>();
        productList.add(product1);
        productList.add(product2);
        productList.add(product3);

        double totalPrice = 0;
        for (Product product : productList) {
            totalPrice += product.getPrice();
        }

        double averagePrice = totalPrice / productList.size();

        Circle circle = new Circle();
        circle.setRadius(5);

        Square square = new Square();
        square.setSide(4);

        // List of shapes
        ArrayList<Shape> shapeList = new ArrayList<>();
        shapeList.add(circle);
        shapeList.add(square);

        // Calculate and print the area of each shape
        for (Shape shape : shapeList) {
            System.out.println("Area: " + shape.calculateArea());
        }

        BankAccount account1 = new BankAccount(101, 1500.0);
        BankAccount account2 = new BankAccount(102, 2500.0);
        BankAccount account3 = new BankAccount(103, 1800.0);

        ArrayList<BankAccount> accountList = new ArrayList<>();
        accountList.add(account1);
        accountList.add(account2);
        accountList.add(account3);

        BankAccount highestBalanceAccount = accountList.getFirst();
        for (BankAccount account : accountList) {
            if (account.getBalance() > highestBalanceAccount.getBalance()) {
                highestBalanceAccount = account;
            }
        }

        System.out.println("Account with the highest balance - Number: " + highestBalanceAccount.getAccountNumber() +
                ", Balance: " + highestBalanceAccount.getBalance());
    }
}
