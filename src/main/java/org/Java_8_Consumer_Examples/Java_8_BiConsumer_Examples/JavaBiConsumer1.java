package org.Java_8_Consumer_Examples.Java_8_BiConsumer_Examples;

import java.util.function.BiConsumer;

public class JavaBiConsumer1 {
    public static void main(String[] args) {
        BiConsumer<Integer,Integer> addTwo=(x,y)-> System.out.println(x+y);
        addTwo.accept(12,34);
    }
}
