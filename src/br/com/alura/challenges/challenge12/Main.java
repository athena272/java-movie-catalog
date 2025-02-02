package br.com.alura.challenges.challenge12;

import br.com.alura.challenges.challenge12.models.Book;
import br.com.alura.challenges.challenge12.models.Person;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class Main {
    public static void main(String[] args) {
        String jsonPerson = "{\"name\":\"Rodrigo\",\"age\":20,\"city\":\"Brasília\"}";
        Gson gson = new Gson();
        Person person = gson.fromJson(jsonPerson, Person.class);
        System.out.println("Person Object: " + person);

        String jsonPerson2 = "{\"name\":\"Rodrigo\",\"city\":\"Brasília\"}";
        Gson gson2 = new GsonBuilder().setLenient().create();
        Person person2 = gson2.fromJson(jsonPerson, Person.class);
        System.out.println("Person Object: " + person);

        String jsonBook = "{\"title\":\"Java Adventures\",\"author\":\"Akemi\",\"publisher\":{\"name\":\"TechBooks\",\"city\":\"São Paulo\"}}";
        Gson gson3 = new Gson();
        Book book = gson3.fromJson(jsonBook, Book.class);
        System.out.println("Book Object: " + book);
    }
}
