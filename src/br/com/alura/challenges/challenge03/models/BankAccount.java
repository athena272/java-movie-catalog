package br.com.alura.challenges.challenge03.models;

public class BankAccount {
    protected double balance;

    public void deposit(double amount) {
        balance = balance + amount;
        System.out.println("Deposit of " + amount + " completed. Current balance: " + balance);
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawal of " + amount + " completed. Current balance: " + balance);
        } else {
            System.out.println("Insufficient balance for withdrawal.");
        }
    }

    public void checkBalance() {
        System.out.println("Current balance: " + balance);
    }
}
