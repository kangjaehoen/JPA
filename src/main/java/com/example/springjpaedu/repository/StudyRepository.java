package com.example.springjpaedu.repository;

import com.example.springjpaedu.entity.Emp;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface StudyRepository extends JpaRepository<Emp,Integer> {
    // 매개변수 1. Entity객체 2. 객체의 Primary Key 의 타입.
    public List<Emp> findByJob(String job);

}
