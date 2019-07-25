package com.practise.com.functionalInterface.FuntionalInterfaceImplementations;

import java.util.HashMap;
import java.util.Map;

public class BiFunctionTest {
    public static void main(String[] args) {
        Map<String, Integer> salaries = new HashMap<>();
        salaries.put("John", 40000);
        salaries.put("Freddy", 30000);
        salaries.put("Samuel", 50000);

        salaries.replaceAll((name, oldValue) ->
                name.equals("Freddy") ? oldValue : oldValue + 10000);
  System.out.println("Hello");

  salaries.forEach((p,v)-> System.out.println(p + "V" + v));



    }


}
