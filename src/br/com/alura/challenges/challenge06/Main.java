package br.com.alura.challenges.challenge06;

import br.com.alura.challenges.challenge06.models.Person;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Person> people = new ArrayList<>();
        Person akemi = new Person("Akemi", 18);
        Person rodrigo = new Person("Rodrigo", 30);
        Person caroline = new Person("Caroline", 35);
        people.add(akemi);
        people.add(rodrigo);
        people.add(caroline);

        System.out.println("Size of people: " + people.size());
        System.out.println("First person: " + people.getFirst());
        System.out.println("List of people");
        for (Person person : people) {
            System.out.println(person);
        }
    }
}
