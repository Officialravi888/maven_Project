package org.Java_8_Consumer_Examples.Java_8_BiConsumer_Examples;

import java.util.function.BiConsumer;

public class JavaBiConsumer2 {
    public static void main(String[] args) {
        addTwo(1,3,(x,y)-> System.out.println(x+y));
        addTwo("jery","Tom",(x,y)-> System.out.println(x+y));
    }
    static <T>void addTwo(T a1, T a2, BiConsumer<T,T>c){
        c.accept(a1,a2);
    }
}
