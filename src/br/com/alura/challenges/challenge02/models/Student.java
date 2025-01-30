package br.com.alura.challenges.challenge02.models;

public class Student {
    private String name;
    private double firstGrade;
    private double secondGrade;
    private double thirdGrade;

    public Student(String name, double firstGrade, double secondGrade, double thirdGrade) {
        this.name = name;
        this.firstGrade = firstGrade;
        this.secondGrade = secondGrade;
        this.thirdGrade = thirdGrade;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getFirstGrade() {
        return firstGrade;
    }

    public void setFirstGrade(double firstGrade) {
        this.firstGrade = firstGrade;
    }

    public double getSecondGrade() {
        return secondGrade;
    }

    public void setSecondGrade(double secondGrade) {
        this.secondGrade = secondGrade;
    }

    public double getThirdGrade() {
        return thirdGrade;
    }

    public void setThirdGrade(double thirdGrade) {
        this.thirdGrade = thirdGrade;
    }

    public double calculateGradesAverage() {
        return (firstGrade + secondGrade + thirdGrade) / 3;
    }

    public void displayStudentDetails() {
        System.out.println("** Student **");
        System.out.println("Nome: " + name);
        System.out.println("Nota 1: " + firstGrade);
        System.out.println("Nota 2: " + secondGrade);
        System.out.println("Nota 3: " + thirdGrade);
        System.out.println("Média: " + calculateGradesAverage());
    }
}
