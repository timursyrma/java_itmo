package com.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class GradesExample {
    public static void main(String[] args) {
        HashMap<String, ArrayList<Integer>> grades = new HashMap<>();
        grades.put("Иван", new ArrayList<>());
        grades.get("Иван").add(5);
        grades.get("Иван").add(6);


        for (String name : grades.keySet()) {
            for (Integer i : grades.get(name)) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}
