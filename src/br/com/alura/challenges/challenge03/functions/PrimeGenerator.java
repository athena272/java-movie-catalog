package br.com.alura.challenges.challenge03.functions;

import br.com.alura.challenges.challenge03.models.PrimeNumbers;

public class PrimeGenerator extends PrimeNumbers {
    public int generateNextPrime(int lastKnownPrime) {
        int nextNumber = lastKnownPrime + 1;
        while (!checkPrimality(nextNumber)) {
            nextNumber++;
        }
        return nextNumber;
    }
}
