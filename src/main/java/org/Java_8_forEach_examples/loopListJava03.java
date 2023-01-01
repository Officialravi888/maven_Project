package org.Java_8_forEach_examples;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class loopListJava03 {
    public static void main(String[] args) {
        List<String> list=new ArrayList<>();
        list.add("Marry");
        list.add(null);
        list.add("jerry");
        // filter null value
        //list.stream().filter(Objects::isNull).forEach(System.out::println);
        list.stream().filter(Objects::nonNull).forEach(System.out::println);

    }
}
