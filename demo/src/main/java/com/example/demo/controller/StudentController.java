package com.example.demo.controller;


import com.example.demo.model.Student;
import com.example.demo.service.StudentService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/students")
@AllArgsConstructor
public class StudentController {

    private final StudentService service;

    @GetMapping
    public List<Student> findAllStudents() {
        //todo
        return service.findAllStudents();
    }

    @PostMapping("save_student")
    public Student saveStudent(@RequestBody Student student) {
        return service.saveStudent(student);
    }

    @GetMapping("/{email}")
    public Student findByEmail(@PathVariable String email) {
        return service.findByEmail(email);
    }

    @PutMapping("update_student")
    public Student updateStudent(Student student) {
        return service.updateStudent(student);
    }

    
    @DeleteMapping("delete_student/{email}")
    public void deleteStudent(String email) {
        service.deleteStudent(email);
    }
}
