package org.Java_8_Function_Examples;

import java.util.function.Function;

public class JavaMoney {
    public static void main(String[] args) {
        Function<String,Integer>fun=x -> x.length();
        Integer apply = fun.apply("raviKant");
        System.out.println(apply);
    }
}
