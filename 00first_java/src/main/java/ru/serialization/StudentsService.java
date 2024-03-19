//package ru.serialization;
//
//import com.fasterxml.jackson.databind.ObjectMapper;
//import org.hibernate.Session;
//import org.hibernate.SessionFactory;
//import org.hibernate.cfg.Configuration;
//import org.springframework.stereotype.Service;
//
//import java.io.File;
//import java.io.IOException;
//import java.util.ArrayList;
//import java.util.List;
//
//@Service
//public class StudentsService {
//    List<Student> students = new ArrayList<>();
//    File filePath = new File("students.json");
//
//    void addStudent(Student student) {
//        if (!students.contains(student)) {
//            students.add(student);
//        }
//    }
//
//    void removeStudent(Student student) {
//        students.remove(student);
//    }
//
//    Student getStudentByName(String name) {
//
//        // либо null, либо ""
//        if (name.isEmpty()) {
//            throw new IllegalArgumentException("Illegal argument name");
//        }
//
//        for (Student student : students) {
//            if (student.getName().equals(name)) {
//                return student;
//            }
//        }
//        return null;
//    }
//
//    void saveStateToDatabase() {
//        SessionFactory sessionFactory = new Configuration()
//                .addAnnotatedClass(Student.class)
//                .buildSessionFactory();
//
//
//        for (Student st : students) {
//            Session session = sessionFactory.getCurrentSession();
//            session.beginTransaction();
//            session.save(st);
//            session.getTransaction().commit();
//            session.close();
//        }
//    }
//
//    void readFromDatabase() {
//        SessionFactory sessionFactory = new Configuration()
//                .addAnnotatedClass(Student.class)
//                .buildSessionFactory();
//
//
//        Session session = sessionFactory.getCurrentSession();
//        session.beginTransaction();
//        students = session.createQuery("from Student", Student.class).getResultList();
//        session.getTransaction().commit();
//        session.close();
//
//    }
//
//    void printCollection() {
//        System.out.println(students.size());
//        for (Student student : students) {
//            System.out.println("Student: " + student.getName());
//        }
//    }
//}
