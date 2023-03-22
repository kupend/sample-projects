package com.example.jan2023.repository;

import com.example.jan2023.controller.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {
    public List<Student> findStudentByName(String name);
    //select * from student where name?
}
