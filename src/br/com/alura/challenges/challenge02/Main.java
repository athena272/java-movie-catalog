package br.com.alura.challenges.challenge02;

import br.com.alura.challenges.challenge02.models.BankAccount;
import br.com.alura.challenges.challenge02.models.Person;

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

        System.out.println("---------------------");
        Person person1 = new Person();
        person1.setName("Carolw");
        person1.setAge(22);
        Person person2 = new Person();
        person2.setName("Bob");
        person2.setAge(17);

        System.out.println(person1.getName() + "has " + person1.getAge() + " years old");
        person1.ageCheck();

        System.out.println(person2.getName() + " has " + person2.getAge() + " years old");
        person2.ageCheck();
    }
}
