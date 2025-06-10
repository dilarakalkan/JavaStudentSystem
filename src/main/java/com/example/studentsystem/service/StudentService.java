package com.example.studentsystem.service;

import com.example.studentsystem.dto.StudentDTO;
import com.example.studentsystem.entity.Student;
import java.util.List;
import java.util.Optional;

public interface StudentService {
    List<StudentDTO> getAllStudents();
    Optional<StudentDTO> getStudentById(Long id);
    Student createStudent(StudentDTO studentDTO);
    Student updateStudent(Long id, StudentDTO studentDTO);
    void deleteStudent(Long id);
    Optional<StudentDTO> getStudentByStudentNumber(String studentNumber);
}

