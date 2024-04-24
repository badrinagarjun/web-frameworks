package com.example.bidirection.controller;

import org.springframework.web.bind.annotation.RestController;

import com.example.bidirection.model.BadriStudent;
import com.example.bidirection.model.BadriStudentInfo;
import com.example.bidirection.service.StudentService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;



@RestController
public class BadriStudentController {
    public StudentService studentService;
    public BadriStudentController(StudentService studentService)
    {
        this.studentService = studentService;
    }
    @PostMapping("/api/poststudent")
    public BadriStudent postMethodName(@RequestBody BadriStudent student) {
        return studentService.saveStudent(student);
    }
    @PostMapping("/api/poststudentinfo")
    public BadriStudentInfo postMethodName(@RequestBody BadriStudentInfo studentInfo) {
        return studentService.saveStudentInfo(studentInfo);
    }
    @GetMapping("/api/student")
    public List<BadriStudent> getMethodName() {
        return studentService.getStudents();
    }
    
}