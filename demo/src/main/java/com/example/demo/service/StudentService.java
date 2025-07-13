package com.example.demo.service;

import com.example.demo.model.Student;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

public interface StudentService {
    List<Student> findAllStudents();

    Student saveStudent(Student student);

    Student findByEmail(String email);

    Student updateStudent(Student student);

    void deleteStudent(String  email);
}
