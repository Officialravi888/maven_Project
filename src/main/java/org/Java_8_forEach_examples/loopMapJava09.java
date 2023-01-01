package org.Java_8_forEach_examples;

import java.util.HashMap;
import java.util.Map;

public class loopMapJava09 {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("Tom", 14);
        map.put("jerry", 13);
        map.forEach(
                (k, v) -> {
                    // yes, we can put logic here
                    if (k != null) {
                        System.out.println("Key : " + k + ", Value : " + v);
                    }
                }
        );

    }
}