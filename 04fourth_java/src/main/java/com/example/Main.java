package com.example;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
//        Object obj = new Object();
//        Example example = new Example();
//
//        example.equals(obj);
//        String str = "Hello";
//        Class<String> strClass = String.class;
////        System.out.println(strClass);
//
//        ArrayList<String> list = new ArrayList<>();
//        list.add("java");
//        String element = list.getFirst();
//
//        String element2 = element;
//        System.out.println(element.equals(element2));

        String str1 = new String("hello").intern();
        String str2 = new String("hello").intern();
        System.out.println(str1 == str2);
    }

}