package br.com.alura.challenges.challenge01.models;

public class Student {
    public String name;
    public int age;

    public void displayInformation() {
        System.out.println("Student's name: " + name);
        System.out.println("Student's age: " + age);
    }
}