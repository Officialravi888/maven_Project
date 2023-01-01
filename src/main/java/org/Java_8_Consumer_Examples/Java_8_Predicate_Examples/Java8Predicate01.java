package org.Java_8_Consumer_Examples.Java_8_Predicate_Examples;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Java8Predicate01 {
    public static void main(String[] args) {
        Predicate<Integer> noGreaterThan5= x -> x > 5;
        List<Integer>list= Arrays.asList(1,2,3,4,5,6,7,8,9);
        List<Integer> collect=list.stream().filter(noGreaterThan5).collect(Collectors.toList());
        System.out.println(collect);
    }
}
