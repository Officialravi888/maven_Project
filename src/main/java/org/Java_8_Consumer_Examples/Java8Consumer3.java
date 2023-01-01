package org.Java_8_Consumer_Examples;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

import static org.Java_8_Consumer_Examples.Java8Consumer2.forEach;

public class Java8Consumer3 {
    public static void main(String[] args) {
        List<String> list= Arrays.asList("a","ab","abc");
        forEach(list,(String x)-> System.out.println(x.length()));
    }
    static <T> void forEach(List<T>list, Consumer<T>consumer){
        for(T t :list){
            consumer.accept(t);
        }
    }
}
