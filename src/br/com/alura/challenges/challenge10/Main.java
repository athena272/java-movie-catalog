package br.com.alura.challenges.challenge10;

import br.com.alura.challenges.challenge10.models.CreditCard;
import br.com.alura.challenges.challenge10.models.Purchase;

import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the credit card limit: ");
        double limit = input.nextDouble();
        CreditCard creditCard = new CreditCard(limit);

        int exit = 1;
        while (exit != 0) {
            System.out.println("Enter the purchase description:");
            String description = input.next();

            System.out.println("Enter the purchase amount:");
            double value = input.nextDouble();

            Purchase purchase = new Purchase(description, value);
            boolean purchaseCompleted = creditCard.addPurchase(purchase);

            if (purchaseCompleted) {
                System.out.println("Purchase completed!");
                System.out.println("Enter 0 to exit or 1 to continue");
                exit = input.nextInt();
            } else {
                System.out.println("Insufficient balance!");
                exit = 0;
            }
        }

        System.out.println("***********************");
        System.out.println("PURCHASES MADE:\n");
        Collections.sort(creditCard.getPurchases());
        for (Purchase p : creditCard.getPurchases()) {
            System.out.println(p.getDescription() + " - " + p.getValue());
        }
        System.out.println("\n***********************");

        System.out.println("\nCredit card balance: " + creditCard.getBalance());
    }
}
