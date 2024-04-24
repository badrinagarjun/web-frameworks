package com.example.relation.controller;

import org.springframework.web.bind.annotation.RestController;

import com.example.relation.model.BadriStudent;
import com.example.relation.service.BadriStudentService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;



@RestController
public class BadriStudentController {
    public BadriStudentService studentService;
    public BadriStudentController(BadriStudentService studentService)
    {
        this.studentService = studentService;
    }
    @PostMapping("/api/student")
    public BadriStudent postMethodName(@RequestBody BadriStudent student) {
        return studentService.saveStudent(student);
    }
    @GetMapping("/api/student")
    public List<BadriStudent> getMethodName() {
        return studentService.getStudents();
    }
    
}
