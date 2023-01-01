package org.Java_8_Consumer_Examples.Java_8_Predicate_Examples;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Java8Predicate2 {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(1,2,3,4,5,6,7,7);
        List<Integer>collect=list.stream().filter(x->x>3&&x<6).collect(Collectors.toList());
        System.out.println(collect);
    }
}
