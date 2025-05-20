package com.example.studentsystem.repository;

import com.example.studentsystem.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student,Long> {

    Student getStudentByUserId(String userid);
}
