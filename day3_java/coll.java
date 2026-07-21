package day3_java;

import java.util.ArrayList;
import java.util.List;

public class coll {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>();

        list.add("Java");
        list.add("Python");
        list.add("C++");
        list.add("JavaScript");

        // Normal for loop
        System.out.println("Using for loop:");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        // Enhanced for loop
        System.out.println("\nUsing for-each:");
        for (String language : list) {
            System.out.println(language);
        }

        // Lambda Expression
        System.out.println("\nUsing Lambda:");
        list.forEach(item -> System.out.println(item));

        // Lambda with method reference
        System.out.println("\nUsing Method Reference:");
        list.forEach(System.out::println);
    }
}