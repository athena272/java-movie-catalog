package br.com.alura.challenges.challenge02;

public class Main {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount();
        bankAccount.setAccountNumber(123);
        bankAccount.setBalance(1000);
        bankAccount.setHolder("John");

        System.out.println("Bank account number: " + bankAccount.getAccountNumber());
        System.out.println("Account balance: " + bankAccount.getBalance());
        System.out.println("Holder: " + bankAccount.getHolder());

        bankAccount.setBalance(1500);
        System.out.println("New account balance: " + bankAccount.getBalance());
    }
}
