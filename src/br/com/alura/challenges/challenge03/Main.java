package br.com.alura.challenges.challenge03;

import br.com.alura.challenges.challenge03.functions.PrimeChecker;
import br.com.alura.challenges.challenge03.functions.PrimeGenerator;
import br.com.alura.challenges.challenge03.models.*;

public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        car.setModel("Sedan");
        car.setPrices(30000, 32000, 35000);
        car.displayInfo();
        System.out.println("---------------------");
        Dog dog = new Dog();
        dog.makeSound();
        dog.tailWag();
        Cat cat = new Cat();
        cat.makeSound();
        cat.furnitureScratch();
        System.out.println("---------------------");
        BankAccount bankAccount = new BankAccount();
        bankAccount.deposit(1000);
        bankAccount.checkBalance();
        bankAccount.withdraw(500);
        bankAccount.checkBalance();
        CheckingAccount checkingAccount = new CheckingAccount();
        checkingAccount.deposit(200);
        checkingAccount.chargeMonthlyFee();
        checkingAccount.checkBalance();
        checkingAccount.withdraw(150);
        checkingAccount.checkBalance();
        System.out.println("---------------------");
        PrimeChecker checker = new PrimeChecker();
        checker.checkIfPrime(17);
        PrimeGenerator generator = new PrimeGenerator();
        int nextPrime = generator.generateNextPrime(17);
        System.out.println("The next prime number of 17 is " + nextPrime);
        PrimeNumbers primeNumbers = new PrimeNumbers();
        primeNumbers.listPrimes(30);
    }
}
