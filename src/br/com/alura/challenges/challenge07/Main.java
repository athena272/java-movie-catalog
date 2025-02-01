package br.com.alura.challenges.challenge07;

import br.com.alura.challenges.challenge07.models.PerishableProduct;
import br.com.alura.challenges.challenge07.models.Product;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Product> productList = new ArrayList<>();

        Product product1 = new Product("Soap", 15.99, 5);
        Product product2 = new Product("Detergent", 10.49, 8);

        productList.add(product1);
        productList.add(product2);

        System.out.println("List size: " + productList.size());
        System.out.println("Product at position 0: " + productList.getFirst().getName());

        for (Product product : productList) {
            System.out.println(product);
        }

        PerishableProduct perishableProduct = new PerishableProduct("Product C", 12.75, 2, "2023-12-31");
        System.out.println(perishableProduct);
    }
}
