package org.Java_8_Consumer_Examples;

import java.util.function.Consumer;

public class Java8Consumer1 {
    public static void main(String[] args) {
        Consumer<String>print=x-> System.out.println(x);
        print.accept("jerry");
    }
}
