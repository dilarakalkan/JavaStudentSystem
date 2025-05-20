package com.example.studentsystem.service;

import com.example.studentsystem.dto.StudentDTO;
import com.example.studentsystem.entity.Student;

import java.util.List;


public interface StudentService {
   List<StudentDTO> getAllStudents();
   StudentDTO getStudentById(Long id);
   Student createStudent(StudentDTO studentDTO);
   Student updateStudent(StudentDTO studentDTO);
   void deleteStudent(Long id);
}

