package com.example.bidirection.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.bidirection.model.BadriStudent;
import com.example.bidirection.model.BadriStudentInfo;
import com.example.bidirection.repository.StudentInfoRepository;
import com.example.bidirection.repository.StudentRepository;

@Service
public class StudentService {
    public StudentRepository studentRepository;
    public StudentInfoRepository studentInfoRepository;
    public StudentService(StudentRepository studentRepository,StudentInfoRepository studentInfoRepository)
    {
        this.studentRepository = studentRepository;
        this.studentInfoRepository = studentInfoRepository;
    }
    public BadriStudent saveStudent(BadriStudent student)
    {
        return studentRepository.save(student);
    }
    public BadriStudentInfo saveStudentInfo(BadriStudentInfo studentInfo)
    {
        return studentInfoRepository.save(studentInfo);
    }
    public List<BadriStudent> getStudents()
    {
        return studentRepository.findAll();
    }
}
