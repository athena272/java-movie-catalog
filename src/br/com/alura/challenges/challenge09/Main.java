package br.com.alura.challenges.challenge09;

import br.com.alura.challenges.challenge09.models.Title;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(2);
        numbers.add(8);
        numbers.add(1);

        Collections.sort(numbers);

        System.out.println("Sorted list: " + numbers);

        ArrayList<Title> titleList = new ArrayList<>();
        titleList.add(new Title("D"));
        titleList.add(new Title("A"));
        titleList.add(new Title("B"));

        Collections.sort(titleList);

        for (Title title : titleList) {
            System.out.println(title.getName());
        }

        List<String> arrayList = new ArrayList<>();
        arrayList.add("Element 1");
        arrayList.add("Element 2");

        List<String> linkedList = new LinkedList<>();
        linkedList.add("Element A");
        linkedList.add("Element B");

        System.out.println("ArrayList: " + arrayList);
        System.out.println("LinkedList: " + linkedList);

        List<String> polymorphicList;

        polymorphicList = new ArrayList<>();
        polymorphicList.add("Element 1");
        polymorphicList.add("Element 2");
        System.out.println("ArrayList: " + polymorphicList);

        polymorphicList = new LinkedList<>();
        polymorphicList.add("Element A");
        polymorphicList.add("Element B");
        System.out.println("LinkedList: " + polymorphicList);
    }
}
