package org.Java_8_forEach_examples;

import java.util.ArrayList;
import java.util.List;

public class loopListJava02 {
    public static void main(String[] args) {
        List<String>list=new ArrayList<>();
        list.add("Sem");
        list.add("jerry");
        list.add("tom");
        list.add("marry");
        // lambda
        // list.forEach(x -> System.out.println(x));
        // method reference
        list.forEach(System.out::println);
    }
}
