package org.Java_8_Consumer_Examples.Java_8_Predicate_Examples;
import java.util.Arrays;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Java8Predicate5 {
    public static void main(String[] args) {
        Predicate<String>startwithA=x-> x.startsWith("A");
        List<String> list=Arrays.asList("jerry","marry","semi");
        List<String>collect=list.stream().filter(startwithA.negate()).collect(Collectors.toList());
        System.out.println(collect);
    }
}
