package com.example.day14ce1.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.day14ce1.model.BadriEmployee;
import com.example.day14ce1.repository.BadriEmployeeRepo;

@Service

public class BadriEmployeeService {
    @Autowired
    BadriEmployeeRepo employeeRepo;

    public BadriEmployee addEmployee(BadriEmployee employee)
    {
        return employeeRepo.save(employee);
    }

    public List<BadriEmployee> getEmployees()
    {
        return employeeRepo.findAll();
    }

    public Optional<BadriEmployee> getEmployee(Long employeeId)
    {
        return employeeRepo.findById(employeeId);
    }

}
