package org.Java_8_forEach_examples;

import java.util.HashMap;
import java.util.Map;

public class loopMapJava8 {
    public static void main(String[] args) {
        Map<String,Integer> map=new HashMap<>();
        map.put("Tom",23);
        map.put("Sem",35);
        map.forEach((k, v)-> System.out.println("key:"+k+",value:"+v));
    }
}
