package com.example.day12_01.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface BadriEmployeeRepo extends JpaRepository<BadriEmployee,Integer> {
 
    @Query(value = "SELECT e.* FROM employee e INNER JOIN address a ON e.id = a.employee_id",nativeQuery = true)
    List<BadriEmployee> getByInnerEmployees();

    @Query(value = "SELECT e.* FROM employee e LEFT JOIN address a ON e.id = a.employee_id",nativeQuery = true)
    List<BadriEmployee> getByLeftOuterEmployees();
}