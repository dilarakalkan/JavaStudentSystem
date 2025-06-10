package com.example.studentsystem.repository;

import com.example.studentsystem.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface StudentRepository extends JpaRepository<Student,Long> {

    Student getStudentByUserId(Long userid);
    Optional<Object> findByStudentNumber(String studentNumber);
}
