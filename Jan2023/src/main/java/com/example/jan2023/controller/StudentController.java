package com.example.jan2023.controller;

import com.example.jan2023.controller.model.Student;
import com.example.jan2023.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.persistence.Entity;
import java.util.List;



@RestController
@RequestMapping("/student")
public class StudentController {

    @Autowired
    StudentService service;//dependency injection

    @GetMapping("/all")
    public List<Student> getAllStudents() {
        return service.getAllStudents();
    }
}
