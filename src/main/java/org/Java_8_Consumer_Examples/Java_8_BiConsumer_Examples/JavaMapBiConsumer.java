package org.Java_8_Consumer_Examples.Java_8_BiConsumer_Examples;

import java.util.HashMap;

import java.util.Map;
public class JavaMapBiConsumer {
    public static void main(String[] args) {
        Map<Integer,String>map=new HashMap<>();
        map.put(1,"java");
        map.forEach((k,v)->System.out.println(k+","+v));

    }
}
