package LambdaExpression;

import java.util.*;
import java.util.stream.Collectors;

class Person {
    private int id;
    private String name;

    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }
    public int getId() { return id; }
    public String getName() { return name; }
}

public class MethodReference {
    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
                new Person(1, "Alice"),
                new Person(2, "Bob"),
                new Person(3, "Charlie")
        );

        // Convert ArrayList to HashMap using method references
        Map<Integer, String> map = people.stream()
                .collect(Collectors.toMap(Person::getId, Person::getName));

        System.out.println(map);
    }
}