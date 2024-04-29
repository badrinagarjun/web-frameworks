package com.example.day12_01.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.day12_01.model.BadriEmployee;
import com.example.day12_01.model.BadriEmployee;
import com.example.day12_01.repository.BadriEmployeeRepo;
BadriEmployeeService
@Service
public class BadriEmployeeService {
    @Autowired
    BadriEmployeeRepo employeeRepo;

    @SuppressWarnings("null")
    public BadriEmployee setEmployee(BadriEmployee employee)
    {
        return employeeRepo.save(employee);
    }

    public List<BadriEmployee> getInnerEmployee()
    {
        return employeeRepo.getByInnerEmployees();
    }

    public List<BadriEmployee> getLeftOuterEmployee()
    {
        return employeeRepo.getByLeftOuterEmployees();
    }
}
