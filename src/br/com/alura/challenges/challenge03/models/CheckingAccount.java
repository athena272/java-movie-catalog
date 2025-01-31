package br.com.alura.challenges.challenge03.models;

public class CheckingAccount extends BankAccount {
    private double monthlyFee;

    public void chargeMonthlyFee() {
        balance = balance - monthlyFee;
        System.out.println("Monthly fee of " + monthlyFee + " charged. Current balance: " + balance);
    }
}
