package com.example;

// Коллекции
// Рефлексия
// Lifecycle обьектов
// Проектирование ООП приложений
// Паттерны

import java.util.ArrayList;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student("Ivan", 20);
        s1 = null;

        // tut
        ArrayList<Student> studentList = new ArrayList<>();

        studentList.add(new Student("Alice", 20));
        studentList.add(new Student("Bob", 22));
        studentList.add(new Student("Ivan", 18));

        studentList.sort(new AgeComparator());

        for (Student s : studentList) {
            System.out.println(s);
        }
    }
}