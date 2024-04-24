package com.example.relation.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.relation.model.BadriStudentInfo;

@Repository
public interface BadriStudentInfoRepository extends JpaRepository<BadriStudentInfo,Integer>{
    
}