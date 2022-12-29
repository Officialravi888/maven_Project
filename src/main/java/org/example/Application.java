package org.example;

import java.util.ArrayList;
import java.util.List;

public class Application {
    public void great(){
        List<String> list=new ArrayList<>();
        list.add("Hello");
        for(String list1 : list){
            System.out.println("list1:"+list1);
        }
    }
    public Application(){
        System.out.println("Inside Application");
    }

    public static void main(String[] args) {
        System.out.println("Starting Application");
        Application app = new Application();
        app.great();
    }
}
