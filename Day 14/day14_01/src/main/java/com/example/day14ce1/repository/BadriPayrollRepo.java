package com.example.day14ce1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.day14ce1.model.BadriPayroll;

@Repository
public interface BadriPayrollRepo extends JpaRepository<BadriPayroll,Long> {
    
}
