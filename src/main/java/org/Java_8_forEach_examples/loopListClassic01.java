package org.Java_8_forEach_examples;

import java.util.ArrayList;
import java.util.List;

public class loopListClassic01 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Tom");
        list.add("jerry");
        for (String l : list) {
            System.out.println(l);
        }
    }
}