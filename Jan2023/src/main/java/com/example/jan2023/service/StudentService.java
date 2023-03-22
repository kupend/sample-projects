package com.example.jan2023.service;

import com.example.jan2023.controller.model.Student;
import com.example.jan2023.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.kafka.DefaultKafkaProducerFactoryCustomizer;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    @Autowired
    StudentRepository repo;


    public List<Student> getAllStudents(){
        return repo.findAll();}
    //select* from student
}
