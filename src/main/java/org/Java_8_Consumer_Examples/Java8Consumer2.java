package org.Java_8_Consumer_Examples;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Java8Consumer2 {
    public static void main(String[] args) {
        List<Integer>list= Arrays.asList(2,4,5,6,7,7,5);
        // implementation of the Consumer's accept methods.
        Consumer<Integer> consumer = (Integer x) -> System.out.println(x);
        forEach(list, consumer);
        // or call this directly
        forEach(list, (Integer x) -> System.out.println(x));

    }
    static <T> void forEach(List<T> list, Consumer<T> consumer) {
        for (T t : list) {
            consumer.accept(t);
        }
    }
}
