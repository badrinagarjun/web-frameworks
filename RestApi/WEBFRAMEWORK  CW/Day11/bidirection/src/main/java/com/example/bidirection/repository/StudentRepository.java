package com.example.bidirection.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.bidirection.model.BadriStudent;



@Repository
public interface StudentRepository extends JpaRepository<BadriStudent,Integer>{
    
}
