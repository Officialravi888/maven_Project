
//5. Predicate.test() in function
package org.Java_8_Consumer_Examples.Java_8_Predicate_Examples;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Java8Predicate6 {
    public static void main(String[] args) {
        List<String>list= Arrays.asList("Tom","Mark","sem","jerry");
        System.out.println(StringProcessor.filter(list,x-> x.startsWith("J")));
        System.out.println(StringProcessor.filter(
                list, x -> x.startsWith("Tom") && x.length() == 3));
    }
}

class StringProcessor {
    static List<String> filter(List<String> list, Predicate<String> predicate) {
        return list.stream().filter(predicate::test).collect(Collectors.toList());
    }
}
