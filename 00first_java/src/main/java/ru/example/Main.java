package ru.example;

import java.io.*;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {
//    public static void main(String[] args) {
//        Student studentA = new Student(1, 20, "Ivan"); // обьект, инстанс
//        Student studentB = new Student(2, 25, "Petr");
//        Student studentC = new Student(3, 30, "Sergey");
//        List<Student> students = new ArrayList<>();
//
//        students.add(studentA);
//        students.add(studentB);
//        students.add(studentC);
//
////        int id_counter = 0;
////        Scanner sc = new Scanner(System.in);
////        while(true) {
////            int id = ++id_counter;
////            System.out.println("Пожалуйста введите возраст: ");
////            int age = sc.nextInt();
////
////            if (age == 101) {
////                break;
////            }
////
////
////            System.out.println("Пожалуйста введите имя: ");
////            String name = sc.next();
////            Student student = new Student(id, age, name);
////            students.add(student);
////        }
//
//        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("students.ser"))) {
//            students = (List<Student>) ois.readObject();
//            System.out.println("Collection successfully ridden");
//        } catch (FileNotFoundException e) {
//            throw new RuntimeException(e);
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        } catch (ClassNotFoundException e) {
//            throw new RuntimeException(e);
//        }
//
//        System.out.println(students);
//
//
//
////        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("students.ser"))) {
////            oos.writeObject(students);
////            System.out.println("Collection successfully written");
////        } catch (FileNotFoundException e) {
////            throw new RuntimeException(e);
////        } catch (IOException e) {
////            throw new RuntimeException(e);
////        }
//
//    }
}
