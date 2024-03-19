//package ru.serialization;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.*;
//
//@RestController
//public class StudentsController {
//
//    @Autowired
//    private StudentsService studentsService;
//
//    @RequestMapping(value = "/api/student", method = RequestMethod.POST)
//    void addStudent(@RequestBody Student student) {
//        studentsService.addStudent(student);
//        studentsService.saveStateToDatabase();
//    }
//}
