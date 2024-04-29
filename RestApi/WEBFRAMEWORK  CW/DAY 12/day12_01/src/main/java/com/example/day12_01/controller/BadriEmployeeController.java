package com.example.day12_01.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.day12_01.model.BadriEmployee;
import com.example.day12_01.service.BadriEmployeeService;

@RestController
public class BadriEmployeeController {
    @Autowired
    BadriEmployeeService employeeService;

    @PostMapping("/employee")
    public BadriEmployee setMethod(@RequestBody BadriEmployee employee)
    {
        return employeeService.setEmployee(employee);
    }

    @GetMapping("/employees-inner-join")
    public List<BadriEmployee> getInnerMethod()
    {
        return employeeService.getInnerEmployee();
    }

    @GetMapping("/employees-left-outer-join")
    public List<BadriEmployee> getLeftMethod()
    {
        return employeeService.getLeftOuterEmployee();
    }
}
