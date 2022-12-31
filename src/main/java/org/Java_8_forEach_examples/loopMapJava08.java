package org.Java_8_forEach_examples;

import java.util.HashMap;
import java.util.Map;

public class loopMapJava08 {
    public static void main(String[] args) {
        Map<String, Integer>map=new HashMap<>();
        map.put("tom",25);
        map.put("sem",56);
        map.put(null,13);
        map.put("ravi",23);
        // ensure map is not null
        if(map!=null){
            map.forEach((k,v)-> System.out.println("kay value"+k+"value"+v));
        }
    }
}
