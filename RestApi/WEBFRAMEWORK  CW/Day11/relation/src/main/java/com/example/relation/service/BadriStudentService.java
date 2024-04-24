package com.example.relation.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.relation.model.BadriStudent;
import com.example.relation.repository.BadriStudentRepository;

@Service
public class BadriStudentService {
    public BadriStudentRepository studentRepository;
    public BadriStudentService(BadriStudentRepository studentRepository)
    {
        this.studentRepository = studentRepository;
    }
    public BadriStudent saveStudent(BadriStudent student)
    {
        return studentRepository.save(student);
    }
    public List<BadriStudent> getStudents()
    {
        return studentRepository.findAll();
    }
}
