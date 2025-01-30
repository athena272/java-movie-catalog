package br.com.alura.challenges.challenge02.models;

public class Person {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void ageCheck() {
        if (age >= 18) {
            System.out.println("You are an adult");
        }
        else  {
            System.out.println("You are not an adult");
        }
    }
}
