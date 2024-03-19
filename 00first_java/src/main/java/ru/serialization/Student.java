package ru.serialization;

import com.fasterxml.jackson.annotation.JsonProperty;
//import jakarta.persistence.*;

//@Entity
//@Table(name = "students")
public class Student {

//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @JsonProperty("fullName")
    private String name;
    private int age;
    private String major;

    public Student() {
    }

    public Student(String name, int age, String major) {
        this.name = name;
        this.age = age;
        this.major = major;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    @Override
    public String toString() {
        return "name:" + name;
    }
}


// TODO: назначение кастомных имен для обьектов при работе с Jackson