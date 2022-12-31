package org.Functional_Interfaces_Java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Test03 {
    public static void main(String[] args) {
        List<String> names= Arrays.asList("ravi","raj","shiv","tom","jack");

        // declare the predicate type as string and use
        // lambda expression to create object
        Predicate<String>p=(s)->s.startsWith("r");
        for(String st:names){   // Iterate through the list
            if(p.test(st))   // call the test method
                System.out.println(st);
        }
    }
}
