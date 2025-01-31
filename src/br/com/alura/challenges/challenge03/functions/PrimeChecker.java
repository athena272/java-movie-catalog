package br.com.alura.challenges.challenge03.functions;

import br.com.alura.challenges.challenge03.models.PrimeNumbers;

public class PrimeChecker extends PrimeNumbers {
    public void checkIfPrime(int number) {
        if (checkPrimality(number)) {
            System.out.println(number + " is prime.");
        } else {
            System.out.println(number + " is not prime.");
        }
    }
}
