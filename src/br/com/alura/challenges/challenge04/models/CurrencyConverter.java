package br.com.alura.challenges.challenge04.models;

public class CurrencyConverter implements FinancialConversion {

    @Override
    public void convertDollarToReal(double amount) {
        double dollarQuote = 5.84;
        double realAmount = amount * dollarQuote;
        System.out.println("Total amount is R$" + realAmount);
    }
}
