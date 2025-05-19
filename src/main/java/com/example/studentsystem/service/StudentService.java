package com.example.studentsystem.service;

import com.example.studentsystem.dto.StudentDTO;
import com.example.studentsystem.entity.Student;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface StudentService {
   List<StudentDTO> getAllStudents();
   StudentDTO getStudentById(Long id);
   Student createStudent(StudentDTO studentDTO);
   Student updateStudent(Long id, StudentDTO studentDTO);
   void deleteStudent(Long id); //işlem yapsın ama geriye bir değer döndürmesn


}
