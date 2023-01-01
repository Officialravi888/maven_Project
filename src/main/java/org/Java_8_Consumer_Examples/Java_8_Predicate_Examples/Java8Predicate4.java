package org.Java_8_Consumer_Examples.Java_8_Predicate_Examples;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.function.Predicate;


public class Java8Predicate4 {
    public static void main(String[] args) {
        Predicate<String>lengthIs=x-> x.length()==3;
        Predicate<String> starWithA = x -> x.startsWith("A");
        List<String>list= Arrays.asList("A","AA","bbb","cccc","ddddd","eeeeee");
        List<String>collect=list.stream().filter(lengthIs.or(starWithA)).collect(Collectors.toList());
        System.out.println(collect);
    }
}
