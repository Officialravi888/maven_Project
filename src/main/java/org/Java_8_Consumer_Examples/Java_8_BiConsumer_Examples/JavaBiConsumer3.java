package org.Java_8_Consumer_Examples.Java_8_BiConsumer_Examples;

import java.util.function.BiConsumer;

public class JavaBiConsumer3 {
    public static void main(String[] args) {
        math(1, 3, (x, y) -> System.out.println(x + y));
        math(2, 4, (x, y) -> System.out.println(x * y));
    }

    static <Integer> void math(Integer a1, Integer a2, BiConsumer<Integer, Integer>c){
        c.accept(a1,a2);
    }

}
