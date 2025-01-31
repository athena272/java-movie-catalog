package br.com.alura.challenges.challenge03.models;

public class PrimeNumbers {
    public boolean checkPrimality(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i * i <= number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public void listPrimes(int upperLimit) {
        System.out.println("Prime numbers up to " + upperLimit + ": ");
        for (int i = 2; i <= upperLimit; i++) {
            if (checkPrimality(i)) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }
}
